package xyz.asurily.model;

import java.util.ArrayList;
import java.util.List;

public class AndroidPushInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AndroidPushInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHardwareIsNull() {
            addCriterion("hardware is null");
            return (Criteria) this;
        }

        public Criteria andHardwareIsNotNull() {
            addCriterion("hardware is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareEqualTo(String value) {
            addCriterion("hardware =", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotEqualTo(String value) {
            addCriterion("hardware <>", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareGreaterThan(String value) {
            addCriterion("hardware >", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareGreaterThanOrEqualTo(String value) {
            addCriterion("hardware >=", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareLessThan(String value) {
            addCriterion("hardware <", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareLessThanOrEqualTo(String value) {
            addCriterion("hardware <=", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareLike(String value) {
            addCriterion("hardware like", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotLike(String value) {
            addCriterion("hardware not like", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareIn(List<String> values) {
            addCriterion("hardware in", values, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotIn(List<String> values) {
            addCriterion("hardware not in", values, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareBetween(String value1, String value2) {
            addCriterion("hardware between", value1, value2, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotBetween(String value1, String value2) {
            addCriterion("hardware not between", value1, value2, "hardware");
            return (Criteria) this;
        }

        public Criteria andSdkIntIsNull() {
            addCriterion("sdk_int is null");
            return (Criteria) this;
        }

        public Criteria andSdkIntIsNotNull() {
            addCriterion("sdk_int is not null");
            return (Criteria) this;
        }

        public Criteria andSdkIntEqualTo(Integer value) {
            addCriterion("sdk_int =", value, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntNotEqualTo(Integer value) {
            addCriterion("sdk_int <>", value, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntGreaterThan(Integer value) {
            addCriterion("sdk_int >", value, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdk_int >=", value, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntLessThan(Integer value) {
            addCriterion("sdk_int <", value, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntLessThanOrEqualTo(Integer value) {
            addCriterion("sdk_int <=", value, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntIn(List<Integer> values) {
            addCriterion("sdk_int in", values, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntNotIn(List<Integer> values) {
            addCriterion("sdk_int not in", values, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntBetween(Integer value1, Integer value2) {
            addCriterion("sdk_int between", value1, value2, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andSdkIntNotBetween(Integer value1, Integer value2) {
            addCriterion("sdk_int not between", value1, value2, "sdkInt");
            return (Criteria) this;
        }

        public Criteria andFingerprintIsNull() {
            addCriterion("fingerprint is null");
            return (Criteria) this;
        }

        public Criteria andFingerprintIsNotNull() {
            addCriterion("fingerprint is not null");
            return (Criteria) this;
        }

        public Criteria andFingerprintEqualTo(String value) {
            addCriterion("fingerprint =", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotEqualTo(String value) {
            addCriterion("fingerprint <>", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintGreaterThan(String value) {
            addCriterion("fingerprint >", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintGreaterThanOrEqualTo(String value) {
            addCriterion("fingerprint >=", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLessThan(String value) {
            addCriterion("fingerprint <", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLessThanOrEqualTo(String value) {
            addCriterion("fingerprint <=", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintLike(String value) {
            addCriterion("fingerprint like", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotLike(String value) {
            addCriterion("fingerprint not like", value, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintIn(List<String> values) {
            addCriterion("fingerprint in", values, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotIn(List<String> values) {
            addCriterion("fingerprint not in", values, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintBetween(String value1, String value2) {
            addCriterion("fingerprint between", value1, value2, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andFingerprintNotBetween(String value1, String value2) {
            addCriterion("fingerprint not between", value1, value2, "fingerprint");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andBaseOsIsNull() {
            addCriterion("base_os is null");
            return (Criteria) this;
        }

        public Criteria andBaseOsIsNotNull() {
            addCriterion("base_os is not null");
            return (Criteria) this;
        }

        public Criteria andBaseOsEqualTo(String value) {
            addCriterion("base_os =", value, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsNotEqualTo(String value) {
            addCriterion("base_os <>", value, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsGreaterThan(String value) {
            addCriterion("base_os >", value, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsGreaterThanOrEqualTo(String value) {
            addCriterion("base_os >=", value, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsLessThan(String value) {
            addCriterion("base_os <", value, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsLessThanOrEqualTo(String value) {
            addCriterion("base_os <=", value, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsLike(String value) {
            addCriterion("base_os like", value, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsNotLike(String value) {
            addCriterion("base_os not like", value, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsIn(List<String> values) {
            addCriterion("base_os in", values, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsNotIn(List<String> values) {
            addCriterion("base_os not in", values, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsBetween(String value1, String value2) {
            addCriterion("base_os between", value1, value2, "baseOs");
            return (Criteria) this;
        }

        public Criteria andBaseOsNotBetween(String value1, String value2) {
            addCriterion("base_os not between", value1, value2, "baseOs");
            return (Criteria) this;
        }

        public Criteria andMeidIsNull() {
            addCriterion("meid is null");
            return (Criteria) this;
        }

        public Criteria andMeidIsNotNull() {
            addCriterion("meid is not null");
            return (Criteria) this;
        }

        public Criteria andMeidEqualTo(String value) {
            addCriterion("meid =", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotEqualTo(String value) {
            addCriterion("meid <>", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidGreaterThan(String value) {
            addCriterion("meid >", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidGreaterThanOrEqualTo(String value) {
            addCriterion("meid >=", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidLessThan(String value) {
            addCriterion("meid <", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidLessThanOrEqualTo(String value) {
            addCriterion("meid <=", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidLike(String value) {
            addCriterion("meid like", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotLike(String value) {
            addCriterion("meid not like", value, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidIn(List<String> values) {
            addCriterion("meid in", values, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotIn(List<String> values) {
            addCriterion("meid not in", values, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidBetween(String value1, String value2) {
            addCriterion("meid between", value1, value2, "meid");
            return (Criteria) this;
        }

        public Criteria andMeidNotBetween(String value1, String value2) {
            addCriterion("meid not between", value1, value2, "meid");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andAndroidIdIsNull() {
            addCriterion("android_id is null");
            return (Criteria) this;
        }

        public Criteria andAndroidIdIsNotNull() {
            addCriterion("android_id is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidIdEqualTo(String value) {
            addCriterion("android_id =", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdNotEqualTo(String value) {
            addCriterion("android_id <>", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdGreaterThan(String value) {
            addCriterion("android_id >", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdGreaterThanOrEqualTo(String value) {
            addCriterion("android_id >=", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdLessThan(String value) {
            addCriterion("android_id <", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdLessThanOrEqualTo(String value) {
            addCriterion("android_id <=", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdLike(String value) {
            addCriterion("android_id like", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdNotLike(String value) {
            addCriterion("android_id not like", value, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdIn(List<String> values) {
            addCriterion("android_id in", values, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdNotIn(List<String> values) {
            addCriterion("android_id not in", values, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdBetween(String value1, String value2) {
            addCriterion("android_id between", value1, value2, "androidId");
            return (Criteria) this;
        }

        public Criteria andAndroidIdNotBetween(String value1, String value2) {
            addCriterion("android_id not between", value1, value2, "androidId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNull() {
            addCriterion("error_msg is null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIsNotNull() {
            addCriterion("error_msg is not null");
            return (Criteria) this;
        }

        public Criteria andErrorMsgEqualTo(String value) {
            addCriterion("error_msg =", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotEqualTo(String value) {
            addCriterion("error_msg <>", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThan(String value) {
            addCriterion("error_msg >", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgGreaterThanOrEqualTo(String value) {
            addCriterion("error_msg >=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThan(String value) {
            addCriterion("error_msg <", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLessThanOrEqualTo(String value) {
            addCriterion("error_msg <=", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgLike(String value) {
            addCriterion("error_msg like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotLike(String value) {
            addCriterion("error_msg not like", value, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgIn(List<String> values) {
            addCriterion("error_msg in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotIn(List<String> values) {
            addCriterion("error_msg not in", values, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgBetween(String value1, String value2) {
            addCriterion("error_msg between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andErrorMsgNotBetween(String value1, String value2) {
            addCriterion("error_msg not between", value1, value2, "errorMsg");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionIsNull() {
            addCriterion("google_version is null");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionIsNotNull() {
            addCriterion("google_version is not null");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionEqualTo(String value) {
            addCriterion("google_version =", value, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionNotEqualTo(String value) {
            addCriterion("google_version <>", value, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionGreaterThan(String value) {
            addCriterion("google_version >", value, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionGreaterThanOrEqualTo(String value) {
            addCriterion("google_version >=", value, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionLessThan(String value) {
            addCriterion("google_version <", value, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionLessThanOrEqualTo(String value) {
            addCriterion("google_version <=", value, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionLike(String value) {
            addCriterion("google_version like", value, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionNotLike(String value) {
            addCriterion("google_version not like", value, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionIn(List<String> values) {
            addCriterion("google_version in", values, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionNotIn(List<String> values) {
            addCriterion("google_version not in", values, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionBetween(String value1, String value2) {
            addCriterion("google_version between", value1, value2, "googleVersion");
            return (Criteria) this;
        }

        public Criteria andGoogleVersionNotBetween(String value1, String value2) {
            addCriterion("google_version not between", value1, value2, "googleVersion");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}