package me.weigui.kernelsu.profile

/**
 * https://cs.android.com/android/platform/superproject/main/+/main:system/core/libcutils/include/private/android_filesystem_config.h
 * @author weishu
 * @date 2023/6/3.
 */
enum class Groups(val gid: Int, val display: String, val desc: String) {
    ROOT(0, "root", "traditional unix root user"),
    DAEMON(1, "daemon", "Traditional unix daemon owner."),
    BIN(2, "bin", "Traditional unix binaries owner."),
    SYS(3, "sys", "A group with the same gid on Linux/macOS/Android."),
    SYSTEM(1000, "system", "system server"),
    RADIO(1001, "radio", "telephony subsystem, RIL"),
    BLUETOOTH(1002, "bluetooth", "bluetooth subsystem"),
    GRAPHICS(1003, "graphics", "graphics devices"),
    INPUT(1004, "input", "input devices"),
    AUDIO(1005, "audio", "audio devices"),
    CAMERA(1006, "camera", "camera devices"),
    LOG(1007, "log", "log devices"),
    COMPASS(1008, "compass", "compass device"),
    MOUNT(1009, "mount", "mountd socket"),
    WIFI(1010, "wifi", "wifi subsystem"),
    ADB(1011, "adb", "android debug bridge (adbd)"),
    INSTALL(1012, "install", "group for installing packages"),
    MEDIA(1013, "media", "mediaserver process"),
    DHCP(1014, "dhcp", "dhcp client"),
    SDCARD_RW(1015, "sdcard_rw", "external storage write access"),
    VPN(1016, "vpn", "vpn system"),
    KEYSTORE(1017, "keystore", "keystore subsystem"),
    USB(1018, "usb", "USB devices"),
    DRM(1019, "drm", "DRM server"),
    MDNSR(1020, "mdnsr", "MulticastDNSResponder (service discovery)"),
    GPS(1021, "gps", "GPS daemon"),
    UNUSED1(1022, "unused1", "deprecated, DO NOT USE"),
    MEDIA_RW(1023, "media_rw", "internal media storage write access"),
    MTP(1024, "mtp", "MTP USB driver access"),
    UNUSED2(1025, "unused2", "deprecated, DO NOT USE"),
    DRMRPC(1026, "drmrpc", "group for drm rpc"),
    NFC(1027, "nfc", "nfc subsystem"),
    SDCARD_R(1028, "sdcard_r", "external storage read access"),
    CLAT(1029, "clat", "clat part of nat464"),
    LOOP_RADIO(1030, "loop_radio", "loop radio devices"),
    MEDIA_DRM(1031, "media_drm", "MediaDrm plugins"),
    PACKAGE_INFO(1032, "package_info", "access to installed package details"),
    SDCARD_PICS(1033, "sdcard_pics", "external storage photos access"),
    SDCARD_AV(1034, "sdcard_av", "external storage audio/video access"),
    SDCARD_ALL(1035, "sdcard_all", "access all users external storage"),
    LOGD(1036, "logd", "log daemon"),
    SHARED_RELRO(1037, "shared_relro", "creator of shared GNU RELRO files"),
    DBUS(1038, "dbus", "dbus-daemon IPC broker process"),
    TLSDATE(1039, "tlsdate", "tlsdate unprivileged user"),
    MEDIA_EX(1040, "media_ex", "mediaextractor process"),
    AUDIOSERVER(1041, "audioserver", "audioserver process"),
    METRICS_COLL(1042, "metrics_coll", "metrics_collector process"),
    METRICSD(1043, "metricsd", "metricsd process"),
    WEBSERV(1044, "webserv", "webservd process"),
    DEBUGGERD(1045, "debuggerd", "debuggerd unprivileged user"),
    MEDIA_CODEC(1046, "media_codec", "media_codec process"),
    CAMERASERVER(1047, "cameraserver", "cameraserver process"),
    FIREWALL(1048, "firewall", "firewall process"),
    TRUNKS(1049, "trunks", "trunksd process"),
    NVRAM(1050, "nvram", "nvram daemon"),
    DNS(1051, "dns", "DNS resolution daemon (system: netd)"),
    DNS_TETHER(1052, "dns_tether", "DNS resolution daemon (tether: dnsmasq)"),
    WEBVIEW_ZYGOTE(1053, "webview_zygote", "WebView zygote process"),
    VEHICLE_NETWORK(1054, "vehicle_network", "Vehicle network service"),
    MEDIA_AUDIO(1055, "media_audio", "GID for audio files on internal media storage"),
    MEDIA_VIDEO(1056, "media_video", "GID for video files on internal media storage"),
    MEDIA_IMAGE(1057, "media_image", "GID for image files on internal media storage"),
    TOMBSTONED(1058, "tombstoned", "tombstoned user"),
    MEDIA_OBB(1059, "media_obb", "GID for OBB files on internal media storage"),
    ESE(1060, "ese", "embedded secure element (eSE) subsystem"),
    OTA_UPDATE(1061, "ota_update", "resource tracking UID for OTA updates"),
    AUTOMOTIVE_EVS(1062, "automotive_evs", "Automotive rear and surround view system"),
    LOWPAN(1063, "lowpan", "LoWPAN subsystem"),
    HSM(1064, "lowpan", "hardware security module subsystem"),
    RESERVED_DISK(1065, "reserved_disk", "GID that has access to reserved disk space"),
    STATSD(1066, "statsd", "statsd daemon"),
    INCIDENTD(1067, "incidentd", "incidentd daemon"),
    SECURE_ELEMENT(1068, "secure_element", "secure element subsystem"),
    LMKD(1069, "lmkd", "low memory killer daemon"),
    LLKD(1070, "llkd", "live lock daemon"),
    IORAPD(1071, "iorapd", "input/output readahead and pin daemon"),
    GPU_SERVICE(1072, "gpu_service", "GPU service daemon"),
    NETWORK_STACK(1073, "network_stack", "network stack service"),
    GSID(1074, "GSID", "GSI service daemon"),
    FSVERITY_CERT(1075, "fsverity_cert", "fs-verity key ownership in keystore"),
    CREDSTORE(1076, "credstore", "identity credential manager service"),
    EXTERNAL_STORAGE(1077, "external_storage", "Full external storage access including USB OTG volumes"),
    EXT_DATA_RW(1078, "ext_data_rw", "GID for app-private data directories on external storage"),
    EXT_OBB_RW(1079, "ext_obb_rw", "GID for OBB directories on external storage"),
    CONTEXT_HUB(1080, "context_hub", "GID for access to the Context Hub"),
    VIRTUALIZATIONSERVICE(1081, "virtualizationservice", "VirtualizationService daemon"),
    ARTD(1082, "artd", "ART Service daemon"),
    UWB(1083, "uwb", "UWB subsystem"),
    THREAD_NETWORK(1084, "thread_network", "Thread Network subsystem"),
    DICED(1085, "diced", "Android's DICE daemon"),
    DMESGD(1086, "dmesgd", "dmesg parsing daemon for kernel report collection"),
    JC_WEAVER(1087, "jc_weaver", "Javacard Weaver HAL - to manage omapi ARA rules"),
    JC_STRONGBOX(1088, "jc_strongbox", "Javacard Strongbox HAL - to manage omapi ARA rules"),
    JC_IDENTITYCRED(1089, "jc_identitycred", "Javacard Identity Cred HAL - to manage omapi ARA rules"),
    SDK_SANDBOX(1090, "sdk_sandbox", "SDK sandbox virtual UID"),
    SECURITY_LOG_WRITER(1091, "security_log_writer", "write to security log"),
    PRNG_SEEDER(1092, "prng_seeder", "PRNG seeder daemon"),

