package com.at.pojo;

/**
 * 章节的pojo类
 * @author shaoduo
 *
 */
public class Chapter {
	private int id ;  //id
	private int chaNum ;  //本书当中第几个章节的那个数字	
	private String chaNm ;  // 章节名称
	private String content ;  //正文 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChaNum() {
		return chaNum;
	}
	public void setChaNum(int chaNum) {
		this.chaNum = chaNum;
	}
	public String getChaNm() {
		return chaNm;
	}
	public void setChaNm(String chaNm) {
		this.chaNm = chaNm;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	} 
		
	
}
