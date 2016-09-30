#!/bin/bash
# usage:  ./build_esmf.sh <git_tag>

cd $HOME
if [ ! -d "$HOME/esmf"  ]; then 
    git clone http://git.code.sf.net/p/esmf/esmf esmf    
fi
cd esmf
git pull
git checkout $1
export ESMF_DIR=`pwd`
export ESMF_COMM=$2
export ESMF_COMPILER=gfortran
export ESMF_INSTALL_PREFIX=$HOME/ESMF-INSTALL/$1
make -j8
make install

