# Makefile for Shallow Water Model

INCLUDES := -I$(shell nc-config --includedir)
LIBS := $(shell nc-config --flibs)
FLAGS := $(shell nc-config --fflags)

sw:	sw.o
	gfortran $(FLAGS) -o sw sw.o $(LIBS)

sw.o:	sw.F90
	gfortran -Wall $(FLAGS) -O -c sw.F90