package com.hellozjf.webapp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TLoginfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLoginfoExample() {
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

        public Criteria andLogtimeIsNull() {
            addCriterion("logTime is null");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNotNull() {
            addCriterion("logTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogtimeEqualTo(Date value) {
            addCriterion("logTime =", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotEqualTo(Date value) {
            addCriterion("logTime <>", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThan(Date value) {
            addCriterion("logTime >", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("logTime >=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThan(Date value) {
            addCriterion("logTime <", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThanOrEqualTo(Date value) {
            addCriterion("logTime <=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeIn(List<Date> values) {
            addCriterion("logTime in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotIn(List<Date> values) {
            addCriterion("logTime not in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeBetween(Date value1, Date value2) {
            addCriterion("logTime between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotBetween(Date value1, Date value2) {
            addCriterion("logTime not between", value1, value2, "logtime");
            return (Criteria) this;
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

        public Criteria andIssuccessIsNull() {
            addCriterion("isSuccess is null");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNotNull() {
            addCriterion("isSuccess is not null");
            return (Criteria) this;
        }

        public Criteria andIssuccessEqualTo(Integer value) {
            addCriterion("isSuccess =", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotEqualTo(Integer value) {
            addCriterion("isSuccess <>", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThan(Integer value) {
            addCriterion("isSuccess >", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSuccess >=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThan(Integer value) {
            addCriterion("isSuccess <", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThanOrEqualTo(Integer value) {
            addCriterion("isSuccess <=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessIn(List<Integer> values) {
            addCriterion("isSuccess in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotIn(List<Integer> values) {
            addCriterion("isSuccess not in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessBetween(Integer value1, Integer value2) {
            addCriterion("isSuccess between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("isSuccess not between", value1, value2, "issuccess");
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