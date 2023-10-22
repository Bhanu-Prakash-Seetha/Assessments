package com.infinite.SpringbootExample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "LOGINDATA")
public class Logindata {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="loginid")
	@NotEmpty(message="this field is mandatory..!")
	private String loginid;
	@Column(name="password")
	@NotEmpty(message="this field is mandatory..!")
	@Size(min=8,message="This field should be atleast 8 characters" )
	private String password;

	public Logindata() {

	}

	public Logindata(String loginid, String password) {
		this.loginid = loginid;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
