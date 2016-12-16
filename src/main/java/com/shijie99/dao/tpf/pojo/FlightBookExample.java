package com.shijie99.dao.tpf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightBookExample() {
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

        public Criteria andBktypeIsNull() {
            addCriterion("bktype is null");
            return (Criteria) this;
        }

        public Criteria andBktypeIsNotNull() {
            addCriterion("bktype is not null");
            return (Criteria) this;
        }

        public Criteria andBktypeEqualTo(String value) {
            addCriterion("bktype =", value, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeNotEqualTo(String value) {
            addCriterion("bktype <>", value, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeGreaterThan(String value) {
            addCriterion("bktype >", value, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeGreaterThanOrEqualTo(String value) {
            addCriterion("bktype >=", value, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeLessThan(String value) {
            addCriterion("bktype <", value, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeLessThanOrEqualTo(String value) {
            addCriterion("bktype <=", value, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeLike(String value) {
            addCriterion("bktype like", value, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeNotLike(String value) {
            addCriterion("bktype not like", value, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeIn(List<String> values) {
            addCriterion("bktype in", values, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeNotIn(List<String> values) {
            addCriterion("bktype not in", values, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeBetween(String value1, String value2) {
            addCriterion("bktype between", value1, value2, "bktype");
            return (Criteria) this;
        }

        public Criteria andBktypeNotBetween(String value1, String value2) {
            addCriterion("bktype not between", value1, value2, "bktype");
            return (Criteria) this;
        }

        public Criteria andDsIsNull() {
            addCriterion("ds is null");
            return (Criteria) this;
        }

        public Criteria andDsIsNotNull() {
            addCriterion("ds is not null");
            return (Criteria) this;
        }

        public Criteria andDsEqualTo(String value) {
            addCriterion("ds =", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotEqualTo(String value) {
            addCriterion("ds <>", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsGreaterThan(String value) {
            addCriterion("ds >", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsGreaterThanOrEqualTo(String value) {
            addCriterion("ds >=", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLessThan(String value) {
            addCriterion("ds <", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLessThanOrEqualTo(String value) {
            addCriterion("ds <=", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLike(String value) {
            addCriterion("ds like", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotLike(String value) {
            addCriterion("ds not like", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsIn(List<String> values) {
            addCriterion("ds in", values, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotIn(List<String> values) {
            addCriterion("ds not in", values, "ds");
            return (Criteria) this;
        }

        public Criteria andDsBetween(String value1, String value2) {
            addCriterion("ds between", value1, value2, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotBetween(String value1, String value2) {
            addCriterion("ds not between", value1, value2, "ds");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andPriceinfoIsNull() {
            addCriterion("priceinfo is null");
            return (Criteria) this;
        }

        public Criteria andPriceinfoIsNotNull() {
            addCriterion("priceinfo is not null");
            return (Criteria) this;
        }

        public Criteria andPriceinfoEqualTo(String value) {
            addCriterion("priceinfo =", value, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoNotEqualTo(String value) {
            addCriterion("priceinfo <>", value, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoGreaterThan(String value) {
            addCriterion("priceinfo >", value, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoGreaterThanOrEqualTo(String value) {
            addCriterion("priceinfo >=", value, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoLessThan(String value) {
            addCriterion("priceinfo <", value, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoLessThanOrEqualTo(String value) {
            addCriterion("priceinfo <=", value, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoLike(String value) {
            addCriterion("priceinfo like", value, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoNotLike(String value) {
            addCriterion("priceinfo not like", value, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoIn(List<String> values) {
            addCriterion("priceinfo in", values, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoNotIn(List<String> values) {
            addCriterion("priceinfo not in", values, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoBetween(String value1, String value2) {
            addCriterion("priceinfo between", value1, value2, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andPriceinfoNotBetween(String value1, String value2) {
            addCriterion("priceinfo not between", value1, value2, "priceinfo");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNull() {
            addCriterion("execute_time is null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIsNotNull() {
            addCriterion("execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeEqualTo(Integer value) {
            addCriterion("execute_time =", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotEqualTo(Integer value) {
            addCriterion("execute_time <>", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThan(Integer value) {
            addCriterion("execute_time >", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("execute_time >=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThan(Integer value) {
            addCriterion("execute_time <", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeLessThanOrEqualTo(Integer value) {
            addCriterion("execute_time <=", value, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeIn(List<Integer> values) {
            addCriterion("execute_time in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotIn(List<Integer> values) {
            addCriterion("execute_time not in", values, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeBetween(Integer value1, Integer value2) {
            addCriterion("execute_time between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andExecuteTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("execute_time not between", value1, value2, "executeTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
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

        public Criteria andFromcityIsNull() {
            addCriterion("fromcity is null");
            return (Criteria) this;
        }

        public Criteria andFromcityIsNotNull() {
            addCriterion("fromcity is not null");
            return (Criteria) this;
        }

        public Criteria andFromcityEqualTo(String value) {
            addCriterion("fromcity =", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotEqualTo(String value) {
            addCriterion("fromcity <>", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityGreaterThan(String value) {
            addCriterion("fromcity >", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityGreaterThanOrEqualTo(String value) {
            addCriterion("fromcity >=", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLessThan(String value) {
            addCriterion("fromcity <", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLessThanOrEqualTo(String value) {
            addCriterion("fromcity <=", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLike(String value) {
            addCriterion("fromcity like", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotLike(String value) {
            addCriterion("fromcity not like", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityIn(List<String> values) {
            addCriterion("fromcity in", values, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotIn(List<String> values) {
            addCriterion("fromcity not in", values, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityBetween(String value1, String value2) {
            addCriterion("fromcity between", value1, value2, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotBetween(String value1, String value2) {
            addCriterion("fromcity not between", value1, value2, "fromcity");
            return (Criteria) this;
        }

        public Criteria andTocityIsNull() {
            addCriterion("tocity is null");
            return (Criteria) this;
        }

        public Criteria andTocityIsNotNull() {
            addCriterion("tocity is not null");
            return (Criteria) this;
        }

        public Criteria andTocityEqualTo(String value) {
            addCriterion("tocity =", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotEqualTo(String value) {
            addCriterion("tocity <>", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityGreaterThan(String value) {
            addCriterion("tocity >", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityGreaterThanOrEqualTo(String value) {
            addCriterion("tocity >=", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLessThan(String value) {
            addCriterion("tocity <", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLessThanOrEqualTo(String value) {
            addCriterion("tocity <=", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLike(String value) {
            addCriterion("tocity like", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotLike(String value) {
            addCriterion("tocity not like", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityIn(List<String> values) {
            addCriterion("tocity in", values, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotIn(List<String> values) {
            addCriterion("tocity not in", values, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityBetween(String value1, String value2) {
            addCriterion("tocity between", value1, value2, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotBetween(String value1, String value2) {
            addCriterion("tocity not between", value1, value2, "tocity");
            return (Criteria) this;
        }

        public Criteria andFromdateIsNull() {
            addCriterion("fromdate is null");
            return (Criteria) this;
        }

        public Criteria andFromdateIsNotNull() {
            addCriterion("fromdate is not null");
            return (Criteria) this;
        }

        public Criteria andFromdateEqualTo(String value) {
            addCriterion("fromdate =", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotEqualTo(String value) {
            addCriterion("fromdate <>", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateGreaterThan(String value) {
            addCriterion("fromdate >", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateGreaterThanOrEqualTo(String value) {
            addCriterion("fromdate >=", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateLessThan(String value) {
            addCriterion("fromdate <", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateLessThanOrEqualTo(String value) {
            addCriterion("fromdate <=", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateLike(String value) {
            addCriterion("fromdate like", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotLike(String value) {
            addCriterion("fromdate not like", value, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateIn(List<String> values) {
            addCriterion("fromdate in", values, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotIn(List<String> values) {
            addCriterion("fromdate not in", values, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateBetween(String value1, String value2) {
            addCriterion("fromdate between", value1, value2, "fromdate");
            return (Criteria) this;
        }

        public Criteria andFromdateNotBetween(String value1, String value2) {
            addCriterion("fromdate not between", value1, value2, "fromdate");
            return (Criteria) this;
        }

        public Criteria andRetdateIsNull() {
            addCriterion("retdate is null");
            return (Criteria) this;
        }

        public Criteria andRetdateIsNotNull() {
            addCriterion("retdate is not null");
            return (Criteria) this;
        }

        public Criteria andRetdateEqualTo(String value) {
            addCriterion("retdate =", value, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateNotEqualTo(String value) {
            addCriterion("retdate <>", value, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateGreaterThan(String value) {
            addCriterion("retdate >", value, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateGreaterThanOrEqualTo(String value) {
            addCriterion("retdate >=", value, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateLessThan(String value) {
            addCriterion("retdate <", value, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateLessThanOrEqualTo(String value) {
            addCriterion("retdate <=", value, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateLike(String value) {
            addCriterion("retdate like", value, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateNotLike(String value) {
            addCriterion("retdate not like", value, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateIn(List<String> values) {
            addCriterion("retdate in", values, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateNotIn(List<String> values) {
            addCriterion("retdate not in", values, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateBetween(String value1, String value2) {
            addCriterion("retdate between", value1, value2, "retdate");
            return (Criteria) this;
        }

        public Criteria andRetdateNotBetween(String value1, String value2) {
            addCriterion("retdate not between", value1, value2, "retdate");
            return (Criteria) this;
        }

        public Criteria andFlighttypeIsNull() {
            addCriterion("flighttype is null");
            return (Criteria) this;
        }

        public Criteria andFlighttypeIsNotNull() {
            addCriterion("flighttype is not null");
            return (Criteria) this;
        }

        public Criteria andFlighttypeEqualTo(String value) {
            addCriterion("flighttype =", value, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeNotEqualTo(String value) {
            addCriterion("flighttype <>", value, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeGreaterThan(String value) {
            addCriterion("flighttype >", value, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeGreaterThanOrEqualTo(String value) {
            addCriterion("flighttype >=", value, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeLessThan(String value) {
            addCriterion("flighttype <", value, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeLessThanOrEqualTo(String value) {
            addCriterion("flighttype <=", value, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeLike(String value) {
            addCriterion("flighttype like", value, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeNotLike(String value) {
            addCriterion("flighttype not like", value, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeIn(List<String> values) {
            addCriterion("flighttype in", values, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeNotIn(List<String> values) {
            addCriterion("flighttype not in", values, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeBetween(String value1, String value2) {
            addCriterion("flighttype between", value1, value2, "flighttype");
            return (Criteria) this;
        }

        public Criteria andFlighttypeNotBetween(String value1, String value2) {
            addCriterion("flighttype not between", value1, value2, "flighttype");
            return (Criteria) this;
        }

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andCachehashIsNull() {
            addCriterion("cachehash is null");
            return (Criteria) this;
        }

        public Criteria andCachehashIsNotNull() {
            addCriterion("cachehash is not null");
            return (Criteria) this;
        }

        public Criteria andCachehashEqualTo(String value) {
            addCriterion("cachehash =", value, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashNotEqualTo(String value) {
            addCriterion("cachehash <>", value, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashGreaterThan(String value) {
            addCriterion("cachehash >", value, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashGreaterThanOrEqualTo(String value) {
            addCriterion("cachehash >=", value, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashLessThan(String value) {
            addCriterion("cachehash <", value, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashLessThanOrEqualTo(String value) {
            addCriterion("cachehash <=", value, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashLike(String value) {
            addCriterion("cachehash like", value, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashNotLike(String value) {
            addCriterion("cachehash not like", value, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashIn(List<String> values) {
            addCriterion("cachehash in", values, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashNotIn(List<String> values) {
            addCriterion("cachehash not in", values, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashBetween(String value1, String value2) {
            addCriterion("cachehash between", value1, value2, "cachehash");
            return (Criteria) this;
        }

        public Criteria andCachehashNotBetween(String value1, String value2) {
            addCriterion("cachehash not between", value1, value2, "cachehash");
            return (Criteria) this;
        }

        public Criteria andQhashIsNull() {
            addCriterion("qhash is null");
            return (Criteria) this;
        }

        public Criteria andQhashIsNotNull() {
            addCriterion("qhash is not null");
            return (Criteria) this;
        }

        public Criteria andQhashEqualTo(String value) {
            addCriterion("qhash =", value, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashNotEqualTo(String value) {
            addCriterion("qhash <>", value, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashGreaterThan(String value) {
            addCriterion("qhash >", value, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashGreaterThanOrEqualTo(String value) {
            addCriterion("qhash >=", value, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashLessThan(String value) {
            addCriterion("qhash <", value, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashLessThanOrEqualTo(String value) {
            addCriterion("qhash <=", value, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashLike(String value) {
            addCriterion("qhash like", value, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashNotLike(String value) {
            addCriterion("qhash not like", value, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashIn(List<String> values) {
            addCriterion("qhash in", values, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashNotIn(List<String> values) {
            addCriterion("qhash not in", values, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashBetween(String value1, String value2) {
            addCriterion("qhash between", value1, value2, "qhash");
            return (Criteria) this;
        }

        public Criteria andQhashNotBetween(String value1, String value2) {
            addCriterion("qhash not between", value1, value2, "qhash");
            return (Criteria) this;
        }

        public Criteria andRoutecodesIsNull() {
            addCriterion("routecodes is null");
            return (Criteria) this;
        }

        public Criteria andRoutecodesIsNotNull() {
            addCriterion("routecodes is not null");
            return (Criteria) this;
        }

        public Criteria andRoutecodesEqualTo(String value) {
            addCriterion("routecodes =", value, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesNotEqualTo(String value) {
            addCriterion("routecodes <>", value, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesGreaterThan(String value) {
            addCriterion("routecodes >", value, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesGreaterThanOrEqualTo(String value) {
            addCriterion("routecodes >=", value, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesLessThan(String value) {
            addCriterion("routecodes <", value, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesLessThanOrEqualTo(String value) {
            addCriterion("routecodes <=", value, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesLike(String value) {
            addCriterion("routecodes like", value, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesNotLike(String value) {
            addCriterion("routecodes not like", value, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesIn(List<String> values) {
            addCriterion("routecodes in", values, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesNotIn(List<String> values) {
            addCriterion("routecodes not in", values, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesBetween(String value1, String value2) {
            addCriterion("routecodes between", value1, value2, "routecodes");
            return (Criteria) this;
        }

        public Criteria andRoutecodesNotBetween(String value1, String value2) {
            addCriterion("routecodes not between", value1, value2, "routecodes");
            return (Criteria) this;
        }

        public Criteria andDsidIsNull() {
            addCriterion("dsid is null");
            return (Criteria) this;
        }

        public Criteria andDsidIsNotNull() {
            addCriterion("dsid is not null");
            return (Criteria) this;
        }

        public Criteria andDsidEqualTo(String value) {
            addCriterion("dsid =", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotEqualTo(String value) {
            addCriterion("dsid <>", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidGreaterThan(String value) {
            addCriterion("dsid >", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidGreaterThanOrEqualTo(String value) {
            addCriterion("dsid >=", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLessThan(String value) {
            addCriterion("dsid <", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLessThanOrEqualTo(String value) {
            addCriterion("dsid <=", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidLike(String value) {
            addCriterion("dsid like", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotLike(String value) {
            addCriterion("dsid not like", value, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidIn(List<String> values) {
            addCriterion("dsid in", values, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotIn(List<String> values) {
            addCriterion("dsid not in", values, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidBetween(String value1, String value2) {
            addCriterion("dsid between", value1, value2, "dsid");
            return (Criteria) this;
        }

        public Criteria andDsidNotBetween(String value1, String value2) {
            addCriterion("dsid not between", value1, value2, "dsid");
            return (Criteria) this;
        }

        public Criteria andFromtoIsNull() {
            addCriterion("fromto is null");
            return (Criteria) this;
        }

        public Criteria andFromtoIsNotNull() {
            addCriterion("fromto is not null");
            return (Criteria) this;
        }

        public Criteria andFromtoEqualTo(String value) {
            addCriterion("fromto =", value, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoNotEqualTo(String value) {
            addCriterion("fromto <>", value, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoGreaterThan(String value) {
            addCriterion("fromto >", value, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoGreaterThanOrEqualTo(String value) {
            addCriterion("fromto >=", value, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoLessThan(String value) {
            addCriterion("fromto <", value, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoLessThanOrEqualTo(String value) {
            addCriterion("fromto <=", value, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoLike(String value) {
            addCriterion("fromto like", value, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoNotLike(String value) {
            addCriterion("fromto not like", value, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoIn(List<String> values) {
            addCriterion("fromto in", values, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoNotIn(List<String> values) {
            addCriterion("fromto not in", values, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoBetween(String value1, String value2) {
            addCriterion("fromto between", value1, value2, "fromto");
            return (Criteria) this;
        }

        public Criteria andFromtoNotBetween(String value1, String value2) {
            addCriterion("fromto not between", value1, value2, "fromto");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNull() {
            addCriterion("lastdate is null");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNotNull() {
            addCriterion("lastdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastdateEqualTo(Date value) {
            addCriterion("lastdate =", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotEqualTo(Date value) {
            addCriterion("lastdate <>", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThan(Date value) {
            addCriterion("lastdate >", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastdate >=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThan(Date value) {
            addCriterion("lastdate <", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThanOrEqualTo(Date value) {
            addCriterion("lastdate <=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIn(List<Date> values) {
            addCriterion("lastdate in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotIn(List<Date> values) {
            addCriterion("lastdate not in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateBetween(Date value1, Date value2) {
            addCriterion("lastdate between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotBetween(Date value1, Date value2) {
            addCriterion("lastdate not between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoIsNull() {
            addCriterion("price_add_info is null");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoIsNotNull() {
            addCriterion("price_add_info is not null");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoEqualTo(String value) {
            addCriterion("price_add_info =", value, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoNotEqualTo(String value) {
            addCriterion("price_add_info <>", value, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoGreaterThan(String value) {
            addCriterion("price_add_info >", value, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoGreaterThanOrEqualTo(String value) {
            addCriterion("price_add_info >=", value, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoLessThan(String value) {
            addCriterion("price_add_info <", value, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoLessThanOrEqualTo(String value) {
            addCriterion("price_add_info <=", value, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoLike(String value) {
            addCriterion("price_add_info like", value, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoNotLike(String value) {
            addCriterion("price_add_info not like", value, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoIn(List<String> values) {
            addCriterion("price_add_info in", values, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoNotIn(List<String> values) {
            addCriterion("price_add_info not in", values, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoBetween(String value1, String value2) {
            addCriterion("price_add_info between", value1, value2, "priceAddInfo");
            return (Criteria) this;
        }

        public Criteria andPriceAddInfoNotBetween(String value1, String value2) {
            addCriterion("price_add_info not between", value1, value2, "priceAddInfo");
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