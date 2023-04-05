package com.profile.domain;

import java.util.Date;

public class Question {
	private int renum;
	private String content;
	private Date redate;
	
	public int getRenum() {
		return renum;
	}
	public void setRenum(int renum) {
		this.renum = renum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRedate() {
		return redate;
	}
	public void setRedate(Date redate) {
		this.redate = redate;
	}
	
	@Override
	public String toString() {
		return "Reply [renum=" + renum + ", content=" + content + ", redate=" + redate + "]";
	}
	
}
