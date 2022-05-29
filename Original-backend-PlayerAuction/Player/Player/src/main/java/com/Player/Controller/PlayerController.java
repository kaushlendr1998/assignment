package com.Player.Controller;

import java.util.List;

import javax.ws.rs.GET;

import com.Player.Entity.Player;
import com.Player.Service.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/restPlayer")
public class PlayerController {

	@Autowired
	private PlayerService pService;
	
	@PostMapping("/savePlayer")
	public ResponseEntity<?> savePlayer(@RequestBody Player player){
		return pService.savePlaye(player);
	}
	
	@GetMapping("/findPlayerByTeamName/{teamName}")
	public List<Player> findPlayerByTeamName(@PathVariable("teamName") String teamName){
		return pService.findPlayerByTeamName(teamName);
	}
	
	@GetMapping("findplayerId/{playerId}")
	public ResponseEntity<?> findplayerId(@PathVariable("playerId") int playerId){
		return pService.findPlayerId(playerId);
	}
}
