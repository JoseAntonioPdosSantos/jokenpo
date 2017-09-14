package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Game;

public class Attack {

	public void toAttack(Game game1, Game game2){
		new SizeAttack(game1, game2);
		new WeightAttack(game1, game2);
		new UtilityAttack(game1, game2);
	}

}
