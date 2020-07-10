package com.neuedu.pojo;

public class Registlevel {
    private Integer registlevelid;

    private String registcode;

    private String registname;

    private Integer sequenceno;

    private Double registfee;

    private Integer registquota;

    private Integer delmark;

    
    private Integer beginIndex;
    
    private Integer pageSize;
    
    
    public Integer getBeginIndex() {
		return beginIndex;
	}

	public void setBeginIndex(Integer beginIndex) {
		this.beginIndex = beginIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
    public Integer getRegistlevelid() {
        return registlevelid;
    }

    public void setRegistlevelid(Integer registlevelid) {
        this.registlevelid = registlevelid;
    }

    public String getRegistcode() {
        return registcode;
    }

    public void setRegistcode(String registcode) {
        this.registcode = registcode == null ? null : registcode.trim();
    }

    public String getRegistname() {
        return registname;
    }

    public void setRegistname(String registname) {
        this.registname = registname == null ? null : registname.trim();
    }

    public Integer getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(Integer sequenceno) {
        this.sequenceno = sequenceno;
    }

    public Double getRegistfee() {
        return registfee;
    }

    public void setRegistfee(Double registfee) {
        this.registfee = registfee;
    }

    public Integer getRegistquota() {
        return registquota;
    }

    public void setRegistquota(Integer registquota) {
        this.registquota = registquota;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}