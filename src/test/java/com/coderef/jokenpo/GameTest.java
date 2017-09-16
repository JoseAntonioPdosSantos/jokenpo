package com.coderef.jokenpo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderef.jokenpo.entity.Match;
import com.coderef.jokenpo.entity.Paper;
import com.coderef.jokenpo.entity.Player;
import com.coderef.jokenpo.entity.Scissors;
import com.coderef.jokenpo.entity.Stone;
import com.coderef.jokenpo.service.Play;

public class GameTest {

	@Test
	public void startStoneXStone(){
		
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Stone());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Stone());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals("The Players Drew", winner.getName());
	}
	
	@Test
	public void startPaperXPaper(){
		
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Paper());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Paper());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals("The Players Drew", winner.getName());
		
	}
	
	@Test
	public void startScissorsXScissors(){
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Scissors());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Scissors());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals("The Players Drew", winner.getName());
	}
	
	@Test
	public void startStoneXPaper(){
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Stone());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Paper());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals(player2.getName(), winner.getName());
	}
	
	@Test
	public void startPaperXStone(){
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Paper());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Stone());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals(player1.getName(), winner.getName());
	}
	
	@Test
	public void startStoneXScissors(){
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Stone());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Scissors());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals(player1.getName(), winner.getName());
	}

	@Test
	public void startScissorsXStone(){
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Scissors());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Stone());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals(player2.getName(), winner.getName());
	}

	@Test
	public void startPaperXScissors(){
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Paper());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Scissors());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals(player2.getName(), winner.getName());
	}
	
	@Test
	public void startScissorsXPaper(){
		Player player1 = new Player();
		player1.setName("Rick");
		player1.setUserName("rick");
		player1.setPassword("123");
		player1.setEmail("rick.twd@gmail.com");
		
		Player player2 = new Player();
		player2.setName("Rick");
		player2.setUserName("rick");
		player2.setPassword("123");
		player2.setEmail("rick.twd@gmail.com");
		
		Match match1 = new Match();
		match1.setPlayer(player1);
		match1.setGame(new Scissors());
		
		Match match2 = new Match();
		match2.setPlayer(player2);
		match2.setGame(new Paper());
		
		Play play = new Play();
		
		play.start(match1, match2);
		Player winner = play.getWinner();
		
		assertEquals(player1.getName(), winner.getName());
	}
}
