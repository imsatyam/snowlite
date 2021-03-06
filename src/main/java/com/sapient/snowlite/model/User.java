package com.sapient.snowlite.model;

import java.io.Serializable;

public final class User implements Serializable{

	private static final long serialVersionUID = 3142393716585386641L;
	
	private String userId;
	private String name;
	private String email;
	private Team team;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
}
