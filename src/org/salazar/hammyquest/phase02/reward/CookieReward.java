package org.salazar.hammyquest.phase02.reward;

import org.salazar.hammyquest.phase02.game.Hammy;

public class CookieReward implements Reward {
	@Override
	public void message(Hammy hammy) {
		System.out.println(String.format("%s has encounter a cookie :)", hammy.getName()));
	}
}
