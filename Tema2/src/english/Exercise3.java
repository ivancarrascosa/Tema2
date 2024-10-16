package english;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// We create a variable to storage the height of the students
		double height;
		// We create a variable for maximum height and minimum height
		double maxHeight;
		double minHeight;
		// We create a scanner
		Scanner reader = new Scanner(System.in);
		// We ask for a height and save that first one in the variable of max and
		// minimum height
		System.out.println("Introduce a student's height, if you are willing to stop, introduce 0");
		height = reader.nextDouble();
		maxHeight = height;
		minHeight = height;
		// We create a loop, if the height is less that the minimum, its the new minimum
		// If its higher that the maximum, it is the new maximum
		while (height != 0) {
			if (height < minHeight) {
				minHeight = height;
			}
			if (height > maxHeight) {
				maxHeight = height;
			}
			System.out.println("Introduce a student's height, if you are willing to stop, introduce 0");
			height = reader.nextDouble();
		}
		System.out.println("The maximum height is " + maxHeight + " and the minimum is " + minHeight + ".");
		// We close the scanner
		reader.close();
	}

}
