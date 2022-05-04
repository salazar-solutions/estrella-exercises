package org.salazar.hammyquest.phase03.obstacule;

import org.salazar.hammyquest.phase03.game.Hammy;

public class OwnerObstacule implements Obstacule {
	private static final Integer SADNESS_POINTS=50;
	
	@Override
	public void message(Hammy hammy) {
		System.out.println(String.format("%s has encounter his owner :(", hammy.getName()));
		Integer happines=hammy.getHappiness()-SADNESS_POINTS;
		hammy.setHappiness(happines);
	}
}
