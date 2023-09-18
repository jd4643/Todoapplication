package com.demo.model;

import java.util.Date;

public class Todo {

	private int id;
	private String user;
	private String desc;
	private Date targetDate;

	public Date getTargetDate() {
		return targetDate;
	}

	private Boolean isDone;

	public Todo(int id, String user, String desc, Date targetDate, Boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;

		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public String getuser() {
		return user;
	}

	public String getDesc() {
		return desc;
	}

	public Boolean getIsDone() {
		return isDone;
	}

}
