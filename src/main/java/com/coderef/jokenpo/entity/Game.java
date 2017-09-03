package com.coderef.jokenpo.entity;

public abstract class Game {
	
	protected int size;
	protected int weight;
	protected int utility;
	private int losses;
	
	public Game attack(Game game){
		sizeAttack(game);
		weightAttack(game);
		utilityAttack(game);
		return getWinner(game);
	}
	
	private void sizeAttack(Game game){
		if(this.size > game.size) 
			this.losses++;
		else if(game.size > this.size) 
			game.losses++;
	}
	
	private void weightAttack(Game game){
		if(this.weight > game.weight)
			this.losses++;
		else if(game.weight > this.weight)
			game.losses++;
	}
	
	private void utilityAttack(Game game){
		if(this.utility > game.utility)
			this.losses++;
		else if(game.utility > this.utility)
			game.losses++;
	}
	
	private Game getWinner(Game game){
		if(this.losses == game.losses)
			return new Tie();
		if(this.losses > game.losses)
			return this;
		else
			return game;
	}
	
}