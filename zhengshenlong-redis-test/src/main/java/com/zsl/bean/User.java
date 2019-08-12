package com.zsl.bean;

import java.io.Serializable;

public class User implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	/**
	 * 属性 ：id
	 */
	private Integer id;
	/**
	 * 属性:name
	 */
	private String name;
	/**
	 * 属性：sex
	 */
	private String sex;
	/**
	 * 属性:phone
	 */
	private String phone;
	/**
	 * 属性：email
	 */
	private String email;
	/**
	 * 属性：birthday
	 */
	private String birthday;
	public User(Integer id, String name, String sex, String phone, String email, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", email=" + email
				+ ", birthday=" + birthday + "]";
	}

  
}
