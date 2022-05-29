package com.Team.Repository;

import com.Team.Entity.Team;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
	
	Team findPlyerByTeamName(String teamName);

}
