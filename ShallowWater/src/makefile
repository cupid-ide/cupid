# Makefile for Shallow Water Model

sw:	sw.o
	gfortran -o sw sw.o

sw.o:	sw.F90
	gfortran -O -c sw.F90