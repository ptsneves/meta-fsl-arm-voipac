require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for imx6 TinyRex/Rex boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"
COMPATIBLE_MACHINE = "(imx6-openrexbasic|imx6-openrexmax|imx6-openrexmax4g|imx6-openrexultra|imx6-tinyrexlite|imx6-tinyrexbasic|imx6-tinyrexpro|imx6-tinyrexmax|imx6-tinyrexmax4g|imx6-tinyrexultra|imx6-rexbasic|imx6-rexpro|imx6-rexultra)"

PROVIDES += "u-boot"

PV = "v2015.04"

SRCBRANCH = "uboot-imx-v2015.04"
SRCREV = "774cbf4de7fb17076a7ada21ed48cde0b590e246"
UBOOT_SRC ?= "git://github.com/voipac/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRC_URI += "file://0002-Add-compiler-gcc7.h-header-file.patch"

S = "${WORKDIR}/git"

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
