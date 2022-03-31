# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://localhost:8080/usertest2/gnuchess-${PV}.tar.gz"
SRC_URI[md5sum] = "c181b5e218695a154a550292fddedc6d"
SRC_URI[sha1sum] = "98e4ef7837b84b7e1e01f4cc74e9d1831ca485e5"
SRC_URI[sha256sum] = "7776c114eeb5889dea69dc4715a3622ec57f65efab667987e7d7183cc05381a8"
SRC_URI[sha384sum] = "f7d2f634f937cb3e9a0f6cb1d0ea35513e8e9481ee003ba97904f75b3617e1a073bfe788f7771793ab4813e8c0cfc9a8"
SRC_URI[sha512sum] = "3b9bbf8999301a867f6b0e277ee01240472553d4e6dd43b9c479558b3bba687ebaa188f23cc8dbcb8656ddbd5c9511d89cf68ae717c55824f0c797460c4ab101"

# NOTE: the following prog dependencies are unknown, ignoring: cc_r
DEPENDS = "flex-native readline ncurses"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit gettext autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

FILES:${PN} += "/usr/share/games/plugins"
#INSANE_SKIP:${PN} = "installed-vs-shipped"
