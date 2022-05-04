package org.salazar.hammyquest.phase02.obstacule;

import org.salazar.hammyquest.phase02.game.Hammy;

public class DoorObstacule implements Obstacule {
	@Override
	public void message(Hammy hammy) {
		System.out.println(String.format("%s has encounter his cage :(", hammy.getName()));
	}
}
