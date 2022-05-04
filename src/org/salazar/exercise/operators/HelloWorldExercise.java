package org.salazar.exercise.operators;

import java.util.Scanner;

public class HelloWorldExercise {

	/**
	 * Show a message in console ask for your name to show the phrase hello world
	 * with your name
	 */
	public void printHelloWorld() {
		// Ask the user to provide the name and assign it to name variable
		String name = prompt("Please provide your name");
		// print the message Hello world plus the user name
		System.out.println("Hello world: " + name);
	}

	/**
	 * Show a message in the console and ask for user input
	 * 
	 * @param msg - The message to display in the console
	 * @return the input from the user
	 */
	private String prompt(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}
}
