package com.shijie99.dao.tpf.pojo;

public class FlightBookWithBLOBs extends FlightBook {
    private String content;

    private String olddata;

    private String queryConditions;

    private String routings;

    private String pricestr;

    private String qunarJson;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOlddata() {
        return olddata;
    }

    public void setOlddata(String olddata) {
        this.olddata = olddata == null ? null : olddata.trim();
    }

    public String getQueryConditions() {
        return queryConditions;
    }

    public void setQueryConditions(String queryConditions) {
        this.queryConditions = queryConditions == null ? null : queryConditions.trim();
    }

    public String getRoutings() {
        return routings;
    }

    public void setRoutings(String routings) {
        this.routings = routings == null ? null : routings.trim();
    }

    public String getPricestr() {
        return pricestr;
    }

    public void setPricestr(String pricestr) {
        this.pricestr = pricestr == null ? null : pricestr.trim();
    }

    public String getQunarJson() {
        return qunarJson;
    }

    public void setQunarJson(String qunarJson) {
        this.qunarJson = qunarJson == null ? null : qunarJson.trim();
    }
}