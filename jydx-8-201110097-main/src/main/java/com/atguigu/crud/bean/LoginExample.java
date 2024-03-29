package com.atguigu.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class LoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogAccountIsNull() {
            addCriterion("log_account is null");
            return (Criteria) this;
        }

        public Criteria andLogAccountIsNotNull() {
            addCriterion("log_account is not null");
            return (Criteria) this;
        }

        public Criteria andLogAccountEqualTo(String value) {
            addCriterion("log_account =", value, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountNotEqualTo(String value) {
            addCriterion("log_account <>", value, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountGreaterThan(String value) {
            addCriterion("log_account >", value, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountGreaterThanOrEqualTo(String value) {
            addCriterion("log_account >=", value, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountLessThan(String value) {
            addCriterion("log_account <", value, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountLessThanOrEqualTo(String value) {
            addCriterion("log_account <=", value, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountLike(String value) {
            addCriterion("log_account like", value, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountNotLike(String value) {
            addCriterion("log_account not like", value, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountIn(List<String> values) {
            addCriterion("log_account in", values, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountNotIn(List<String> values) {
            addCriterion("log_account not in", values, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountBetween(String value1, String value2) {
            addCriterion("log_account between", value1, value2, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogAccountNotBetween(String value1, String value2) {
            addCriterion("log_account not between", value1, value2, "logAccount");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIsNull() {
            addCriterion("log_password is null");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIsNotNull() {
            addCriterion("log_password is not null");
            return (Criteria) this;
        }

        public Criteria andLogPasswordEqualTo(String value) {
            addCriterion("log_password =", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotEqualTo(String value) {
            addCriterion("log_password <>", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordGreaterThan(String value) {
            addCriterion("log_password >", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("log_password >=", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLessThan(String value) {
            addCriterion("log_password <", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLessThanOrEqualTo(String value) {
            addCriterion("log_password <=", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLike(String value) {
            addCriterion("log_password like", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotLike(String value) {
            addCriterion("log_password not like", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIn(List<String> values) {
            addCriterion("log_password in", values, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotIn(List<String> values) {
            addCriterion("log_password not in", values, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordBetween(String value1, String value2) {
            addCriterion("log_password between", value1, value2, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotBetween(String value1, String value2) {
            addCriterion("log_password not between", value1, value2, "logPassword");
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