package com.Team.Service;

import com.Team.Entity.Team;
import com.Team.Model.Player;
import com.Team.Repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;
	

	public ResponseEntity<?> checkTeam(Team team) {
		if(repo.findPlyerByTeamName(team.getTeamName()) != null) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
		repo.save(team);
		return ResponseEntity.ok(team);
		
	}


	public Player[] findPlayerByName(String teamName) {
		
		ResponseEntity<Player[]> res =
					restTemplate.getForEntity("http://PLAYER-SERVICE/restPlayer/findPlayerByTeamName/"+teamName, Player[].class);
		
		Player[] player = res.getBody();
		return player;
		
	}


	public Team findDetails(String teamName) {
		
		return repo.findPlyerByTeamName(teamName);
		
	}

}
