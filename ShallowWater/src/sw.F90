! Shallow Water Model
!
! This code is based on a Matlab code by Robin Hogan:
! http://www.met.reading.ac.uk/~swrhgnrj/shallow_water_model/
!
! The Matlab has essentially been transcribed into Fortran, retaining
! the same numerics, parameters, and code structure.
!
! Author: Rocky Dunlap

program sw

    implicit none

    ! interface for function to find mean of values in an array
    interface
        function mean(arr)
            real(8), intent(inout), dimension(:) :: arr
            real(8) :: mean
        end function
    end interface

    !!!!!!!!!!!!!!!!!!!!!!!!
    ! Section 0: Constants !
    !!!!!!!!!!!!!!!!!!!!!!!!

    ! Possible initial conditions of the height field
    integer, parameter :: UNIFORM_WESTERLY = 1
    integer, parameter :: ZONAL_JET = 2
    integer, parameter :: REANALYSIS = 3
    integer, parameter :: GAUSSIAN_BLOB = 4
    integer, parameter :: STEP = 5
    integer, parameter :: CYCLONE_IN_WESTERLY = 6
    integer, parameter :: SHARP_SHEAR = 7
    integer, parameter :: EQUATORIAL_EASTERLY = 8
    integer, parameter :: SINUSOIDAL = 9

    ! Possible orographies
    integer, parameter :: FLAT = 0
    integer, parameter :: SLOPE = 1
    integer, parameter :: GAUSSIAN_MOUNTAIN = 2
    integer, parameter :: EARTH_OROGRAPHY = 3
    integer, parameter :: SEA_MOUNT = 4

    !!!!!!!!!!!!!!!!!!!!!!!!!
    ! Section 1: Parameters !
    !!!!!!!!!!!!!!!!!!!!!!!!!

    real(8), parameter :: g = 9.81         ! Acceleration due to gravity (m/s2)
    real(8), parameter :: f = 1.0e-4       ! Coriolis parameter (s-1)
    real(8), parameter :: beta = 1.6e-11   ! Meridional gradient of f (s-1m-1)

    real(8), parameter :: dt_mins = 1                  ! Timestep (minutes)
    real(8), parameter :: output_interval_mins = 60    ! Time between outputs (minutes)
    real(8), parameter :: forecast_length_days = 4     ! Total simulation length (days)

    real(8), parameter :: orography = FLAT
    real(8), parameter :: initial_conditions = GAUSSIAN_BLOB
    logical, parameter :: initially_geostrophic = .false.
    logical, parameter :: add_random_height_noise = .false.

    ! If you change the number of gridpoints then orography=EARTH_OROGRAPHY
    ! or initial_conditions=REANALYSIS won't work
    integer, parameter :: nx = 254      ! Number of zonal gridpoints
    integer, parameter :: ny = 50       ! Number of meridional gridpoints

    real(8), parameter :: dx=100.0e3       ! Zonal grid spacing (m)
    integer, parameter :: dy=dx          ! Meridional grid spacing

    ! Specify the range of heights to plot in metres
    !plot_height_range = [9500 10500];



    !!!!!!!!!!!!!!!!!!!!!!!!!
    ! Section 2: Setup      !
    !!!!!!!!!!!!!!!!!!!!!!!!!

    integer :: i
    real(8) :: r
    integer :: n    ! current timestep

    real(8), parameter :: dt = dt_mins * 60.0       ! Timestep (s)
    real(8), parameter :: output_interval = output_interval_mins * 60.0        ! Time between outputs (s)
    real(8), parameter :: forecast_length = forecast_length_days * 24.0 * 3600.0   ! Forecast length (s)

    integer, parameter :: nt = floor(forecast_length/dt) + 1     ! Number of timesteps
    integer, parameter :: timesteps_between_outputs = floor(output_interval/dt)
    integer, parameter :: noutput = ceiling(1.0 * nt / timesteps_between_outputs) ! Number of output frames

    real(8), dimension(nx) :: x             ! Zonal distance coordinate (m)
    real(8), dimension(ny) :: y             ! Meridional distance coordinate (m)
    real(8), dimension(nx, ny) :: XCoord    ! Matrix of coordinate variables
    real(8), dimension(nx, ny) :: YCoord    ! Matrix of coordinate variables
    real(8), dimension(nx, ny) :: ORO       ! Orography field
    real(8), dimension(nx, ny) :: height    ! height of fluid
    real(8), dimension(nx, ny) :: FCor      ! Coriolis parameter as a matrix of values varying in y only
    real(8), dimension(nx, ny) :: u         ! wind velocity (m/s)
    real(8), dimension(nx, ny) :: v         ! wind velocity (m/s)
    real(8), dimension(nx, ny) :: h         ! depth of fluid (height - ORO)

    real(8), dimension(nx * ny) :: u_temp
    real(8), dimension(nx * ny) :: v_temp

    real(8), dimension(nx, ny, noutput) :: u_save    ! save u data
    real(8), dimension(nx, ny, noutput) :: v_save    ! save v data
    real(8), dimension(nx, ny, noutput) :: h_save    ! save h data
    real(8), dimension(noutput) :: t_save    ! save t data


    real(8) :: std_blob     ! Standard deviation of blob (m), orography = GAUSSIAN_BLOB
    real(8) :: max_u        ! max wind velocity
    integer :: i_save       ! index of saved field data

    x = (/ (i, i=0, nx-1) /) * dx
    y = (/ (i, i=0, ny-1) /) * dy

    do i=1,ny
        XCoord(:,i) = x
    end do

    do i=1,nx
        YCoord(i,:) = y
    end do

    !print *, "nt=", nt
    !print *, "timesteps_between_outputs=", timesteps_between_outputs
    !print *, "noutput=", noutput

    !print *, "x=",x
    !print *, "y=", y
    !print *, "XCoord=", XCoord(:,1)
    !print *, "YCoord=", YCoord(1,:)
    !print *, "sum(x) = ", sum(x)
    !print *, "size(x) = ", size(x)
    !print *, "mean(x) = ", mean(x)
    !print *, "mean(y) = ", mean(y)

    if (orography == FLAT) then
        ORO = 0.0
    else
        print *, "That orography parameter setting is currently not supported."
        stop
    end if

    !print *, "H=", H

