package com.zsl.redis_zsl.bean;

import java.io.Serializable;

public class User implements  Serializable {

 
	private static final long serialVersionUID = 1L;
 
	private Integer id;
	 
	private String name;
	 
	private String sex;
	 
	private String address;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", address=" + address + "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(Integer id, String name, String sex, String address) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.address = address;
	}
	   
}
