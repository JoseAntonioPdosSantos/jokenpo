package com.coderef.jokenpo.controller;

import com.coderef.jokenpo.service.GameService;
import com.coderef.jokenpo.service.Play;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coderef.jokenpo.entity.Game;
import com.coderef.jokenpo.entity.Match;
import com.coderef.jokenpo.entity.Player;

@RestController
@RequestMapping("/jokenpo")
public class StartGameController {

	@RequestMapping(value="/start/{game1}/{game2}", method= RequestMethod.POST)
    public ResponseEntity<?> startGame(@PathVariable String game1,@PathVariable String game2) {
        try {

        	GameService gameService = new GameService();
        	
        	Player playerOne = new Player();
        	playerOne.setName("Rick");
        	
        	Player playerTwo = new Player();
        	playerTwo.setName("Governor");
        	
        	Game gameOne = gameService.getGame(game1);
        	Game gameTwo = gameService.getGame(game2);
        	
        	Match matchOne = new Match();
        	matchOne.setPlayer(playerOne);
        	matchOne.setGame(gameOne);
        	
        	Match matchTwo = new Match();
        	matchTwo.setPlayer(playerTwo);
        	matchTwo.setGame(gameTwo);
        	
        	Play play = new Play();
        	
    		play.start(matchOne, matchTwo);
    		Player winner = play.getWinner();
            
            return ResponseEntity.ok(winner);

        } catch (Exception e) {
            e.printStackTrace();;
        }
		return null;
    } 
	

}
