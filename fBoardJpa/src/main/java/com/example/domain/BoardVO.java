package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="board")
public class BoardVO {
	
	//기본키 생성을 데이터베이스에게 위임하는 방식으로 id값을 따로 할당하지 않아도 데이터베이스가 자동으로 AUTO_INCREMENT를 하여 기본키를 생성해준다.
	@Id
	@GeneratedValue
	private Integer seq;
	
	private String writer;
	private String title;
	private String content;
	@Column(insertable = false, updatable = false,
			columnDefinition ="date default sysdate")
	private String regdate;
	@Column(columnDefinition = "number default 0")
	private Integer cnt;
	
	/*
	// toString()
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", writer=" + writer + ", title=" + title + ", content=" + content + ", regdate="
				+ regdate + ", cnt=" + cnt + "]";
	}
	
	// setter , getter 
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	*/
}
