package com.notificationconfig.backend.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NOTIFICATION_CONFIG")
public class NotificationConfig implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="MESSAGE")
	private String message;
	
	@Column(name="MOBILE_NO")
	private String mobile;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="SUBJECT")
	private String subject;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	
	

}
