package com.coderef.jokenpo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderef.jokenpo.entity.Player;

public class PlayerTest {

	@Test
	public void createPlayer(){
		Player player = new Player();
		player.setId(1);
		player.setName("Rick");
		player.setUserName("rick");
		player.setPassword("123");
		player.setEmail("rick@twd.com");
		
		assertEquals(new Integer(1),player.getId());
		assertEquals("Rick",player.getName());
		assertEquals("rick",player.getUserName());
		assertEquals("123",player.getPassword());
		assertEquals("rick@twd.com",player.getEmail());
	}
}
