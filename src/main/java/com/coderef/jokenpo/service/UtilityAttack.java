package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Game;

public class UtilityAttack extends Attack{

	public UtilityAttack(Game game1, Game game2) {
		if(game1.utility > game2.utility) 
			game1.addLosses();
		else if(game2.utility > game1.utility) 
			game2.addLosses();
	}

}
