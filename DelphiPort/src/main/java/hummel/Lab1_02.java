package main.java.hummel;

import java.util.Scanner;

public class Lab1_02 {
	private static Scanner input;

	public static void main(String[] args) {
		int n = 0;
		boolean error = false;
		input = new Scanner(System.in);
		do {
			System.out.println("Enter the quantity of input array elements:");
			try {
				n = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				error = true;
			}
		} while (n <= 1 && error);
		System.out.println(n);
	}
}