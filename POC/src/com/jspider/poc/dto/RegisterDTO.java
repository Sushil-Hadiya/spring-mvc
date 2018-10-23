package com.jspider.poc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "registerdrop")
public class RegisterDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "any", strategy = "increment")
	@GeneratedValue(generator = "any")
	@Column(name = "R_ID")
	private Long id;
	@Column(name = "R_USERNAME")
	private String username;
	@Column(name = "R_PASSWORD")
	private String password;
	@Column(name = "R_PHONENUMBER")
	private Long phoneNumber;
	@Column(name = "R_COUNTRY")
	private String country;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "RegisterDTO [username=" + username + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", country=" + country + "]";
	}

}
