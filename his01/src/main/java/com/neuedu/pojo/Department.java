package com.neuedu.pojo;

public class Department {
    private Integer departmentid;

    private String deptcode;

    private String deptname;

    private Integer deptcategoryid;

    private Integer depttype;

    private Integer delmark;

    private String ksfl; //科室分类  内科，外科。。。
    
    private String kslx; //科室类型： 临床科室、行政、财务。。
    
    private Integer beginIndex;
    
    private Integer pageSize;
    
    
    
    public String getKsfl() {
		return ksfl;
	}

	public void setKsfl(String ksfl) {
		this.ksfl = ksfl;
	}

	public String getKslx() {
		return kslx;
	}

	public void setKslx(String kslx) {
		this.kslx = kslx;
	}

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

	public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public Integer getDeptcategoryid() {
        return deptcategoryid;
    }

    public void setDeptcategoryid(Integer deptcategoryid) {
        this.deptcategoryid = deptcategoryid;
    }

    public Integer getDepttype() {
        return depttype;
    }

    public void setDepttype(Integer depttype) {
        this.depttype = depttype;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}