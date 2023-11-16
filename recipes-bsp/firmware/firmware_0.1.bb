DESCRIPTION = "Provides firmware (FPGA bitstream)"
LICENSE = "CLOSED"

SRC_URI = "file://eNPG_bitstream.rbf"
SRC_URI[sha256sum] = "b1cd0c6e2446e3179bd6f5f4ae86842c0f44e3c99922b1069fedbdd506c91b62"

do_install() {
	install -d -m 0755 ${D}${libdir}/firmware
	install -m 0644 ${WORKDIR}/eNPG_bitstream.rbf \
		${D}${libdir}/firmware/bitstream.rbf
}

