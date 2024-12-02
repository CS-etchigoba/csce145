//Everlast Chigoba

import java.util.Scanner;

public class TriangleMaker {

	public static void main(String[] args) {
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");
		Scanner k = new Scanner(System.in); //initializes the scanner in order to take user input
		int triangleSize = k.nextInt(); //initializes the next integer to be input by the user to determine how large the triangle is
		
		//This section of for loops is for the top half of the triangle, counting up
		for(int i = 0; i < triangleSize; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//This section of for loops is for the bottom half of the triangle, counting down
		for(int i = triangleSize - 2; i >= 0; i--) { // the -2 here makes sure that the code does not print the longest line of asterisks twice
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("DONE!");

	}

}
