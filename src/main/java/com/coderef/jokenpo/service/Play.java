package com.coderef.jokenpo.service;

import com.coderef.jokenpo.entity.Match;
import com.coderef.jokenpo.entity.Player;

public class Play {

	private Player winner;
	private Match match1;
	private Match match2;
	
	public void start(Match match1, Match match2){
		this.match1 = match1;
		this.match2 = match2;
		this.match1.attack(this.match2);
	}
	
	private void checkTheWinner(){
		if (match1.getGame().getLosses() == match2.getGame().getLosses()){
			setDrew();
		}else if (match1.getGame().getLosses() > match2.getGame().getLosses())
			winner = match1.getPlayer();
		else
			winner = match2.getPlayer();
	}
	
	public Player getWinner(){
		checkTheWinner();
		return winner;
	}
	
	private void setDrew() {
		winner = new Player();
		winner.setName("The Players Drew");
	}
}
