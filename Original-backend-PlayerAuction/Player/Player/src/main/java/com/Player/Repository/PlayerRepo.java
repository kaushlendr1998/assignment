package com.Player.Repository;

import java.util.List;

import com.Player.Entity.Player;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PlayerRepo extends JpaRepository<Player, Integer> {

	List<Player> findByTeamName(String teamName);
	
	Player findByPlayerId(int playerId);
}
