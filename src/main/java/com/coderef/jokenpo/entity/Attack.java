package com.coderef.jokenpo.entity;

public class Attack {

	public static void toAttack(Game game1, Game game2){
		new SizeAttack(game1, game2);
		new WeightAttack(game1, game2);
		new UtilityAttack(game1, game2);
	}
	
}
