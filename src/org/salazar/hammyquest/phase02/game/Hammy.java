package org.salazar.hammyquest.phase02.game;

public class Hammy {
	private String name;

	public Hammy() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hammy [name=" + name + "]";
	}

}
