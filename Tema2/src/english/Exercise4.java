package english;

import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		// We create a variable to storage the number the user introduces
		int num;
		// We create a variable to storage the random number
		int randNum;
		// We create a random generator
		Random rand = new Random();
		// We create a scanner
		Scanner reader = new Scanner(System.in);
		// We generate the random number and storage it
		randNum = rand.nextInt(1, 101);
		// We ask the user for a number
		System.out.println("Introduce a number");
		num = reader.nextInt();
		// We create a while loop cheking if that number is greater or lower than the
		// secret number
		while (num != randNum && num != -1) {
			if (num > randNum) {
				System.out.println("The number is greater than the secret number");
			}
			if (num < randNum) {
				System.out.println("The number is lower than the secret number");
			}
			System.out.println("Introduce a number");
			num = reader.nextInt();
		}
		// We create two options, one if the user surrenders and other if they guess the
		// number right
		if (num == -1) {
			System.out.println("End of the program, you surrendered");
		} else {
			System.out.println("You guessed it! The number is " + num + ".");
		}
		// We close the scanner
		reader.close();

	}

}
