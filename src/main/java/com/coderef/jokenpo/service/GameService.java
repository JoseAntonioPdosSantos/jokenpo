package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Game;
import com.coderef.jokenpo.entity.Paper;
import com.coderef.jokenpo.entity.Scissors;
import com.coderef.jokenpo.entity.Stone;

/**
 * Created by japsantos on 13/09/17.
 */
public class GameService {

    public Game getGame(String game){
        if(game != null){
            game = game.trim().toUpperCase();
            switch(game){
                case "STONE":
                    return new Stone();
                case "PAPER":
                    return new Paper();
                case "SCISSORS":
                    return new Scissors();
            }
        }
        return null;
    }
}
