package com.gqt.HibernatServlet.beans;

public class Employee {
	int empid;
	String empname;
	String empaddress;
	int empsalary;
	String empcompany;
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public String getEmpcompany() {
		return empcompany;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public void setEmpcompany(String empcompany) {
		this.empcompany = empcompany;
	}
}

