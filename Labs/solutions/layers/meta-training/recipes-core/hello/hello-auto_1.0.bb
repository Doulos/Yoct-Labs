# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://localhost:8080/usertest2/hello-auto-${PV}.tgz"
SRC_URI[md5sum] = "96b7ad33931bbddcc127d0b3b46a1ca5"
SRC_URI[sha1sum] = "e55cf6660418b8cdb25d2e6161e5bac2e72e90fd"
SRC_URI[sha256sum] = "5db241dfbfcfb218922aeee27a9503a2e1564fd3079ee13c4f533df332f17bf2"
SRC_URI[sha384sum] = "c0967557de4691ba2271d38463349f0e691b4e81df1d2459ef7bd1ee45febd1c9b264c7bfa0752065e29552cfeaecb33"
SRC_URI[sha512sum] = "ca7f55316b1e93a7562ba9ced72d782a94688db8c33861642925b44fafe3d5d17d37bbac1039d90c02531c4a9edf18abf326d79752c4f7ee7b651ab38fb64162"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

BBCLASSEXTEND = "native nativesdk"
