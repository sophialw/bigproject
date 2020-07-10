package com.neuedu.pojo;

public class Cconstantitem {
    private Integer constrantitemid;

    private Integer constanttypeid;

    private String constantcode;

    private String constantname;

    private Integer delmark;

    public Integer getConstrantitemid() {
        return constrantitemid;
    }

    public void setConstrantitemid(Integer constrantitemid) {
        this.constrantitemid = constrantitemid;
    }

    public Integer getConstanttypeid() {
        return constanttypeid;
    }

    public void setConstanttypeid(Integer constanttypeid) {
        this.constanttypeid = constanttypeid;
    }

    public String getConstantcode() {
        return constantcode;
    }

    public void setConstantcode(String constantcode) {
        this.constantcode = constantcode == null ? null : constantcode.trim();
    }

    public String getConstantname() {
        return constantname;
    }

    public void setConstantname(String constantname) {
        this.constantname = constantname == null ? null : constantname.trim();
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}