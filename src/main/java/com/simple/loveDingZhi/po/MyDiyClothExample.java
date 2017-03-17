package com.simple.loveDingZhi.po;

import java.util.ArrayList;
import java.util.List;

public class MyDiyClothExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyDiyClothExample() {
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

        public Criteria andMyDiyClothIdIsNull() {
            addCriterion("my_diy_cloth_id is null");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdIsNotNull() {
            addCriterion("my_diy_cloth_id is not null");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdEqualTo(Integer value) {
            addCriterion("my_diy_cloth_id =", value, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdNotEqualTo(Integer value) {
            addCriterion("my_diy_cloth_id <>", value, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdGreaterThan(Integer value) {
            addCriterion("my_diy_cloth_id >", value, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("my_diy_cloth_id >=", value, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdLessThan(Integer value) {
            addCriterion("my_diy_cloth_id <", value, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdLessThanOrEqualTo(Integer value) {
            addCriterion("my_diy_cloth_id <=", value, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdIn(List<Integer> values) {
            addCriterion("my_diy_cloth_id in", values, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdNotIn(List<Integer> values) {
            addCriterion("my_diy_cloth_id not in", values, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdBetween(Integer value1, Integer value2) {
            addCriterion("my_diy_cloth_id between", value1, value2, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andMyDiyClothIdNotBetween(Integer value1, Integer value2) {
            addCriterion("my_diy_cloth_id not between", value1, value2, "myDiyClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdIsNull() {
            addCriterion("business_cloth_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdIsNotNull() {
            addCriterion("business_cloth_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdEqualTo(Integer value) {
            addCriterion("business_cloth_id =", value, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdNotEqualTo(Integer value) {
            addCriterion("business_cloth_id <>", value, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdGreaterThan(Integer value) {
            addCriterion("business_cloth_id >", value, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_cloth_id >=", value, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdLessThan(Integer value) {
            addCriterion("business_cloth_id <", value, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_cloth_id <=", value, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdIn(List<Integer> values) {
            addCriterion("business_cloth_id in", values, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdNotIn(List<Integer> values) {
            addCriterion("business_cloth_id not in", values, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdBetween(Integer value1, Integer value2) {
            addCriterion("business_cloth_id between", value1, value2, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessClothIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_cloth_id not between", value1, value2, "businessClothId");
            return (Criteria) this;
        }

        public Criteria andLogoIdIsNull() {
            addCriterion("logo_id is null");
            return (Criteria) this;
        }

        public Criteria andLogoIdIsNotNull() {
            addCriterion("logo_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogoIdEqualTo(Integer value) {
            addCriterion("logo_id =", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdNotEqualTo(Integer value) {
            addCriterion("logo_id <>", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdGreaterThan(Integer value) {
            addCriterion("logo_id >", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logo_id >=", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdLessThan(Integer value) {
            addCriterion("logo_id <", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdLessThanOrEqualTo(Integer value) {
            addCriterion("logo_id <=", value, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdIn(List<Integer> values) {
            addCriterion("logo_id in", values, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdNotIn(List<Integer> values) {
            addCriterion("logo_id not in", values, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdBetween(Integer value1, Integer value2) {
            addCriterion("logo_id between", value1, value2, "logoId");
            return (Criteria) this;
        }

        public Criteria andLogoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logo_id not between", value1, value2, "logoId");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoIsNull() {
            addCriterion("is_business_logo is null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoIsNotNull() {
            addCriterion("is_business_logo is not null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoEqualTo(Boolean value) {
            addCriterion("is_business_logo =", value, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoNotEqualTo(Boolean value) {
            addCriterion("is_business_logo <>", value, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoGreaterThan(Boolean value) {
            addCriterion("is_business_logo >", value, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_business_logo >=", value, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoLessThan(Boolean value) {
            addCriterion("is_business_logo <", value, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoLessThanOrEqualTo(Boolean value) {
            addCriterion("is_business_logo <=", value, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoIn(List<Boolean> values) {
            addCriterion("is_business_logo in", values, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoNotIn(List<Boolean> values) {
            addCriterion("is_business_logo not in", values, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoBetween(Boolean value1, Boolean value2) {
            addCriterion("is_business_logo between", value1, value2, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLogoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_business_logo not between", value1, value2, "isBusinessLogo");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlIsNull() {
            addCriterion("diy_img_url is null");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlIsNotNull() {
            addCriterion("diy_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlEqualTo(String value) {
            addCriterion("diy_img_url =", value, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlNotEqualTo(String value) {
            addCriterion("diy_img_url <>", value, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlGreaterThan(String value) {
            addCriterion("diy_img_url >", value, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("diy_img_url >=", value, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlLessThan(String value) {
            addCriterion("diy_img_url <", value, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlLessThanOrEqualTo(String value) {
            addCriterion("diy_img_url <=", value, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlLike(String value) {
            addCriterion("diy_img_url like", value, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlNotLike(String value) {
            addCriterion("diy_img_url not like", value, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlIn(List<String> values) {
            addCriterion("diy_img_url in", values, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlNotIn(List<String> values) {
            addCriterion("diy_img_url not in", values, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlBetween(String value1, String value2) {
            addCriterion("diy_img_url between", value1, value2, "diyImgUrl");
            return (Criteria) this;
        }

        public Criteria andDiyImgUrlNotBetween(String value1, String value2) {
            addCriterion("diy_img_url not between", value1, value2, "diyImgUrl");
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