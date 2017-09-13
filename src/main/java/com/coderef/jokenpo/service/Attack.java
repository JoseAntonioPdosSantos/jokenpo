package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Draw;
import com.coderef.jokenpo.entity.Game;
import com.coderef.jokenpo.result.ResultGame;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Attack {

	public void toAttack(Game game1, Game game2){
		new SizeAttack(game1, game2);
		new WeightAttack(game1, game2);
		new UtilityAttack(game1, game2);
	}

	public ResultGame getWinner(Game game1, Game game2){


        if(game1.getLosses() == game2.getLosses())
            return new DrawResult();
        if(game1.getLosses() > game2.getLosses())
            return game1;
        else
            return game;
	}
	
}
