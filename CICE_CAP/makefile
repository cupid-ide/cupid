# User must customize the following two make variables
INSTALLDIR=/home/$(USER)/ICE-INSTALLS/CICE_$(installdate)
LANLCICEDIR=/home/Anthony.Craig/lanl_cice

#installdate=latest
installdate := $(shell date '+%Y-%m-%d-%H-%M-%S')

ifneq ($(origin ESMFMKFILE), environment)
$(error Environment variable ESMFMKFILE was not set.)
endif
include         $(ESMFMKFILE)
ESMF_INC        = $(ESMF_F90COMPILEPATHS)
ESMF_LIB        = $(ESMF_F90LINKPATHS) $(ESMF_F90LINKRPATHS) $(ESMF_F90ESMFLINKLIBS)
UTILINCS        = -I$(LANLCICEDIR)/compile

.SUFFIXES: .F90

%.o : %.F90
	$(ESMF_F90COMPILER) -c $(ESMF_F90COMPILEOPTS) $(UTILINCS) $(ESMF_F90COMPILEPATHS) $(ESMF_F90COMPILEFREECPP) $(ESMF_F90COMPILECPPFLAGS) $<

.PRECIOUS: %.o

PWDDIR := $(shell pwd)

MAKEFILE = makefile

LIBRARY  = libcice.a

MODULES  = cice_cap.o

all default: 
	@gmake -f $(MAKEFILE) $(LIBRARY)

$(LIBRARY): $(MODULES)
	$(AR) $(ARFLAGS) $@ $?

	rm -f cice.mk.install
	@echo "# ESMF self-describing build dependency makefile fragment" > cice.mk.install
	@echo "# src location Zeus: $pwd" >> cice.mk.install
	@echo  >> cice.mk.install
	@echo "ESMF_DEP_FRONT     = cice_cap_mod" >> cice.mk.install
	@echo "ESMF_DEP_INCPATH   = $(INSTALLDIR)" >> cice.mk.install
	@echo "ESMF_DEP_CMPL_OBJS = " >> cice.mk.install
	@echo "ESMF_DEP_LINK_OBJS = $(INSTALLDIR)/libcice.a $(INSTALLDIR)/liblanl_cice.a" >> cice.mk.install
	mkdir -p $(INSTALLDIR)
	cp -f $(LANLCICEDIR)/liblanl_cice.a $(INSTALLDIR) 
	cp -f libcice.a cice_cap_mod.mod $(INSTALLDIR) 
	cp -f cice.mk.install $(INSTALLDIR)/cice.mk

clean:

	$(RM) -f $(LIBRARY) *.f90 *.o *.mod *.lst depend
