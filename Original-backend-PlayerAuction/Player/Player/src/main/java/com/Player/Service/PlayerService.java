package com.Player.Service;

import java.util.List;

import com.Player.Entity.Player;
import com.Player.Model.Team;
import com.Player.Repository.PlayerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PlayerService {

	@Autowired
	private PlayerRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Player> findPlayerByTeamName(String teamName){
		return repo.findByTeamName(teamName);
	}
	
	public ResponseEntity<?> savePlaye(Player player){
		Team tRes = restTemplate.getForObject("http://TEAM-SERVICE/restTeam/findteam/"+player.getTeamName(), Team.class);
		int sum=0;
		List<Player> playerList = repo.findByTeamName(tRes.getTeamName());
		for(Player playerLoop: playerList) {
			sum = sum+playerLoop.getPlayerBudget();
		}
		if(sum <= tRes.getTeamBudget()) {
			sum = sum+player.getPlayerBudget();
		}
		if(sum <= tRes.getTeamBudget()) {
			repo.save(player);
			return ResponseEntity.ok(player);
		}
		else {
			player.setTeamName("NA");
			repo.save(player);
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
	}
	
	public ResponseEntity<?> findPlayerId(int playerId){
		if(repo.findByPlayerId(playerId) == null) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
		
		return ResponseEntity.ok(repo.findByPlayerId(playerId));
	}
	
	
}


