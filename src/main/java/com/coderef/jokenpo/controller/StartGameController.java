package com.coderef.jokenpo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coderef.jokenpo.entity.Game;
import com.coderef.jokenpo.entity.Paper;
import com.coderef.jokenpo.entity.Play;
import com.coderef.jokenpo.entity.Scissors;
import com.coderef.jokenpo.entity.Stone;

@RestController
@RequestMapping("/jokenpo")
public class StartGameController {

	@RequestMapping(value="/start/{game1}/{game2}", method= RequestMethod.POST)
    public ResponseEntity<?> startGame(@PathVariable String game1,@PathVariable String game2) {
        try {
        	
        	Game gameOne = getGame(game1);
        	Game gameTwo = getGame(game2);
        	Play play = new Play();
    		Game game = play.start(gameOne, gameTwo);
            
            return ResponseEntity.ok(game.getClass().getSimpleName());

        } catch (Exception e) {
            e.printStackTrace();;
        }
		return null;
    } 
	
	private Game getGame(String game){
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
