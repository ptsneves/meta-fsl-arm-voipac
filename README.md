# meta-fsl-arm-voipac
Fork from Freescale Yocto Project Community BSP

## Add Voipac meta layer into BSP
    source voipac-setup.sh

## Using it with meta-freescale
Add this layer to your conf/bblayers.conf and it should work out of the
box. No need for the crazy repo procedure in the original voipac layer.
The conf/bblayers should have the meta-freescale layer path. meta-freescale
should be at the same Yocto release as the branch of this layer.

The images produced .wic cards contrary to the default sdcard ones.

## Supported machines <machine name>
    imx6-openrexbasic
    imx6-openrexmax
    imx6-openrexultra
    imx6-rexbasic
    imx6-rexpro
    imx6-rexultra
    imx6-tinyrexlite
    imx6-tinyrexbasic
    imx6-tinyrexpro
    imx6-tinyrexmax
    imx6-tinyrexmax4g
    imx6-tinyrexultra

## Setup and Build Console image
    MACHINE=<machine name> bitbake core-image-base

## Setup and Build Toolchain    
    MACHINE=<machine name> bitbake core-image-base -c populate_sdk
    
## Setup and Build FSL GUI image
    DISTRO=<distro name> MACHINE=<machine name> source fsl-setup-release.sh -b build-x11
    DISTRO=<distro name> MACHINE=<machine name> bitbake fsl-image-gui

