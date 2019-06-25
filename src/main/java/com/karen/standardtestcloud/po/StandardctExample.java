package com.karen.standardtestcloud.po;

import java.util.ArrayList;
import java.util.List;

public class StandardctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StandardctExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNull() {
            addCriterion("ttime is null");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNotNull() {
            addCriterion("ttime is not null");
            return (Criteria) this;
        }

        public Criteria andTtimeEqualTo(String value) {
            addCriterion("ttime =", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotEqualTo(String value) {
            addCriterion("ttime <>", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThan(String value) {
            addCriterion("ttime >", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ttime >=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThan(String value) {
            addCriterion("ttime <", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThanOrEqualTo(String value) {
            addCriterion("ttime <=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLike(String value) {
            addCriterion("ttime like", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotLike(String value) {
            addCriterion("ttime not like", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeIn(List<String> values) {
            addCriterion("ttime in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotIn(List<String> values) {
            addCriterion("ttime not in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeBetween(String value1, String value2) {
            addCriterion("ttime between", value1, value2, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotBetween(String value1, String value2) {
            addCriterion("ttime not between", value1, value2, "ttime");
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

        public Criteria andEx2IsNull() {
            addCriterion("ex2 is null");
            return (Criteria) this;
        }

        public Criteria andEx2IsNotNull() {
            addCriterion("ex2 is not null");
            return (Criteria) this;
        }

        public Criteria andEx2EqualTo(String value) {
            addCriterion("ex2 =", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotEqualTo(String value) {
            addCriterion("ex2 <>", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThan(String value) {
            addCriterion("ex2 >", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2GreaterThanOrEqualTo(String value) {
            addCriterion("ex2 >=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThan(String value) {
            addCriterion("ex2 <", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2LessThanOrEqualTo(String value) {
            addCriterion("ex2 <=", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Like(String value) {
            addCriterion("ex2 like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotLike(String value) {
            addCriterion("ex2 not like", value, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2In(List<String> values) {
            addCriterion("ex2 in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotIn(List<String> values) {
            addCriterion("ex2 not in", values, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2Between(String value1, String value2) {
            addCriterion("ex2 between", value1, value2, "ex2");
            return (Criteria) this;
        }

        public Criteria andEx2NotBetween(String value1, String value2) {
            addCriterion("ex2 not between", value1, value2, "ex2");
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