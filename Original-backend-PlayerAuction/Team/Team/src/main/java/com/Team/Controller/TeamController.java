package com.Team.Controller;

import com.Team.Entity.Team;
import com.Team.Model.Player;
import com.Team.Service.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/restTeam")
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@PostMapping("/addteam")
	public ResponseEntity<?> saveTeam(@RequestBody Team team){
		return teamService.checkTeam(team);
	}
	
	@GetMapping("playerbyteamname/{teamName}")
	public Player[] findPlyerByTeamName(@PathVariable("teamName") String teamName) {
		return teamService.findPlayerByName(teamName);
	}
	
	@GetMapping("findteam/{teamName}")
	public Team findDetails(@PathVariable("teamName") String teamName) {
		return teamService.findDetails(teamName);
	}
	
	
}
