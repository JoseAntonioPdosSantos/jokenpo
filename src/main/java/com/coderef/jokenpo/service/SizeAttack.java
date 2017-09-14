package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Game;

public class SizeAttack extends Attack{

	public SizeAttack(Game game1, Game game2) {
		if(game1.getSize() > game2.getSize()) 
			game1.addLosses();
		else if(game2.getSize() > game1.getSize()) 
			game2.addLosses();
	}

}