!% Create the orography field "H"
!switch orography
!  case FLAT
!    H = zeros(nx, ny);
!  case SLOPE
!    H = 9000.*2.*abs((mean(x)-X)./max(x));
!  case GAUSSIAN_MOUNTAIN
!    std_mountain_x = 5.*dx; % Std. dev. of mountain in x direction (m)
!    std_mountain_y = 5.*dy; % Std. dev. of mountain in y direction (m)
!    H = 4000.*exp(-0.5.*((X-mean(x))./std_mountain_x).^2 ...
!                  -0.5.*((Y-mean(y))./std_mountain_y).^2);
!  case SEA_MOUNT
!    std_mountain = 40.0.*dy; % Standard deviation of mountain (m)
!    H = 9250.*exp(-((X-mean(x)).^2+(Y-0.5.*mean(y)).^2)./(2*std_mountain^2));
!  case EARTH_OROGRAPHY
!    load digital_elevation_map.mat
!    H = elevation;
!    % Enforce periodic boundary conditions in x
!    H([1 end],:)=H([end-1 2],:);
! otherwise
!   error(['Don''t know what to do with orography=' num2str(orography)]);
!end
!

    if (initial_conditions == GAUSSIAN_BLOB) then
        std_blob = 8.0 * dy     ! Standard deviation of blob (m)
        height = 9750 + 1000 * exp(-((XCoord-0.25*mean(x))**2 + (YCoord - mean(y))**2) / (2 * std_blob**2))
        !print *, "height=", height(:,1)
    else
        print *, "That initial_conditions parameter setting is currently not supported."
        stop
    end if

!% Create the initial height field
!switch initial_conditions
!  case UNIFORM_WESTERLY
!    mean_wind_speed = 20; % m/s
!    height = 10000-(mean_wind_speed*f/g).*(Y-mean(y));
!  case SINUSOIDAL
!    height = 10000-350.*cos(Y./max(y).*4.*pi);
!  case EQUATORIAL_EASTERLY
!    height = 10000 - 50.*cos((Y-mean(y)).*4.*pi./max(y));
!  case ZONAL_JET
!    height = 10000 - tanh(20.0.*((Y-mean(y))./max(y))).*400;
!  case REANALYSIS
!    load reanalysis.mat
!    height = 0.99.*pressure./g;
! case GAUSSIAN_BLOB
!   std_blob = 8.0.*dy; % Standard deviation of blob (m)
!   height = 9750 + 1000.*exp(-((X-0.25.*mean(x)).^2+(Y-mean(y)).^2)./(2* ...
!                                                     std_blob^2));
! case STEP
!  height = 9750.*ones(nx, ny);
!  height(find(X<max(x)./5 & Y>max(y)/10 & Y<max(y).*0.9)) = 10500;
! case CYCLONE_IN_WESTERLY
!   mean_wind_speed = 20; % m/s
!   std_blob = 7.0.*dy; % Standard deviation of blob (m)
!    height = 10000-(mean_wind_speed*f/g).*(Y-mean(y)) ...
!       - 500.*exp(-((X-0.5.*mean(x)).^2+(Y-mean(y)).^2)./(2*std_blob^2));
!    max_wind_speed = 20; % m/s
!    height = 10250-(max_wind_speed*f/g).*(Y-mean(y)).^2./max(y) ...
!       - 1000.*exp(-(0.25.*(X-1.5.*mean(x)).^2+(Y-0.5.*mean(y)).^2)./(2*std_blob^2));
!  case SHARP_SHEAR
!    mean_wind_speed = 50; % m/s
!    height = (mean_wind_speed*f/g).*abs(Y-mean(y));
!    height = 10000+height-mean(height(:));
!otherwise
!   error(['Don''t know what to do with initial_conditions=' num2str(initial_conditions)]);
!end
!
!

    ! Coriolis parameter as a matrix of values varying in y only
    FCor = f + (beta * (YCoord - mean(y)))
    !print *, "FCor=", FCor(:,10)

    ! Initialize the wind to rest
    u = 0.0
    v = 0.0

    !print *, "u=", u
    !print *, "maxval(u)=", maxval(reshape(u, (/ nx*ny /)))

    ! We may need to add small-amplitude random noise in order to initialize
    ! instability
    if (add_random_height_noise) then
        !  height = height + 1.0.*randn(size(height)).*(dx./1.0e5).*(abs(F)./1e-4);
        print *, "The add_random_height_noise parameter is not currently supported."
    end if
