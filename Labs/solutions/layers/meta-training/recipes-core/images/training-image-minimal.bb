SUMMARY = "An image recipe for training."

inherit core-image

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

CORE_IMAGE_EXTRA_INSTALL += "netcat"

IMAGE_FEATURES += "tools-sdk"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"

inherit extrausers

# doulos
PASSWD = "\$5\$JXq8Zea1w\$RwTW9M5ISeVoBgY7cSm63LmAJOgC824eZleqjFAOX42"

EXTRA_USERS_PARAMS = "\
groupadd -g 1001 newuser; \
useradd -u 1001 -p '${PASSWD}' -g newuser -d /home/newuser -m -s /bin/sh newuser; \
"

createtestfile() {
touch ${IMAGE_ROOTFS}/home/root/testfile
echo hello > ${IMAGE_ROOTFS}/home/root/testfile
}

IMAGE_PREPROCESS_COMMAND += "createtestfile; "
