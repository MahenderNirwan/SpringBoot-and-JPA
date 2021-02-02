package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {



	private String uname;

	private String message;

	@Id
	private Integer id;

	public Message() {

	}

	public Message(String Uname, String message, int id) {
		super();
		this.uname = Uname;
		this.message = message;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String i) {
		this.message = i;
	}

}
