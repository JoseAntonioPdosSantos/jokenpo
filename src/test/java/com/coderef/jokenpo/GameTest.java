package com.coderef.jokenpo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderef.jokenpo.entity.Game;
import com.coderef.jokenpo.entity.Paper;
import com.coderef.jokenpo.entity.Play;
import com.coderef.jokenpo.entity.Scissors;
import com.coderef.jokenpo.entity.Stone;

public class GameTest {

	public static void main(String[] args) {
		GameTest test = new GameTest();
		test.startStoneXStone();
		test.startPaperXPaper();
		test.startScissorsXScissors();
		test.startStoneXPaper();
		test.startPaperXStone();
		test.startStoneXScissors();
		test.startScissorsXStone();
		test.startPaperXScissors();
		test.startScissorsXPaper();
	}
	
	@Test
	public void startStoneXStone(){
		Play play = new Play();
		Game game = play.start(new Stone(), new Stone());
		
		System.out.println(game.getClass().getSimpleName());
	}
	
	@Test
	public void startPaperXPaper(){
		Play play = new Play();
		Game game = play.start(new Stone(), new Stone());
		
		System.out.println(game.getClass().getSimpleName());
	}
	
	@Test
	public void startScissorsXScissors(){
		Play play = new Play();
		Game game = play.start(new Stone(), new Stone());
		
		System.out.println(game.getClass().getSimpleName());
	}
	
	@Test
	public void startStoneXPaper(){
		Play play = new Play();
		Game game = play.start(new Stone(), new Paper());
		
		System.out.println(game.getClass().getSimpleName());
		
		//assertEquals(new Paper().getClass(), game.getClass());
	}
	
	@Test
	public void startPaperXStone(){
		Play play = new Play();
		Game game = play.start(new Paper(), new Stone());
		
		System.out.println(game.getClass().getSimpleName());
		
		//assertEquals(new Paper().getClass(),game.getClass());
	}
	
	@Test
	public void startStoneXScissors(){
		Play play = new Play();
		Game game = play.start(new Stone(), new Scissors());
		
		System.out.println(game.getClass().getSimpleName());
		//assertEquals(new Stone().getClass(),game.getClass());
	}

	@Test
	public void startScissorsXStone(){
		Play play = new Play();
		Game game = play.start(new Scissors(), new Stone());
		
		System.out.println(game.getClass().getSimpleName());
		//assertEquals(new Stone().getClass(), game.getClass());
	}

	@Test
	public void startPaperXScissors(){
		Play play = new Play();
		Game game = play.start(new Paper(), new Scissors());
		System.out.println(game.getClass().getSimpleName());
		//assertEquals(new Scissors().getClass(),game.getClass());
	}
	
	@Test
	public void startScissorsXPaper(){
		Play play = new Play();
		Game game = play.start(new Scissors(), new Paper());
		System.out.println(game.getClass().getSimpleName());
		//assertEquals(new Scissors().getClass(),game.getClass());
	}
}
