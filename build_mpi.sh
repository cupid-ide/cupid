#!/bin/bash

cd $HOME
### 1.8.8
#if [ ! -d "$HOME/openmpi-1.8.8-install/bin"  ]; then 
#    curl "https://www.open-mpi.org/software/ompi/v1.8/downloads/openmpi-1.8.8.tar.gz" -o "openmpi-1.8.8.tar.gz"
#    which tar
#    tar zxf openmpi-1.8.8.tar.gz 
#    cd openmpi-1.8.8
#    ./configure CC=gcc CXX=g++ F77=gfortran FC=gfortran --prefix=$HOME/openmpi-1.8.8-install > configure.out.txt
#    make -j4 all > make.out.txt
#    make install
#fi

### 1.10.7
if [ ! -d "$HOME/openmpi-1.10.7-install/bin"  ]; then 
    curl "https://www.open-mpi.org/software/ompi/v1.10/downloads/openmpi-1.10.7.tar.gz" -o "openmpi-1.10.7.tar.gz"
    which tar
    tar zxf openmpi-1.10.7.tar.gz 
    cd openmpi-1.10.7
    ./configure CC=gcc CXX=g++ F77=gfortran FC=gfortran --prefix=$HOME/openmpi-1.10.7-install > configure.out.txt
    make -j4 all > make.out.txt
    make install
fi

### 2.1.2
#if [ ! -d "$HOME/openmpi-2.1.2-install/bin"  ]; then 
#    curl "https://www.open-mpi.org/software/ompi/v2.1/downloads/openmpi-2.1.2.tar.gz" -o "openmpi-2.1.2.tar.gz"
#    which tar
#    tar zxf openmpi-2.1.2.tar.gz 
#    cd openmpi-2.1.2
#    ./configure CC=gcc CXX=g++ F77=gfortran FC=gfortran --prefix=$HOME/openmpi-2.1.2-install > configure.out.txt
#    make -j4 all > make.out.txt
#    make install
#fi


