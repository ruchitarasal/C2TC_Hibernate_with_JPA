package com.tns.jpacrud.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int studentid;
	
	private String name;
	
	private String branch;
	
	private String address;
	
	private long mobileNo;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName1() {
		return branch;
	}

	public void setName1(String branch) {
		this.branch = branch;
	}
	
	public String getName2() {
		return address;
	}

	public void setName2(String address) {
		this.address = address;
	}
	
	public long getmobileNo() {
		return mobileNo ;
	}

	public void setmobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	
}