package com.Player.Model;

import com.Player.Entity.Player;

public class ResponseVO {

	private Team team;
	private Player player;
	
	public ResponseVO() {
		super();
	}
	public ResponseVO(Team team, Player player) {
		super();
		this.team = team;
		this.player = player;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
}