!
!
!if initially_geostrophic
!   % Centred spatial differences to compute geostrophic wind
!   u(:,2:end-1) = -(0.5.*g./(F(:,2:end-1).*dx)) ...
!       .* (height(:,3:end)-height(:,1:end-2));
!   v(2:end-1,:) = (0.5.*g./(F(2:end-1,:).*dx)) ...
!       .* (height(3:end,:)-height(1:end-2,:));
!   % Zonal wind is periodic so set u(1) and u(end) as dummy points that
!   % replicate u(end-1) and u(2), respectively
!   u([1 end],:) = u([2 end-1],:);
!   % Meridional wind must be zero at the north and south edges of the
!   % channel
!   v(:,[1 end]) = 0;
!
!   % Don't allow the initial wind speed to exceed 200 m/s anywhere
!   max_wind = 200;
!   u(find(u>max_wind)) = max_wind;
!   u(find(u<-max_wind)) = -max_wind;
!   v(find(v>max_wind)) = max_wind;
!   v(find(v<-max_wind)) = -max_wind;
!end

    if (initially_geostrophic) then
        print *, "The initially_geostrophic parameter is not currently supported."
    end if

    ! Define h as the depth of the fluid (whereas "height" is the height of
    ! the upper surface)
    h = height - ORO
    !print *, "h=", h(1,:)

    ! Initialize the 3D arrays where the output data will be stored
    u_save = 0.0
    v_save = 0.0
    h_save = 0.0
    t_save = 0.0

    ! Index to stored data
    i_save = 1


    !!!!!!!!!!!!!!!!!!!!!!!!!
    ! Section 2: Main loop  !
    !!!!!!!!!!!!!!!!!!!!!!!!!


    do n=1, nt
        !  Every fixed number of timesteps we store the fields

         if (mod(n-1, timesteps_between_outputs) == 0) then
            !    max_u = sqrt(max(u(:).*u(:)+v(:).*v(:)));
            u_temp = reshape(u, (/nx*ny/))
            v_temp = reshape(v, (/nx*ny/))
            max_u = sqrt(maxval(u_temp*u_temp + v_temp*v_temp))
!    disp(['Time = ' num2str((n-1)*dt/3600) ...
!      ' hours (max ' num2str(forecast_length_days*24) ...
!           '); max(|u|) = ' num2str(max_u)]);

            print *, "Time = ", (n-1)*dt/3600, " hours (max ", forecast_length_days*24, ") max(|u|) = ", max_u
            u_save(:,:,i_save) = u
            v_save(:,:,i_save) = v
            h_save(:,:,i_save) = h
            t_save(i_save) = (n-1) * dt
            i_save = i_save + 1


        end if
!
!  % Compute the accelerations
!  u_accel = F(2:end-1,2:end-1).*v(2:end-1,2:end-1) ...
!              - (g/(2*dx)).*(H(3:end,2:end-1)-H(1:end-2,2:end-1));
!  v_accel = -F(2:end-1,2:end-1).*u(2:end-1,2:end-1) ...
!              - (g/(2*dy)).*(H(2:end-1,3:end)-H(2:end-1,1:end-2));
!
!  % Call the Lax-Wendroff scheme to move forward one timestep
!  [unew, vnew, h_new] = lax_wendroff(dx, dy, dt, g, u, v, h, ...
!                                     u_accel, v_accel);
!
!  % Update the wind and height fields, taking care to enforce
!  % boundary conditions
!  u = unew([end 1:end 1],[1 1:end end]);
!  v = vnew([end 1:end 1],[1 1:end end]);
!  v(:,[1 end]) = 0;
!  h(:,2:end-1) = h_new([end 1:end 1],:);
!
!end

    end do







end program sw

function mean(arr)
    real(8), intent(inout), dimension(:) :: arr
    real(8) :: mean
    mean = sum(arr) / size(arr)
end function



