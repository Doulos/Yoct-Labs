DESCRIPTION = "Say goodbye to the world"
SECTION = "console/utils"
#LICENSE = "GPL-2.0-only"

#LICENSE = "MY_LICENSE"
#LICENSE_FLAGS = "test"

LICENSE = "Beerware"

SRCREV = "1.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=60f419914bcc44d1224a21e6f3c18ac8"
SRC_URI = "file://goodbye.c \
           file://COPYING"

S = "${WORKDIR}"

LDFLAGS = "-Wl,-O1 -Wl,--hash-style=gnu -Wl,--as-needed"
TARGET_CC_ARCH += "${LDFLAGS}" 

do_compile () {
	${CC} -o goodbye goodbye.c
}

do_install () {
	install -d ${D}/${bindir}
	install -m 755 goodbye ${D}/${bindir}/goodbye
}

