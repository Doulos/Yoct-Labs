DESCRIPTION = "Say hello to the world"
SECTION = "console/utils"
LICENSE = "GPL-2.0-only"
SRCREV = "1.0"

LIC_FILES_CHKSUM = "file://COPYING;md5=60f419914bcc44d1224a21e6f3c18ac8"
SRC_URI = "file://hello-world.c \
           file://COPYING"

S = "${WORKDIR}"

LDFLAGS = "-Wl,-O1 -Wl,--hash-style=gnu -Wl,--as-needed"
TARGET_CC_ARCH += "${LDFLAGS}" 

do_compile () {
	${CC} -o hello-world hello-world.c
}

do_install () {
	install -d ${D}/${bindir}
	install -m 755 hello-world ${D}/${bindir}/hello-world
}


python () {
    ret = d.getVar("MACHINE", expand=True)
    bb.note("Anonymous message")
    bb.note("This build is for machine %s.\n" % ret)
    bb.warn ("Testing warning messages")
    bb.error ("Testing error messages")
    #bb.fatal ("testing fatal messages")
    #bb.debug (1, "Testing debug messages")
    bb.debug (2, "Doulos Hello-World: Testing debug messages")
}

do_info () {
    echo "Shell message: Machine is ${MACHINE} \n"
}
addtask do_info before do_compile

MYTEST = "default"
MYTEST:qemuarm64 = "override value for QEMUARM64"
MYTEST:poky = "override value for POKY"

MYVAR1 = "2"
MYVAR1 ??= "3"
MYVAR2 ??= "1"
MYVAR2 ??= "2"
MYVAR3 ?= "2"
MYVAR3 ??= "3"


MYFEATURES = "a"
MYFEATURES += "b"
MYFEATURES += "c"

MYVAR = "${@bb.utils.contains("MYFEATURES", "c", "c is there", "c is not there", d)}"

inherit myclass
TEST = "1"

do_taskA() {
    if [ ${TEST} = 1 ] ; then
        myclass_do_taskA
    else
        echo "goodbye world from recipe"
    fi
}
addtask do_taskA
