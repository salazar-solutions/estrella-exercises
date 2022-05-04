package org.salazar.hammyquest.phase03.game;

public class Hammy {
	private String name;
	private Integer happiness;

	public Hammy() {
		happiness = 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHappiness() {
		return happiness;
	}

	public void setHappiness(Integer happiness) {
		this.happiness = happiness;
	}

	@Override
	public String toString() {
		return "Hammy [name=" + name + ", happiness=" + happiness + "]";
	}

}
