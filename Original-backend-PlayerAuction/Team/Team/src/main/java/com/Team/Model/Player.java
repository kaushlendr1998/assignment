package com.Team.Model;

public class Player {
	
	private int playerId;
	private String playerName;
	private int PlayerBudget;
	private String teamName;
	
	public Player() {
		super();
	}
	
	public Player(int playerId, String playerName, int playerBudget, String teamName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		PlayerBudget = playerBudget;
		this.teamName = teamName;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerBudget() {
		return PlayerBudget;
	}
	public void setPlayerBudget(int playerBudget) {
		PlayerBudget = playerBudget;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
	
	

}
