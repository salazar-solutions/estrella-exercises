package org.salazar.exercise.operators;

import java.util.Scanner;

public class HelloWorldExercise {

	public void printHelloWorld() {
		String name=prompt("Please provide your name");
		System.out.println("Hello world: "+name);
	}

	private String prompt(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}
}
