package com.coderef.jokenpo.entity;

import com.coderef.jokenpo.service.Attack;

public abstract class Game {

    private Attack attack;
	protected int size;
	protected int weight;
	protected int utility;
	private int losses;

	public Game(){
	    attack = new Attack();
    }

	public void attack(Game game){
		attack.toAttack(this, game);
	}
	
	public void addLosses(){
		losses++;
	}

	public int getLosses(){
		return losses;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}

	public int getUtility() {
		return utility;
	}

}