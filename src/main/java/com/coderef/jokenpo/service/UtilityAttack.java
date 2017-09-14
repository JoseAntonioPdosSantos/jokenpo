package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Game;

public class UtilityAttack extends Attack{

	public UtilityAttack(Game game1, Game game2) {
		if(game1.getUtility() > game2.getUtility()) 
			game1.addLosses();
		else if(game2.getUtility() > game1.getUtility()) 
			game2.addLosses();
	}

}
