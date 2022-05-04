package org.salazar.hammyquest.phase02.reward;

import org.salazar.hammyquest.phase02.game.Hammy;

public class BananaReward implements Reward {
	@Override
	public void message(Hammy hammy) {
		System.out.println(String.format("%s has encounter a banana :)", hammy.getName()));
	}
}
