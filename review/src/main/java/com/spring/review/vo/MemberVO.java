package com.spring.review.vo;

import java.util.List;

public class MemberVO {
	private String userId;
	private String userPw;
	private List<String> hobbys;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public List<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(List<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", userPw=" + userPw + ", hobbys=" + hobbys + "]";
	}
	
}
