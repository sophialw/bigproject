package com.neuedu.pojo;

public class User {
	
    private Integer userid;

    private String username;

    private String password;

    private String realname;

    private Integer usertype;

    private Integer doctitleid;

    private Integer isscheduling;

    private Integer departmentid;

    private Integer registlevelid;

    private Integer delmark;
    
    
    private String yhlx;  //用户类型：门诊医生、医技医生
    
    private String yszc; //医生职称
    
    private String deptname; //科室名称
    
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

	public String getYhlx() {
		return yhlx;
	}

	public void setYhlx(String yhlx) {
		this.yhlx = yhlx;
	}

	public String getYszc() {
		return yszc;
	}

	public void setYszc(String yszc) {
		this.yszc = yszc;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getDoctitleid() {
        return doctitleid;
    }

    public void setDoctitleid(Integer doctitleid) {
        this.doctitleid = doctitleid;
    }

    public Integer getIsscheduling() {
        return isscheduling;
    }

    public void setIsscheduling(Integer isscheduling) {
        this.isscheduling = isscheduling;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getRegistlevelid() {
        return registlevelid;
    }

    public void setRegistlevelid(Integer registlevelid) {
        this.registlevelid = registlevelid;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}