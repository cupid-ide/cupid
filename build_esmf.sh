#!/bin/bash

cd $HOME
git clone http://git.code.sf.net/p/esmf/esmf esmf
cd esmf
git checkout ESMF_7_0_0_beta_snapshot_59
export ESMF_DIR=`pwd`
export ESMF_COMM=openmpi
export ESMF_COMPILER=gfortran
export ESMF_INSTALL_PREFIX=$HOME/ESMF-INSTALL
make -j4
make install
export ESMFMKFILE=$ESMF_INSTALL_PREFIX/lib/libO/Linux.gfortran.64.openmpi.default/esmf.mk
