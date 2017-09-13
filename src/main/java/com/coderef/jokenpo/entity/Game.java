package com.coderef.jokenpo.entity;

import com.coderef.jokenpo.service.Attack;

public abstract class Game {
	
	protected int size;
	protected int weight;
	protected int utility;
	private int losses;
	
	public Game attack(Game game){
		Attack.toAttack(this, game);
		
		return getWinner(game);
	}
	
	public void addLosses(){
		losses++;
	}
	
	private Game getWinner(Game game){
		if(this.losses == game.losses)
			return new Draw();
		if(this.losses > game.losses)
			return this;
		else
			return game;
	}
	
}