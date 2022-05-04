package org.salazar.hammyquest.phase01.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private Hammy hammy;
	private Scanner console = new Scanner(System.in);
	private Random random = new Random();

	public void start() {
		boolean isPlaying = true;
		this.init();

		String hammyName = getInput("Please provide a cute name to your brave Hammy");
		this.hammy.setName(hammyName);

		while (isPlaying) {
			Integer luck = random.nextInt(1, 100);

			if (luck <= 80) {
				System.out.println(String.format("%s is sad", hammy.getName()));
			} else {
				System.out.println(String.format("%s is happy", hammy.getName()));
			}

			String input = getInput("Continue? [Y/N]");
			if ("N".equalsIgnoreCase(input))
				break;
		}
		System.out.println("Thank you for playing");
	}

	private String getInput(String msg) {
		System.out.println(msg);
		return console.nextLine();
	}

	private void init() {
		this.hammy = new Hammy();

	}

}
