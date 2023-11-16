require recipes-core/images/voltumna-sde.bb
require include/enpg.inc

IMAGE_INSTALL:append = ""

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="Elettra Network Packet Generator (Development)"
	MACHINE="${MACHINE}"
	__EOF__
}
