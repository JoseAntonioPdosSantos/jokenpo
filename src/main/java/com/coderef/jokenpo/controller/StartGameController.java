package com.coderef.jokenpo.controller;

import com.coderef.jokenpo.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coderef.jokenpo.entity.Game;
import com.coderef.jokenpo.service.Play;

@RestController
@RequestMapping("/jokenpo")
public class StartGameController {

	@RequestMapping(value="/start/{game1}/{game2}", method= RequestMethod.POST)
    public ResponseEntity<?> startGame(@PathVariable String game1,@PathVariable String game2) {
        try {

        	GameService gameService = new GameService();
        	Game gameOne = gameService.getGame(game1);
        	Game gameTwo = gameService.getGame(game2);
        	Play play = new Play();
    		Game game = play.start(gameOne, gameTwo);
            
            return ResponseEntity.ok(game.getClass().getSimpleName());

        } catch (Exception e) {
            e.printStackTrace();;
        }
		return null;
    } 
	

}