    SHELL(2000, "shell", "adb and debug shell user"),
    CACHE(2001, "cache", "cache access"),
    DIAG(2002, "diag", "access to diagnostic resources"),

    /* The 3000 series are intended for use as supplemental group id's only.
     * They indicate special Android capabilities that the kernel is aware of. */
    NET_BT_ADMIN(3001, "net_bt_admin", "bluetooth: create any socket"),
    NET_BT(3002, "net_bt", "bluetooth: create sco, rfcomm or l2cap sockets"),
    INET(3003, "inet", "can create AF_INET and AF_INET6 sockets"),
    NET_RAW(3004, "net_raw", "can create raw INET sockets"),
    NET_ADMIN(3005, "net_admin", "can configure interfaces and routing tables."),
    NET_BW_STATS(3006, "net_bw_stats", "read bandwidth statistics"),
    NET_BW_ACCT(3007, "net_bw_acct", "change bandwidth statistics accounting"),
    NET_BT_STACK(3008, "net_bt_stack", "access to various bluetooth management functions"),
    READPROC(3009, "readproc", "Allow /proc read access"),
    WAKELOCK(3010, "wakelock", "Allow system wakelock read/write access"),
    UHID(3011, "uhid", "Allow read/write to /dev/uhid node"),
    READTRACEFS(3012, "readtracefs", "Allow tracefs read"),

    EVERYBODY(9997, "everybody", "Shared external storage read/write"),
    MISC(9998, "misc", "Access to misc storage"),
    NOBODY(9999, "nobody", "Reserved"),
    APP(10000, "app", "Access to app data"),
}