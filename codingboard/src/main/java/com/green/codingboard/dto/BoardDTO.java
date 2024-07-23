package com.green.codingboard.dto;

import java.sql.Timestamp;

public class BoardDTO {
	private Long boardNo;
	private String boardWriter;
	private String boardPass;
	private String boardTitle;
	private String boardContents;
	private Timestamp boardCreatedTime;
	private int boardHits;
	
	public BoardDTO() {}
	public BoardDTO(Long boardNo, String boardWriter, String boardPass, String boardTitle,
			String boardContents, Timestamp boardCreatedTime, int boardHits) {
		this.boardNo = boardNo;
		this.boardWriter = boardWriter;
		this.boardPass = boardPass;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
		this.boardCreatedTime = boardCreatedTime;
		this.boardHits = boardHits;
	}
	
	public Long getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(Long boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardPass() {
		return boardPass;
	}
	public void setBoardPass(String boardPass) {
		this.boardPass = boardPass;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	public Timestamp getBoardCreatedTime() {
		return boardCreatedTime;
	}
	public void setBoardCreatedTime(Timestamp boardCreatedTime) {
		this.boardCreatedTime = boardCreatedTime;
	}
	public int getBoardHits() {
		return boardHits;
	}
	public void setBoardHits(int boardHits) {
		this.boardHits = boardHits;
	}
}
