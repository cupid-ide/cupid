set(0, 'defaultfigurevisible', 'off');
 
for t=[1:2]
    surf(x,y,h(:,:,t));
    shading interp;
    xlabel("x");
    ylabel("y");
    zlabel("h");
    filename=sprintf("output/%05d.png", t);
    print(filename);
end
