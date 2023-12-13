package com.flyaway.simplilearn.dto;

import com.flyaway.simplilearn.entity.UserClass;

public class Userdto {
	private UserClass userclass;
	private String newPassword;

	public Userdto() {
		super();
	}

	public Userdto(UserClass userclass, String newPassword) {
		super();
		this.userclass = userclass;
		this.newPassword = newPassword;
	}

	public UserClass getUserclass() {
		return userclass;
	}

	public void setUserclass(UserClass userclass) {
		this.userclass = userclass;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
