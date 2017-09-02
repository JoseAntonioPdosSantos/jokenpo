package com.coderef.jokenpo.entity;

public abstract class Game {
	
	protected int life;
	protected int damage;
	protected int regeneration;
	
	public Game attack(Game game){
		if(damageDifferenceAndRegeneration(this, game.damage) > damageDifferenceAndRegeneration(game, this.damage)) return this;
		else return game;
	}
	
	private int damageDifferenceAndRegeneration(Game game, int damage){
		
		System.out.println(game.getClass());
		
		int result = damageDifference(game, damage);
		return regeneration(game,result);
	}
	
	private int damageDifference(Game game, int damage){
		return subtract(game.damage, damage);
	}
	
	private int subtract(int number1, int number2){
		System.out.println("Difference");
		System.out.println(number1 +" - " + number2);
		return number1 - number2;
	}
	
	private int regeneration(Game game, int result){
		System.out.println("Regeneration");
		System.out.println(game.regeneration +" + " + result);
		return game.regeneration + result;
	}

}
