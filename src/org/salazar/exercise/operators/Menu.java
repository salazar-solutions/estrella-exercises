package org.salazar.exercise.operators;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String option = "y";

		while (!option.equals("n")) {

			printOptions();
			option = sc.nextLine();

			switch (option) {
			case "0":
				HelloWorldExercise instance = new HelloWorldExercise();
				instance.printHelloWorld();
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}
			System.out.println("Continue [y/n]");
			option = sc.nextLine();
			if (!option.equals("n")) {
				hideScreen();
			}
		}
		System.out.println("Thank you for using this Menu");
	}

	public static void printOptions() {
		System.out.println("Please select one of the option below");
		System.out.println("[0]: Print Hello World with your name");
	}

	/**
	 * DO NOT NEED TO UNDERSTAND, IT JUST CLEAN THE CONSOLE
	 */
	private static void hideScreen() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
			;
		}

	}
}
