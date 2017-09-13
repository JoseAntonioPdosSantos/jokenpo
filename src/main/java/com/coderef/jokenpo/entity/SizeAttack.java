package com.coderef.jokenpo.entity;

public class SizeAttack extends Attack{

	public SizeAttack(Game game1, Game game2) {
		if(game1.size > game2.size) 
			game1.addLosses();
		else if(game2.size > game1.size) 
			game2.addLosses();
	}

}
