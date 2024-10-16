package english;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// We create a variable to storage the number we are given
		int num;
		// We create a variable for a counter
		int count = 1;
		// We create a Scanner
		Scanner reader = new Scanner(System.in);
		// We ask the user for a number
		System.out.println("Introduce a number to show its multiplication table");
		num = reader.nextInt();
		// We create a while loop that keeps multiplying until the counter reaches 10
		// (included)
		while (count <= 10) {
			System.out.println(num + "x" + count + "=" + num * count);
			count++;
		}
		// We close the scanner
		reader.close();

	}

}
