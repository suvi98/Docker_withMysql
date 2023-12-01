package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


//User Pojo

//lambok annotaion
@Data
@Entity

//create table in database
@Table(name="user")
public class User {

	@Id
	//for declared as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uid;
	
	
	//create the column in database by using @Column
	@Column(name="user_email")
	private String uemail;
	
	@Column(name="user_password")
	private String upassword;
	
	@Column(name="user_DOB")
	private String dateofbirth;

	public User(String uemail, String upassword, String dateofbirth) {
		super();
		this.uemail = uemail;
		this.upassword = upassword;
		this.dateofbirth = dateofbirth;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	
	
	
	
}
