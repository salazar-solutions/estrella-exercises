package org.salazar.hammyquest.phase03.obstacule;

import org.salazar.hammyquest.phase03.game.Hammy;

public class CageObstacule implements Obstacule {
	private static final Integer SADNESS_POINTS=10;
	
	@Override
	public void message(Hammy hammy) {
		System.out.println(String.format("%s has encounter a door :(", hammy.getName()));
		Integer happines=hammy.getHappiness()-SADNESS_POINTS;
		hammy.setHappiness(happines);
	}
}
