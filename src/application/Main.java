package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Calculating the difference between two sums (integers only) ***");
		System.out.println("This program will calculate the difference between two sums as decribed below: ");
		System.out.println("Difference = A + B - C + D");
		System.out.print("Enter the A value: ");
		int A = scanner.nextInt();
		System.out.print("Enter the B value: ");
		int B = scanner.nextInt();
		System.out.print("Enter the C value: ");
		int C = scanner.nextInt();
		System.out.print("Enter the D value: ");
		int D = scanner.nextInt();
		int difference = (A + B) - (C + D);
		System.out.println("Difference = " + difference);
		
		scanner.close();		
	}

}
