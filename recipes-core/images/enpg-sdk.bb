require recipes-core/images/voltumna-sdk.inc
require recipes-core/images/elettra-sdk.inc
require include/enpg.inc

IMAGE_INSTALL:append = ""

TOOLCHAIN_HOST_TASK:append = ""

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="Elettra Network Packet Generator (Cross Development)"
	MACHINE="${MACHINE}"
	__EOF__
}
