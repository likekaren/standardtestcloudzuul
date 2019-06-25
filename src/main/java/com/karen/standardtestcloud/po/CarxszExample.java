package com.karen.standardtestcloud.po;

import java.util.ArrayList;
import java.util.List;

public class CarxszExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarxszExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("cid like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("cid not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("ctype like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("ctype not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCuserIsNull() {
            addCriterion("cuser is null");
            return (Criteria) this;
        }

        public Criteria andCuserIsNotNull() {
            addCriterion("cuser is not null");
            return (Criteria) this;
        }

        public Criteria andCuserEqualTo(String value) {
            addCriterion("cuser =", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotEqualTo(String value) {
            addCriterion("cuser <>", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserGreaterThan(String value) {
            addCriterion("cuser >", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserGreaterThanOrEqualTo(String value) {
            addCriterion("cuser >=", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLessThan(String value) {
            addCriterion("cuser <", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLessThanOrEqualTo(String value) {
            addCriterion("cuser <=", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLike(String value) {
            addCriterion("cuser like", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotLike(String value) {
            addCriterion("cuser not like", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserIn(List<String> values) {
            addCriterion("cuser in", values, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotIn(List<String> values) {
            addCriterion("cuser not in", values, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserBetween(String value1, String value2) {
            addCriterion("cuser between", value1, value2, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotBetween(String value1, String value2) {
            addCriterion("cuser not between", value1, value2, "cuser");
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

        public Criteria andUsepropertyIsNull() {
            addCriterion("useproperty is null");
            return (Criteria) this;
        }

        public Criteria andUsepropertyIsNotNull() {
            addCriterion("useproperty is not null");
            return (Criteria) this;
        }

        public Criteria andUsepropertyEqualTo(String value) {
            addCriterion("useproperty =", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotEqualTo(String value) {
            addCriterion("useproperty <>", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyGreaterThan(String value) {
            addCriterion("useproperty >", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyGreaterThanOrEqualTo(String value) {
            addCriterion("useproperty >=", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLessThan(String value) {
            addCriterion("useproperty <", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLessThanOrEqualTo(String value) {
            addCriterion("useproperty <=", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyLike(String value) {
            addCriterion("useproperty like", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotLike(String value) {
            addCriterion("useproperty not like", value, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyIn(List<String> values) {
            addCriterion("useproperty in", values, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotIn(List<String> values) {
            addCriterion("useproperty not in", values, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyBetween(String value1, String value2) {
            addCriterion("useproperty between", value1, value2, "useproperty");
            return (Criteria) this;
        }

        public Criteria andUsepropertyNotBetween(String value1, String value2) {
            addCriterion("useproperty not between", value1, value2, "useproperty");
            return (Criteria) this;
        }

        public Criteria andBrandtypeIsNull() {
            addCriterion("brandtype is null");
            return (Criteria) this;
        }

        public Criteria andBrandtypeIsNotNull() {
            addCriterion("brandtype is not null");
            return (Criteria) this;
        }

        public Criteria andBrandtypeEqualTo(String value) {
            addCriterion("brandtype =", value, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeNotEqualTo(String value) {
            addCriterion("brandtype <>", value, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeGreaterThan(String value) {
            addCriterion("brandtype >", value, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeGreaterThanOrEqualTo(String value) {
            addCriterion("brandtype >=", value, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeLessThan(String value) {
            addCriterion("brandtype <", value, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeLessThanOrEqualTo(String value) {
            addCriterion("brandtype <=", value, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeLike(String value) {
            addCriterion("brandtype like", value, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeNotLike(String value) {
            addCriterion("brandtype not like", value, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeIn(List<String> values) {
            addCriterion("brandtype in", values, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeNotIn(List<String> values) {
            addCriterion("brandtype not in", values, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeBetween(String value1, String value2) {
            addCriterion("brandtype between", value1, value2, "brandtype");
            return (Criteria) this;
        }

        public Criteria andBrandtypeNotBetween(String value1, String value2) {
            addCriterion("brandtype not between", value1, value2, "brandtype");
            return (Criteria) this;
        }

        public Criteria andSbidIsNull() {
            addCriterion("sbid is null");
            return (Criteria) this;
        }

        public Criteria andSbidIsNotNull() {
            addCriterion("sbid is not null");
            return (Criteria) this;
        }

        public Criteria andSbidEqualTo(String value) {
            addCriterion("sbid =", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotEqualTo(String value) {
            addCriterion("sbid <>", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThan(String value) {
            addCriterion("sbid >", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThanOrEqualTo(String value) {
            addCriterion("sbid >=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThan(String value) {
            addCriterion("sbid <", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThanOrEqualTo(String value) {
            addCriterion("sbid <=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLike(String value) {
            addCriterion("sbid like", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotLike(String value) {
            addCriterion("sbid not like", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidIn(List<String> values) {
            addCriterion("sbid in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotIn(List<String> values) {
            addCriterion("sbid not in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidBetween(String value1, String value2) {
            addCriterion("sbid between", value1, value2, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotBetween(String value1, String value2) {
            addCriterion("sbid not between", value1, value2, "sbid");
            return (Criteria) this;
        }

        public Criteria andFdjidIsNull() {
            addCriterion("fdjid is null");
            return (Criteria) this;
        }

        public Criteria andFdjidIsNotNull() {
            addCriterion("fdjid is not null");
            return (Criteria) this;
        }

        public Criteria andFdjidEqualTo(String value) {
            addCriterion("fdjid =", value, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidNotEqualTo(String value) {
            addCriterion("fdjid <>", value, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidGreaterThan(String value) {
            addCriterion("fdjid >", value, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidGreaterThanOrEqualTo(String value) {
            addCriterion("fdjid >=", value, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidLessThan(String value) {
            addCriterion("fdjid <", value, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidLessThanOrEqualTo(String value) {
            addCriterion("fdjid <=", value, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidLike(String value) {
            addCriterion("fdjid like", value, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidNotLike(String value) {
            addCriterion("fdjid not like", value, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidIn(List<String> values) {
            addCriterion("fdjid in", values, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidNotIn(List<String> values) {
            addCriterion("fdjid not in", values, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidBetween(String value1, String value2) {
            addCriterion("fdjid between", value1, value2, "fdjid");
            return (Criteria) this;
        }

        public Criteria andFdjidNotBetween(String value1, String value2) {
            addCriterion("fdjid not between", value1, value2, "fdjid");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNull() {
            addCriterion("rtime is null");
            return (Criteria) this;
        }

        public Criteria andRtimeIsNotNull() {
            addCriterion("rtime is not null");
            return (Criteria) this;
        }

        public Criteria andRtimeEqualTo(String value) {
            addCriterion("rtime =", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotEqualTo(String value) {
            addCriterion("rtime <>", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThan(String value) {
            addCriterion("rtime >", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeGreaterThanOrEqualTo(String value) {
            addCriterion("rtime >=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThan(String value) {
            addCriterion("rtime <", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLessThanOrEqualTo(String value) {
            addCriterion("rtime <=", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeLike(String value) {
            addCriterion("rtime like", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotLike(String value) {
            addCriterion("rtime not like", value, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeIn(List<String> values) {
            addCriterion("rtime in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotIn(List<String> values) {
            addCriterion("rtime not in", values, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeBetween(String value1, String value2) {
            addCriterion("rtime between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andRtimeNotBetween(String value1, String value2) {
            addCriterion("rtime not between", value1, value2, "rtime");
            return (Criteria) this;
        }

        public Criteria andFztimeIsNull() {
            addCriterion("fztime is null");
            return (Criteria) this;
        }

        public Criteria andFztimeIsNotNull() {
            addCriterion("fztime is not null");
            return (Criteria) this;
        }

        public Criteria andFztimeEqualTo(String value) {
            addCriterion("fztime =", value, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeNotEqualTo(String value) {
            addCriterion("fztime <>", value, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeGreaterThan(String value) {
            addCriterion("fztime >", value, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeGreaterThanOrEqualTo(String value) {
            addCriterion("fztime >=", value, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeLessThan(String value) {
            addCriterion("fztime <", value, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeLessThanOrEqualTo(String value) {
            addCriterion("fztime <=", value, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeLike(String value) {
            addCriterion("fztime like", value, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeNotLike(String value) {
            addCriterion("fztime not like", value, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeIn(List<String> values) {
            addCriterion("fztime in", values, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeNotIn(List<String> values) {
            addCriterion("fztime not in", values, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeBetween(String value1, String value2) {
            addCriterion("fztime between", value1, value2, "fztime");
            return (Criteria) this;
        }

        public Criteria andFztimeNotBetween(String value1, String value2) {
            addCriterion("fztime not between", value1, value2, "fztime");
            return (Criteria) this;
        }

        public Criteria andFilenumIsNull() {
            addCriterion("filenum is null");
            return (Criteria) this;
        }

        public Criteria andFilenumIsNotNull() {
            addCriterion("filenum is not null");
            return (Criteria) this;
        }

        public Criteria andFilenumEqualTo(String value) {
            addCriterion("filenum =", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotEqualTo(String value) {
            addCriterion("filenum <>", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumGreaterThan(String value) {
            addCriterion("filenum >", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumGreaterThanOrEqualTo(String value) {
            addCriterion("filenum >=", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumLessThan(String value) {
            addCriterion("filenum <", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumLessThanOrEqualTo(String value) {
            addCriterion("filenum <=", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumLike(String value) {
            addCriterion("filenum like", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotLike(String value) {
            addCriterion("filenum not like", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumIn(List<String> values) {
            addCriterion("filenum in", values, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotIn(List<String> values) {
            addCriterion("filenum not in", values, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumBetween(String value1, String value2) {
            addCriterion("filenum between", value1, value2, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotBetween(String value1, String value2) {
            addCriterion("filenum not between", value1, value2, "filenum");
            return (Criteria) this;
        }

        public Criteria andHdzrsIsNull() {
            addCriterion("hdzrs is null");
            return (Criteria) this;
        }

        public Criteria andHdzrsIsNotNull() {
            addCriterion("hdzrs is not null");
            return (Criteria) this;
        }

        public Criteria andHdzrsEqualTo(String value) {
            addCriterion("hdzrs =", value, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsNotEqualTo(String value) {
            addCriterion("hdzrs <>", value, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsGreaterThan(String value) {
            addCriterion("hdzrs >", value, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsGreaterThanOrEqualTo(String value) {
            addCriterion("hdzrs >=", value, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsLessThan(String value) {
            addCriterion("hdzrs <", value, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsLessThanOrEqualTo(String value) {
            addCriterion("hdzrs <=", value, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsLike(String value) {
            addCriterion("hdzrs like", value, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsNotLike(String value) {
            addCriterion("hdzrs not like", value, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsIn(List<String> values) {
            addCriterion("hdzrs in", values, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsNotIn(List<String> values) {
            addCriterion("hdzrs not in", values, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsBetween(String value1, String value2) {
            addCriterion("hdzrs between", value1, value2, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andHdzrsNotBetween(String value1, String value2) {
            addCriterion("hdzrs not between", value1, value2, "hdzrs");
            return (Criteria) this;
        }

        public Criteria andZzlIsNull() {
            addCriterion("zzl is null");
            return (Criteria) this;
        }

        public Criteria andZzlIsNotNull() {
            addCriterion("zzl is not null");
            return (Criteria) this;
        }

        public Criteria andZzlEqualTo(String value) {
            addCriterion("zzl =", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotEqualTo(String value) {
            addCriterion("zzl <>", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlGreaterThan(String value) {
            addCriterion("zzl >", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlGreaterThanOrEqualTo(String value) {
            addCriterion("zzl >=", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLessThan(String value) {
            addCriterion("zzl <", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLessThanOrEqualTo(String value) {
            addCriterion("zzl <=", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlLike(String value) {
            addCriterion("zzl like", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotLike(String value) {
            addCriterion("zzl not like", value, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlIn(List<String> values) {
            addCriterion("zzl in", values, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotIn(List<String> values) {
            addCriterion("zzl not in", values, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlBetween(String value1, String value2) {
            addCriterion("zzl between", value1, value2, "zzl");
            return (Criteria) this;
        }

        public Criteria andZzlNotBetween(String value1, String value2) {
            addCriterion("zzl not between", value1, value2, "zzl");
            return (Criteria) this;
        }

        public Criteria andZbzlIsNull() {
            addCriterion("zbzl is null");
            return (Criteria) this;
        }

        public Criteria andZbzlIsNotNull() {
            addCriterion("zbzl is not null");
            return (Criteria) this;
        }

        public Criteria andZbzlEqualTo(String value) {
            addCriterion("zbzl =", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotEqualTo(String value) {
            addCriterion("zbzl <>", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlGreaterThan(String value) {
            addCriterion("zbzl >", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlGreaterThanOrEqualTo(String value) {
            addCriterion("zbzl >=", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLessThan(String value) {
            addCriterion("zbzl <", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLessThanOrEqualTo(String value) {
            addCriterion("zbzl <=", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlLike(String value) {
            addCriterion("zbzl like", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotLike(String value) {
            addCriterion("zbzl not like", value, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlIn(List<String> values) {
            addCriterion("zbzl in", values, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotIn(List<String> values) {
            addCriterion("zbzl not in", values, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlBetween(String value1, String value2) {
            addCriterion("zbzl between", value1, value2, "zbzl");
            return (Criteria) this;
        }

        public Criteria andZbzlNotBetween(String value1, String value2) {
            addCriterion("zbzl not between", value1, value2, "zbzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlIsNull() {
            addCriterion("hdzzl is null");
            return (Criteria) this;
        }

        public Criteria andHdzzlIsNotNull() {
            addCriterion("hdzzl is not null");
            return (Criteria) this;
        }

        public Criteria andHdzzlEqualTo(String value) {
            addCriterion("hdzzl =", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlNotEqualTo(String value) {
            addCriterion("hdzzl <>", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlGreaterThan(String value) {
            addCriterion("hdzzl >", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlGreaterThanOrEqualTo(String value) {
            addCriterion("hdzzl >=", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlLessThan(String value) {
            addCriterion("hdzzl <", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlLessThanOrEqualTo(String value) {
            addCriterion("hdzzl <=", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlLike(String value) {
            addCriterion("hdzzl like", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlNotLike(String value) {
            addCriterion("hdzzl not like", value, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlIn(List<String> values) {
            addCriterion("hdzzl in", values, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlNotIn(List<String> values) {
            addCriterion("hdzzl not in", values, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlBetween(String value1, String value2) {
            addCriterion("hdzzl between", value1, value2, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andHdzzlNotBetween(String value1, String value2) {
            addCriterion("hdzzl not between", value1, value2, "hdzzl");
            return (Criteria) this;
        }

        public Criteria andWgccIsNull() {
            addCriterion("wgcc is null");
            return (Criteria) this;
        }

        public Criteria andWgccIsNotNull() {
            addCriterion("wgcc is not null");
            return (Criteria) this;
        }

        public Criteria andWgccEqualTo(String value) {
            addCriterion("wgcc =", value, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccNotEqualTo(String value) {
            addCriterion("wgcc <>", value, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccGreaterThan(String value) {
            addCriterion("wgcc >", value, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccGreaterThanOrEqualTo(String value) {
            addCriterion("wgcc >=", value, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccLessThan(String value) {
            addCriterion("wgcc <", value, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccLessThanOrEqualTo(String value) {
            addCriterion("wgcc <=", value, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccLike(String value) {
            addCriterion("wgcc like", value, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccNotLike(String value) {
            addCriterion("wgcc not like", value, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccIn(List<String> values) {
            addCriterion("wgcc in", values, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccNotIn(List<String> values) {
            addCriterion("wgcc not in", values, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccBetween(String value1, String value2) {
            addCriterion("wgcc between", value1, value2, "wgcc");
            return (Criteria) this;
        }

        public Criteria andWgccNotBetween(String value1, String value2) {
            addCriterion("wgcc not between", value1, value2, "wgcc");
            return (Criteria) this;
        }

        public Criteria andZqyzlIsNull() {
            addCriterion("zqyzl is null");
            return (Criteria) this;
        }

        public Criteria andZqyzlIsNotNull() {
            addCriterion("zqyzl is not null");
            return (Criteria) this;
        }

        public Criteria andZqyzlEqualTo(String value) {
            addCriterion("zqyzl =", value, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlNotEqualTo(String value) {
            addCriterion("zqyzl <>", value, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlGreaterThan(String value) {
            addCriterion("zqyzl >", value, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlGreaterThanOrEqualTo(String value) {
            addCriterion("zqyzl >=", value, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlLessThan(String value) {
            addCriterion("zqyzl <", value, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlLessThanOrEqualTo(String value) {
            addCriterion("zqyzl <=", value, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlLike(String value) {
            addCriterion("zqyzl like", value, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlNotLike(String value) {
            addCriterion("zqyzl not like", value, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlIn(List<String> values) {
            addCriterion("zqyzl in", values, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlNotIn(List<String> values) {
            addCriterion("zqyzl not in", values, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlBetween(String value1, String value2) {
            addCriterion("zqyzl between", value1, value2, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andZqyzlNotBetween(String value1, String value2) {
            addCriterion("zqyzl not between", value1, value2, "zqyzl");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andTestrecordIsNull() {
            addCriterion("testrecord is null");
            return (Criteria) this;
        }

        public Criteria andTestrecordIsNotNull() {
            addCriterion("testrecord is not null");
            return (Criteria) this;
        }

        public Criteria andTestrecordEqualTo(String value) {
            addCriterion("testrecord =", value, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordNotEqualTo(String value) {
            addCriterion("testrecord <>", value, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordGreaterThan(String value) {
            addCriterion("testrecord >", value, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordGreaterThanOrEqualTo(String value) {
            addCriterion("testrecord >=", value, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordLessThan(String value) {
            addCriterion("testrecord <", value, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordLessThanOrEqualTo(String value) {
            addCriterion("testrecord <=", value, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordLike(String value) {
            addCriterion("testrecord like", value, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordNotLike(String value) {
            addCriterion("testrecord not like", value, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordIn(List<String> values) {
            addCriterion("testrecord in", values, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordNotIn(List<String> values) {
            addCriterion("testrecord not in", values, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordBetween(String value1, String value2) {
            addCriterion("testrecord between", value1, value2, "testrecord");
            return (Criteria) this;
        }

        public Criteria andTestrecordNotBetween(String value1, String value2) {
            addCriterion("testrecord not between", value1, value2, "testrecord");
            return (Criteria) this;
        }

        public Criteria andEx1IsNull() {
            addCriterion("ex1 is null");
            return (Criteria) this;
        }

        public Criteria andEx1IsNotNull() {
            addCriterion("ex1 is not null");
            return (Criteria) this;
        }

        public Criteria andEx1EqualTo(String value) {
            addCriterion("ex1 =", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotEqualTo(String value) {
            addCriterion("ex1 <>", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThan(String value) {
            addCriterion("ex1 >", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1GreaterThanOrEqualTo(String value) {
            addCriterion("ex1 >=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThan(String value) {
            addCriterion("ex1 <", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1LessThanOrEqualTo(String value) {
            addCriterion("ex1 <=", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Like(String value) {
            addCriterion("ex1 like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotLike(String value) {
            addCriterion("ex1 not like", value, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1In(List<String> values) {
            addCriterion("ex1 in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotIn(List<String> values) {
            addCriterion("ex1 not in", values, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1Between(String value1, String value2) {
            addCriterion("ex1 between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andEx1NotBetween(String value1, String value2) {
            addCriterion("ex1 not between", value1, value2, "ex1");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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