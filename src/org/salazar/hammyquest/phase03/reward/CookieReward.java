package org.salazar.hammyquest.phase03.reward;

import org.salazar.hammyquest.phase03.game.Hammy;

public class CookieReward implements Reward {
	private static final Integer HAPINESS_POINTS=10;
	
	@Override
	public void message(Hammy hammy) {
		System.out.println(String.format("%s has encounter a cookie :)", hammy.getName()));
		Integer happines=hammy.getHappiness()+HAPINESS_POINTS;
		hammy.setHappiness(happines);
	}
}
