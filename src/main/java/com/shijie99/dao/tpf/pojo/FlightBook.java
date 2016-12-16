package com.shijie99.dao.tpf.pojo;

import java.util.Date;

public class FlightBook {
    private Integer id;

    private String bktype;

    private String ds;

    private String sessionId;

    private String priceinfo;

    private Integer executeTime;

    private Integer status;

    private String message;

    private String cid;

    private String fromcity;

    private String tocity;

    private String fromdate;

    private String retdate;

    private String flighttype;

    private String guid;

    private String cachehash;

    private String qhash;

    private String routecodes;

    private String dsid;

    private String fromto;

    private Date lastdate;

    private String priceAddInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBktype() {
        return bktype;
    }

    public void setBktype(String bktype) {
        this.bktype = bktype == null ? null : bktype.trim();
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds == null ? null : ds.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getPriceinfo() {
        return priceinfo;
    }

    public void setPriceinfo(String priceinfo) {
        this.priceinfo = priceinfo == null ? null : priceinfo.trim();
    }

    public Integer getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity == null ? null : fromcity.trim();
    }

    public String getTocity() {
        return tocity;
    }

    public void setTocity(String tocity) {
        this.tocity = tocity == null ? null : tocity.trim();
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate == null ? null : fromdate.trim();
    }

    public String getRetdate() {
        return retdate;
    }

    public void setRetdate(String retdate) {
        this.retdate = retdate == null ? null : retdate.trim();
    }

    public String getFlighttype() {
        return flighttype;
    }

    public void setFlighttype(String flighttype) {
        this.flighttype = flighttype == null ? null : flighttype.trim();
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getCachehash() {
        return cachehash;
    }

    public void setCachehash(String cachehash) {
        this.cachehash = cachehash == null ? null : cachehash.trim();
    }

    public String getQhash() {
        return qhash;
    }

    public void setQhash(String qhash) {
        this.qhash = qhash == null ? null : qhash.trim();
    }

    public String getRoutecodes() {
        return routecodes;
    }

    public void setRoutecodes(String routecodes) {
        this.routecodes = routecodes == null ? null : routecodes.trim();
    }

    public String getDsid() {
        return dsid;
    }

    public void setDsid(String dsid) {
        this.dsid = dsid == null ? null : dsid.trim();
    }

    public String getFromto() {
        return fromto;
    }

    public void setFromto(String fromto) {
        this.fromto = fromto == null ? null : fromto.trim();
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public String getPriceAddInfo() {
        return priceAddInfo;
    }

    public void setPriceAddInfo(String priceAddInfo) {
        this.priceAddInfo = priceAddInfo == null ? null : priceAddInfo.trim();
    }
}