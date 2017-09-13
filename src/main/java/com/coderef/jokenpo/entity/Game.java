package com.coderef.jokenpo.entity;

import com.coderef.jokenpo.service.Attack;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class Game {

    private Attack attack;
	protected int size;
	protected int weight;
	protected int utility;
	private int losses;

	public Game(){
	    attack = new Attack();
        init();
    }

	public Game attack(Game game){
		attack.toAttack(this, game);
		attack.getWinner(this, game);
		return null;
	}
	
	public void addLosses(){
		losses++;
	}

	public int getLosses(){
		return losses;
	}

	private void init(){
        Properties properties = new Properties();
        InputStream in = this.getClass().getResourceAsStream("resultGame.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void getWinner(){

    }
}