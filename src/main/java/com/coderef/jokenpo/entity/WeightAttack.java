package com.coderef.jokenpo.entity;

public class WeightAttack extends Attack{

	public WeightAttack(Game game1, Game game2) {
		if(game1.weight > game2.weight) 
			game1.addLosses();
		else if(game2.weight > game1.weight) 
			game2.addLosses();
	}

}
