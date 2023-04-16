package com.example.players;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayersController {
	
	@Autowired
	private PlayerService playerService; 
	
	@GetMapping("/")
	public String hello() {
		return new String("Questa è la mia prima applicazione Spring!");
	}
	
	@GetMapping("/players")//è l'endpoint, ovvero un alis associato al metodo getAllPlayers
	public List<Player> getAllPlayers(){
		
		/*List<Player> players = new ArrayList<>();
		players.add(new Player(1,"Francesco", "Totti", "Roma"));
		players.add(new Player(2,"Gonzalo", "Higuain", "Juventus"));
		players.add(new Player(3,"Mauro", "Icardi", "Inter"));*/
		
		return playerService.getAllPlayers();
	
	}
	
	
	
}
