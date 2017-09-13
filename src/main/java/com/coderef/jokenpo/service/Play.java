package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Game;

public class Play {

	public Game start(Game game1, Game game2){
		return game1.attack(game2);
	}
}
