package english;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// I create a variable to storage the numbers the user introduces
		int num;
		// I create the scanner
		Scanner reader = new Scanner(System.in);
		// I ask the user for a number
		System.out.println("Introduce a number, if you want to stop, introduce a negative number");
		num = reader.nextInt();
		// I create a while loop, if the number is negative, it goes out of the loop
		while (num >= 0) {
			// I check if the number introduced is even or odd calculating the number module
			// 2
			System.out.println(num % 2 == 0 ? "Even" : "Odd");
			System.out.println("Introduce a number, if you want to stop, introduce a negative number");
			num = reader.nextInt();
		}
		System.out.println("End of the program");
		// I close the scanner
		reader.close();
	}

}
