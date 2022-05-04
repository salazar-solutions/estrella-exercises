package org.salazar.exercise.operators;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String option = "";

		while (!option.equals("exit")) {
			printOptions();
			option = sc.nextLine();

			switch (option) {
			case "0":
				HelloWorldExercise instance = new HelloWorldExercise();
				instance.printHelloWorld();
				break;

			default:
				if (!option.equals("exit")) {
					System.out.println("Invalid Option");
				}
				break;
			}

			hideScreen();
		}
		System.out.println("Thank you for using this Menu");
	}

	public static void printOptions() {
		System.out.println("Please select one of the option below");
		System.out.println("[exit]: Close the program");
		System.out.println("[0]: Print Hello World with your name");
	}

	/**
	 * DO NOT NEED TO UNDERSTAND, IT JUST CLEAN THE CONSOLE
	 */
	private static void hideScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println();;
		}

	}

}
