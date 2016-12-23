#!/bin/bash

cd $HOME
if [ ! -d "$HOME/openmpi-1.8.8-install/bin"  ]; then 
    curl "https://www.open-mpi.org/software/ompi/v1.8/downloads/openmpi-1.8.8.tar.gz" -o "openmpi-1.8.8.tar.gz"
    which tar
    tar zxf openmpi-1.8.8.tar.gz 
    cd openmpi-1.8.8
    ./configure CC=gcc CXX=g++ F77=gfortran FC=gfortran --prefix=$HOME/openmpi-1.8.8-install > configure.out.txt
    make -j4 all > make.out.txt
    make install
fi
#export PATH=$HOME/openmpi-1.8.8-install/bin:$PATH
