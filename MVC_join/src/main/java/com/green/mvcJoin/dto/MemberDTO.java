package com.green.mvcJoin.dto;

public class MemberDTO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String birth;
	private String sns;
	
	public MemberDTO() {}
	public MemberDTO(String id, String pwd, String name,
			String email, String birth, String sns) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.birth = birth;
		this.sns = sns;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getSns() {
		return sns;
	}
	public void setSns(String sns) {
		this.sns = sns;
	}
}
