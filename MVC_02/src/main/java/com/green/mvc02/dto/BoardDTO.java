package com.green.mvc02.dto;

public class BoardDTO {
	private String title;
	private String content;
	private int viewcount;
	
	public BoardDTO() {}
	public BoardDTO(String title, String content, int viewcount) {
		this.title = title;
		this.content = content;
		this.viewcount = viewcount;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
}
