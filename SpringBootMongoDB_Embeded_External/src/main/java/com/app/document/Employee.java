package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	
	
	@Id
	private String id;
	private Integer empID;
	private String empName;
	private String empAdd;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, Integer empID, String empName, String empAdd) {
		super();
		this.id = id;
		this.empID = empID;
		this.empName = empName;
		this.empAdd = empAdd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empID=" + empID + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}

	
}
