package com.src.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private	int id;
	private String Username;
	private String pw;
	private	String msg;
	public Emp() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", Username=" + Username + ", pw=" + pw + ", msg=" + msg + "]";
	}
	public Emp(int id, String username, String pw, String msg) {
		super();
		this.id = id;
		this.Username = username;
		this.pw = pw;
		this.msg = msg;
	}
	
	
	
}