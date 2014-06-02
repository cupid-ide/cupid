# Makefile for Shallow Water Model

sw:	sw.o
	gfortran -g -o sw sw.o

sw.o:	sw.F90
	gfortran -Wall -g -O -c sw.F90