package xyz.asurily.model;

public class AndroidPushInfo {
    private String uuid;

    private String address;

    private String hardware;

    private Integer sdkInt;

    private String fingerprint;

    private String manufacturer;

    private String baseOs;

    private String meid;

    private String imei;

    private String androidId;

    private String version;

    private String channel;

    private String errorMsg;

    private String googleVersion;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware == null ? null : hardware.trim();
    }

    public Integer getSdkInt() {
        return sdkInt;
    }

    public void setSdkInt(Integer sdkInt) {
        this.sdkInt = sdkInt;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint == null ? null : fingerprint.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getBaseOs() {
        return baseOs;
    }

    public void setBaseOs(String baseOs) {
        this.baseOs = baseOs == null ? null : baseOs.trim();
    }

    public String getMeid() {
        return meid;
    }

    public void setMeid(String meid) {
        this.meid = meid == null ? null : meid.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId == null ? null : androidId.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getGoogleVersion() {
        return googleVersion;
    }

    public void setGoogleVersion(String googleVersion) {
        this.googleVersion = googleVersion == null ? null : googleVersion.trim();
    }
}