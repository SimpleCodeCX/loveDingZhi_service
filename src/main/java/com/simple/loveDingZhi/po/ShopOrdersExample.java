package com.simple.loveDingZhi.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopOrdersExample() {
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

        public Criteria andOrderDetailIdIsNull() {
            addCriterion("order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNotNull() {
            addCriterion("order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdEqualTo(Integer value) {
            addCriterion("order_detail_id =", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotEqualTo(Integer value) {
            addCriterion("order_detail_id <>", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThan(Integer value) {
            addCriterion("order_detail_id >", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_detail_id >=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThan(Integer value) {
            addCriterion("order_detail_id <", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_detail_id <=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIn(List<Integer> values) {
            addCriterion("order_detail_id in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotIn(List<Integer> values) {
            addCriterion("order_detail_id not in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("order_detail_id between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_detail_id not between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdIsNull() {
            addCriterion("bussiness_cloth_id is null");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdIsNotNull() {
            addCriterion("bussiness_cloth_id is not null");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdEqualTo(Integer value) {
            addCriterion("bussiness_cloth_id =", value, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdNotEqualTo(Integer value) {
            addCriterion("bussiness_cloth_id <>", value, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdGreaterThan(Integer value) {
            addCriterion("bussiness_cloth_id >", value, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bussiness_cloth_id >=", value, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdLessThan(Integer value) {
            addCriterion("bussiness_cloth_id <", value, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdLessThanOrEqualTo(Integer value) {
            addCriterion("bussiness_cloth_id <=", value, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdIn(List<Integer> values) {
            addCriterion("bussiness_cloth_id in", values, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdNotIn(List<Integer> values) {
            addCriterion("bussiness_cloth_id not in", values, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdBetween(Integer value1, Integer value2) {
            addCriterion("bussiness_cloth_id between", value1, value2, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBussinessClothIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bussiness_cloth_id not between", value1, value2, "bussinessClothId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdIsNull() {
            addCriterion("business_logo_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdIsNotNull() {
            addCriterion("business_logo_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdEqualTo(Integer value) {
            addCriterion("business_logo_id =", value, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdNotEqualTo(Integer value) {
            addCriterion("business_logo_id <>", value, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdGreaterThan(Integer value) {
            addCriterion("business_logo_id >", value, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_logo_id >=", value, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdLessThan(Integer value) {
            addCriterion("business_logo_id <", value, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_logo_id <=", value, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdIn(List<Integer> values) {
            addCriterion("business_logo_id in", values, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdNotIn(List<Integer> values) {
            addCriterion("business_logo_id not in", values, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdBetween(Integer value1, Integer value2) {
            addCriterion("business_logo_id between", value1, value2, "businessLogoId");
            return (Criteria) this;
        }

        public Criteria andBusinessLogoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_logo_id not between", value1, value2, "businessLogoId");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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