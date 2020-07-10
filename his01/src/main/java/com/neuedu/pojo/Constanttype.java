package com.neuedu.pojo;

public class Constanttype {
    private Integer constanttypeid;

    private String constanttypecode;

    private String constanttypename;

    private Integer delmark;

    public Integer getConstanttypeid() {
        return constanttypeid;
    }

    public void setConstanttypeid(Integer constanttypeid) {
        this.constanttypeid = constanttypeid;
    }

    public String getConstanttypecode() {
        return constanttypecode;
    }

    public void setConstanttypecode(String constanttypecode) {
        this.constanttypecode = constanttypecode == null ? null : constanttypecode.trim();
    }

    public String getConstanttypename() {
        return constanttypename;
    }

    public void setConstanttypename(String constanttypename) {
        this.constanttypename = constanttypename == null ? null : constanttypename.trim();
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}