# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   copyright.h
#   copyright2.h
#   libsprite/copyright2.h
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://copyright.h;md5=1a89f1b9b91808af7479ec95c87334a2"

SRC_URI = "http://localhost:8080/usertest2/xgalaga-${PV}.p.tar.gz"
SRC_URI[md5sum] = "1d04e73b1d0a43c8dc241126763d6aa1"
SRC_URI[sha1sum] = "6ad5fa505c9e1cd661dcd52c157d48ee8b615fae"
SRC_URI[sha256sum] = "7b4f4f3210399e26b89f8ac7e69e5f9aa967ec53254353795e4f9b4d292d3477"
SRC_URI[sha384sum] = "51c9bf0da29ab7f015c6dd6a1b345cdc7cca5001b9034f780ebd9001a1a13de6a59123759e6a579677e58c58d49dafff"
SRC_URI[sha512sum] = "ca89da15c23f8240a05bfc123d0293fcec0b100a66e49652729365ee6279bbb42e3f1988f76e9ea4739c351cea808ba9f7f7f415d4be11b0ba3af142132206ba"

# NOTE: the following library dependencies are unknown, ignoring: XExExt Xpm
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libxmu libxext libxt libx11"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools-brokensep

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""
DEPENDS += "libx11 libxpm libxmu"
RDEPENDS:${PN} += "libxpm"

FILES:${PN} = " \
/usr/local/bin/xgalaga-hyperspace \
/usr/local/bin/xgalaga \
/usr/local/lib/xgalaga/xgal.sndsrv.oss \
/usr/local/lib/xgalaga/CREDITS \
/usr/local/lib/xgalaga/levels \
/usr/local/lib/xgalaga/sounds \
/usr/local/lib/xgalaga/levels/level6.xgl \
/usr/local/lib/xgalaga/levels/level2.xgl \
/usr/local/lib/xgalaga/levels/level15.xgl \
/usr/local/lib/xgalaga/levels/level12.xgl \
/usr/local/lib/xgalaga/levels/level9.xgl \
/usr/local/lib/xgalaga/levels/level1.xgl \
/usr/local/lib/xgalaga/levels/level4.xgl \
/usr/local/lib/xgalaga/levels/level14.xgl \
/usr/local/lib/xgalaga/levels/level11.xgl \
/usr/local/lib/xgalaga/levels/level8.xgl \
/usr/local/lib/xgalaga/levels/level5.xgl \
/usr/local/lib/xgalaga/levels/level10.xgl \
/usr/local/lib/xgalaga/levels/level13.xgl \
/usr/local/lib/xgalaga/levels/level3.xgl \
/usr/local/lib/xgalaga/levels/level7.xgl \
/usr/local/lib/xgalaga/sounds/shield.raw \
/usr/local/lib/xgalaga/sounds/explode.raw \
/usr/local/lib/xgalaga/sounds/explode_big.raw \
/usr/local/lib/xgalaga/sounds/torphit.raw \
/usr/local/lib/xgalaga/sounds/ddloo.raw \
/usr/local/lib/xgalaga/sounds/smart.raw \
/usr/local/lib/xgalaga/sounds/warp.raw \
/usr/local/lib/xgalaga/sounds/firetorp.raw"
