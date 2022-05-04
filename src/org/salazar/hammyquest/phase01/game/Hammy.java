package org.salazar.hammyquest.phase01.game;

public class Hammy {
	private String name;

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
