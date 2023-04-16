package com.example.players;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	
	private List<Player> players = new ArrayList<>( Arrays.asList(new Player(1,"Francesco", "Totti", "Roma"), new Player(2,"Gonzalo", "Higuain", "Juventus") ,
		new Player(3,"Mauro", "Icardi", "Inter"), new Player(4,"Ma chi", "ti conosce?", "Napoli") ) );
	
	public List<Player> getAllPlayers(){
		return players;
	}

}
