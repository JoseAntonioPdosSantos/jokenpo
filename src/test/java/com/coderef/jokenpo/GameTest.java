package com.coderef.jokenpo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderef.jokenpo.entity.Game;
import com.coderef.jokenpo.entity.Paper;
import com.coderef.jokenpo.entity.Play;
import com.coderef.jokenpo.entity.Scissors;
import com.coderef.jokenpo.entity.Stone;

public class GameTest {

	@Test
	public void startStoneXPaper(){
		Play play = new Play();
		Game game = play.start(new Stone(), new Paper());
		assertEquals(new Paper().getClass(), game.getClass());
	}
	
	@Test
	public void startPaperXStone(){
		Play play = new Play();
		Game game = play.start(new Paper(), new Stone());
		assertEquals(new Paper().getClass(),game.getClass());
	}
	
	@Test
	public void startStoneXScissors(){
		Play play = new Play();
		Game game = play.start(new Stone(), new Scissors());
		assertEquals(new Stone().getClass(),game.getClass());
	}

	@Test
	public void startScissorsXStone(){
		Play play = new Play();
		Game game = play.start(new Scissors(), new Stone());
		assertEquals(new Stone().getClass(), game.getClass());
	}

	@Test
	public void startPaperXScissors(){
		Play play = new Play();
		Game game = play.start(new Paper(), new Scissors());
		assertEquals(new Scissors().getClass(),game.getClass());
	}
}
