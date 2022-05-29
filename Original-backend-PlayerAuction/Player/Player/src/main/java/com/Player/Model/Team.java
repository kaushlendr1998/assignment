package com.Player.Model;

public class Team {

	
	public int teamId;
	private String teamName;
	private int teamBudget;
	
	public Team() {
		super();
	}
	
	public Team(int teamId, String teamName, int teamBudget) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamBudget = teamBudget;
	}
	
	public int getTeamId() {
		return teamId;
	}
	
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTeamBudget() {
		return teamBudget;
	}
	public void setTeamBudget(int teamBudget) {
		this.teamBudget = teamBudget;
	}
	
	
	
	
}
