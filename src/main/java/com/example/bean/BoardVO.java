package com.example.bean;

import java.util.Date;

public class BoardVO {
	private int seq;
	private String category;
	private String title;
	private String writer;
	private String content;
	private String star;
	private  String num;
	private Date regdate;
	private int cnt;

	private String userid;
	private String password;
	private String username;

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {this.seq = seq;}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getStar() { return star; }
	public void setStar(String star) { this.star = star; }

	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getCnt() {return cnt; }
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getCategory() {return category;}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
