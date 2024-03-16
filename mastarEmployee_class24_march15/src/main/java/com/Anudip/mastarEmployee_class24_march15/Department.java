package com.Anudip.mastarEmployee_class24_march15;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int id;
	
	private String deptName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Department() {
		super();
	}

	public Department(int id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + "]";
	}
	
	
}
