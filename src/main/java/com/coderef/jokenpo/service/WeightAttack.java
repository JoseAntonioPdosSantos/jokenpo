package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Game;

public class WeightAttack extends Attack{

	public WeightAttack(Game game1, Game game2) {
		if(game1.getWeight() > game2.getWeight()) 
			game1.addLosses();
		else if(game2.getWeight() > game1.getWeight()) 
			game2.addLosses();
	}

}
