package com.karen.standardtestcloud.po;

import java.util.ArrayList;
import java.util.List;

public class StandardctvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StandardctvExample() {
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

        public Criteria andProjectnameIsNull() {
            addCriterion("projectname is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectname is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectname =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectname <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectname >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectname >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectname <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectname <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectname like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectname not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectname in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectname not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectname between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectname not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andStandardvalueIsNull() {
            addCriterion("standardvalue is null");
            return (Criteria) this;
        }

        public Criteria andStandardvalueIsNotNull() {
            addCriterion("standardvalue is not null");
            return (Criteria) this;
        }

        public Criteria andStandardvalueEqualTo(String value) {
            addCriterion("standardvalue =", value, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueNotEqualTo(String value) {
            addCriterion("standardvalue <>", value, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueGreaterThan(String value) {
            addCriterion("standardvalue >", value, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueGreaterThanOrEqualTo(String value) {
            addCriterion("standardvalue >=", value, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueLessThan(String value) {
            addCriterion("standardvalue <", value, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueLessThanOrEqualTo(String value) {
            addCriterion("standardvalue <=", value, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueLike(String value) {
            addCriterion("standardvalue like", value, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueNotLike(String value) {
            addCriterion("standardvalue not like", value, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueIn(List<String> values) {
            addCriterion("standardvalue in", values, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueNotIn(List<String> values) {
            addCriterion("standardvalue not in", values, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueBetween(String value1, String value2) {
            addCriterion("standardvalue between", value1, value2, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalueNotBetween(String value1, String value2) {
            addCriterion("standardvalue not between", value1, value2, "standardvalue");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2IsNull() {
            addCriterion("standardvalue2 is null");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2IsNotNull() {
            addCriterion("standardvalue2 is not null");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2EqualTo(String value) {
            addCriterion("standardvalue2 =", value, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2NotEqualTo(String value) {
            addCriterion("standardvalue2 <>", value, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2GreaterThan(String value) {
            addCriterion("standardvalue2 >", value, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2GreaterThanOrEqualTo(String value) {
            addCriterion("standardvalue2 >=", value, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2LessThan(String value) {
            addCriterion("standardvalue2 <", value, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2LessThanOrEqualTo(String value) {
            addCriterion("standardvalue2 <=", value, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2Like(String value) {
            addCriterion("standardvalue2 like", value, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2NotLike(String value) {
            addCriterion("standardvalue2 not like", value, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2In(List<String> values) {
            addCriterion("standardvalue2 in", values, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2NotIn(List<String> values) {
            addCriterion("standardvalue2 not in", values, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2Between(String value1, String value2) {
            addCriterion("standardvalue2 between", value1, value2, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andStandardvalue2NotBetween(String value1, String value2) {
            addCriterion("standardvalue2 not between", value1, value2, "standardvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalueIsNull() {
            addCriterion("ctvalue is null");
            return (Criteria) this;
        }

        public Criteria andCtvalueIsNotNull() {
            addCriterion("ctvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCtvalueEqualTo(String value) {
            addCriterion("ctvalue =", value, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueNotEqualTo(String value) {
            addCriterion("ctvalue <>", value, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueGreaterThan(String value) {
            addCriterion("ctvalue >", value, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueGreaterThanOrEqualTo(String value) {
            addCriterion("ctvalue >=", value, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueLessThan(String value) {
            addCriterion("ctvalue <", value, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueLessThanOrEqualTo(String value) {
            addCriterion("ctvalue <=", value, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueLike(String value) {
            addCriterion("ctvalue like", value, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueNotLike(String value) {
            addCriterion("ctvalue not like", value, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueIn(List<String> values) {
            addCriterion("ctvalue in", values, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueNotIn(List<String> values) {
            addCriterion("ctvalue not in", values, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueBetween(String value1, String value2) {
            addCriterion("ctvalue between", value1, value2, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalueNotBetween(String value1, String value2) {
            addCriterion("ctvalue not between", value1, value2, "ctvalue");
            return (Criteria) this;
        }

        public Criteria andCtvalue2IsNull() {
            addCriterion("ctvalue2 is null");
            return (Criteria) this;
        }

        public Criteria andCtvalue2IsNotNull() {
            addCriterion("ctvalue2 is not null");
            return (Criteria) this;
        }

        public Criteria andCtvalue2EqualTo(String value) {
            addCriterion("ctvalue2 =", value, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2NotEqualTo(String value) {
            addCriterion("ctvalue2 <>", value, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2GreaterThan(String value) {
            addCriterion("ctvalue2 >", value, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2GreaterThanOrEqualTo(String value) {
            addCriterion("ctvalue2 >=", value, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2LessThan(String value) {
            addCriterion("ctvalue2 <", value, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2LessThanOrEqualTo(String value) {
            addCriterion("ctvalue2 <=", value, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2Like(String value) {
            addCriterion("ctvalue2 like", value, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2NotLike(String value) {
            addCriterion("ctvalue2 not like", value, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2In(List<String> values) {
            addCriterion("ctvalue2 in", values, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2NotIn(List<String> values) {
            addCriterion("ctvalue2 not in", values, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2Between(String value1, String value2) {
            addCriterion("ctvalue2 between", value1, value2, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andCtvalue2NotBetween(String value1, String value2) {
            addCriterion("ctvalue2 not between", value1, value2, "ctvalue2");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
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

        public Criteria andSuggestIsNull() {
            addCriterion("suggest is null");
            return (Criteria) this;
        }

        public Criteria andSuggestIsNotNull() {
            addCriterion("suggest is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestEqualTo(String value) {
            addCriterion("suggest =", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotEqualTo(String value) {
            addCriterion("suggest <>", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestGreaterThan(String value) {
            addCriterion("suggest >", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("suggest >=", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLessThan(String value) {
            addCriterion("suggest <", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLessThanOrEqualTo(String value) {
            addCriterion("suggest <=", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestLike(String value) {
            addCriterion("suggest like", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotLike(String value) {
            addCriterion("suggest not like", value, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestIn(List<String> values) {
            addCriterion("suggest in", values, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotIn(List<String> values) {
            addCriterion("suggest not in", values, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestBetween(String value1, String value2) {
            addCriterion("suggest between", value1, value2, "suggest");
            return (Criteria) this;
        }

        public Criteria andSuggestNotBetween(String value1, String value2) {
            addCriterion("suggest not between", value1, value2, "suggest");
            return (Criteria) this;
        }

        public Criteria andTypesIsNull() {
            addCriterion("types is null");
            return (Criteria) this;
        }

        public Criteria andTypesIsNotNull() {
            addCriterion("types is not null");
            return (Criteria) this;
        }

        public Criteria andTypesEqualTo(String value) {
            addCriterion("types =", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotEqualTo(String value) {
            addCriterion("types <>", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThan(String value) {
            addCriterion("types >", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThanOrEqualTo(String value) {
            addCriterion("types >=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThan(String value) {
            addCriterion("types <", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThanOrEqualTo(String value) {
            addCriterion("types <=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLike(String value) {
            addCriterion("types like", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotLike(String value) {
            addCriterion("types not like", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesIn(List<String> values) {
            addCriterion("types in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotIn(List<String> values) {
            addCriterion("types not in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesBetween(String value1, String value2) {
            addCriterion("types between", value1, value2, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotBetween(String value1, String value2) {
            addCriterion("types not between", value1, value2, "types");
            return (Criteria) this;
        }

        public Criteria andTypetIsNull() {
            addCriterion("typet is null");
            return (Criteria) this;
        }

        public Criteria andTypetIsNotNull() {
            addCriterion("typet is not null");
            return (Criteria) this;
        }

        public Criteria andTypetEqualTo(String value) {
            addCriterion("typet =", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetNotEqualTo(String value) {
            addCriterion("typet <>", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetGreaterThan(String value) {
            addCriterion("typet >", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetGreaterThanOrEqualTo(String value) {
            addCriterion("typet >=", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetLessThan(String value) {
            addCriterion("typet <", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetLessThanOrEqualTo(String value) {
            addCriterion("typet <=", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetLike(String value) {
            addCriterion("typet like", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetNotLike(String value) {
            addCriterion("typet not like", value, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetIn(List<String> values) {
            addCriterion("typet in", values, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetNotIn(List<String> values) {
            addCriterion("typet not in", values, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetBetween(String value1, String value2) {
            addCriterion("typet between", value1, value2, "typet");
            return (Criteria) this;
        }

        public Criteria andTypetNotBetween(String value1, String value2) {
            addCriterion("typet not between", value1, value2, "typet");
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