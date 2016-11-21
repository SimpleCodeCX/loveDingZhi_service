package com.simple.loveDingZhi.po;

import java.util.ArrayList;
import java.util.List;

public class DesignerCertificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesignerCertificationExample() {
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

        public Criteria andEduLevelIsNull() {
            addCriterion("edu_level is null");
            return (Criteria) this;
        }

        public Criteria andEduLevelIsNotNull() {
            addCriterion("edu_level is not null");
            return (Criteria) this;
        }

        public Criteria andEduLevelEqualTo(String value) {
            addCriterion("edu_level =", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotEqualTo(String value) {
            addCriterion("edu_level <>", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelGreaterThan(String value) {
            addCriterion("edu_level >", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelGreaterThanOrEqualTo(String value) {
            addCriterion("edu_level >=", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLessThan(String value) {
            addCriterion("edu_level <", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLessThanOrEqualTo(String value) {
            addCriterion("edu_level <=", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelLike(String value) {
            addCriterion("edu_level like", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotLike(String value) {
            addCriterion("edu_level not like", value, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelIn(List<String> values) {
            addCriterion("edu_level in", values, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotIn(List<String> values) {
            addCriterion("edu_level not in", values, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelBetween(String value1, String value2) {
            addCriterion("edu_level between", value1, value2, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andEduLevelNotBetween(String value1, String value2) {
            addCriterion("edu_level not between", value1, value2, "eduLevel");
            return (Criteria) this;
        }

        public Criteria andSchollNameIsNull() {
            addCriterion("scholl_name is null");
            return (Criteria) this;
        }

        public Criteria andSchollNameIsNotNull() {
            addCriterion("scholl_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchollNameEqualTo(String value) {
            addCriterion("scholl_name =", value, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameNotEqualTo(String value) {
            addCriterion("scholl_name <>", value, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameGreaterThan(String value) {
            addCriterion("scholl_name >", value, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameGreaterThanOrEqualTo(String value) {
            addCriterion("scholl_name >=", value, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameLessThan(String value) {
            addCriterion("scholl_name <", value, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameLessThanOrEqualTo(String value) {
            addCriterion("scholl_name <=", value, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameLike(String value) {
            addCriterion("scholl_name like", value, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameNotLike(String value) {
            addCriterion("scholl_name not like", value, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameIn(List<String> values) {
            addCriterion("scholl_name in", values, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameNotIn(List<String> values) {
            addCriterion("scholl_name not in", values, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameBetween(String value1, String value2) {
            addCriterion("scholl_name between", value1, value2, "schollName");
            return (Criteria) this;
        }

        public Criteria andSchollNameNotBetween(String value1, String value2) {
            addCriterion("scholl_name not between", value1, value2, "schollName");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlIsNull() {
            addCriterion("major_certification_url is null");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlIsNotNull() {
            addCriterion("major_certification_url is not null");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlEqualTo(String value) {
            addCriterion("major_certification_url =", value, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlNotEqualTo(String value) {
            addCriterion("major_certification_url <>", value, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlGreaterThan(String value) {
            addCriterion("major_certification_url >", value, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlGreaterThanOrEqualTo(String value) {
            addCriterion("major_certification_url >=", value, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlLessThan(String value) {
            addCriterion("major_certification_url <", value, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlLessThanOrEqualTo(String value) {
            addCriterion("major_certification_url <=", value, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlLike(String value) {
            addCriterion("major_certification_url like", value, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlNotLike(String value) {
            addCriterion("major_certification_url not like", value, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlIn(List<String> values) {
            addCriterion("major_certification_url in", values, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlNotIn(List<String> values) {
            addCriterion("major_certification_url not in", values, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlBetween(String value1, String value2) {
            addCriterion("major_certification_url between", value1, value2, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andMajorCertificationUrlNotBetween(String value1, String value2) {
            addCriterion("major_certification_url not between", value1, value2, "majorCertificationUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlIsNull() {
            addCriterion("works_url is null");
            return (Criteria) this;
        }

        public Criteria andWorksUrlIsNotNull() {
            addCriterion("works_url is not null");
            return (Criteria) this;
        }

        public Criteria andWorksUrlEqualTo(String value) {
            addCriterion("works_url =", value, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlNotEqualTo(String value) {
            addCriterion("works_url <>", value, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlGreaterThan(String value) {
            addCriterion("works_url >", value, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlGreaterThanOrEqualTo(String value) {
            addCriterion("works_url >=", value, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlLessThan(String value) {
            addCriterion("works_url <", value, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlLessThanOrEqualTo(String value) {
            addCriterion("works_url <=", value, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlLike(String value) {
            addCriterion("works_url like", value, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlNotLike(String value) {
            addCriterion("works_url not like", value, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlIn(List<String> values) {
            addCriterion("works_url in", values, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlNotIn(List<String> values) {
            addCriterion("works_url not in", values, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlBetween(String value1, String value2) {
            addCriterion("works_url between", value1, value2, "worksUrl");
            return (Criteria) this;
        }

        public Criteria andWorksUrlNotBetween(String value1, String value2) {
            addCriterion("works_url not between", value1, value2, "worksUrl");
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