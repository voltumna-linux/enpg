require recipes-core/images/voltumna-sre.inc
require include/enpg.inc

append_to_osrelease() {
	cat <<-__EOF__ >> ${IMAGE_ROOTFS}/etc/os-release
	VARIANT_ID="${BPN}"
	VARIANT="Elettra Network Packet Generator (Runtime)"
	MACHINE="${MACHINE}"
	__EOF__
}
