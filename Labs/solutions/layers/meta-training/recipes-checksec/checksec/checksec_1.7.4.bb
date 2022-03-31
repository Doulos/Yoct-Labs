# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Tool to check system for binary-hardening"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE.txt
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5bb0d06223ae3b075dbcf2247a3eb9ff"

SRC_URI = "http://localhost:8080/checksec.sh-master.zip"
SRC_URI[md5sum] = "ac8cd5628bc8c99857848c0c203f1c81"
SRC_URI[sha1sum] = "d069f62faa2976fc1246be8848e4fe59ec14f8bf"
SRC_URI[sha256sum] = "5f4518529ad5e728b7fcebe987eb4e93fa6dbbe89e9ecc7adb8a8f002766b3e8"
SRC_URI[sha384sum] = "f717de416009523cc84b72d0b6a988de8d54a220e93ae2eab1f2656858ccc440b9bbfc281d8116eea201230785db8610"
SRC_URI[sha512sum] = "7b450b81dd5c797b45a31ba4d1cc1ab2047704a70ddc8475b51809813a381d373da65e2e86c59575282073a79d2abe8d3b7029418848e563b525aa8029f712bb"

S = "${WORKDIR}/${BPN}.sh-master"

RDEPENDS:${PN} = "binutils"

# NOTE: spec file indicates the license may be "BSD"
# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
        # Specify install commands here
        install -d ${D}${bindir}
        install -m 0755 ${S}/checksec ${D}${bindir}
}

