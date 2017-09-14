package com.coderef.jokenpo.entity;

public class Match {

	private Player player;
	private Game game;
	
	public void attack(Match match){
		this.game.attack(match.getGame());
	}
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
}
