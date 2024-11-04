package englishextranote;

import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		// I create the 3 variables to storage the different value of the data that can be introduced
		int vValue = -1;
		int dValue = -1;
		int tValue = -1;
		
		// I create the names of the variables
		String value;
		
		// I create a Scanner
		Scanner reader = new Scanner(System.in);
		
		// I ask the user for the type and value of the data
		for (int i = 0 ; i<=1 ; i++) {
			System.out.println("Give me one type of data: ");
			value = reader.next();
			switch (value) {
			case "V" -> {
				System.out.println("Give the value for that data: ");
				vValue = reader.nextInt();
			}
			case "T" -> {
				System.out.println("Give the value for that data: ");
				tValue = reader.nextInt();
			}
			case "D" -> {
				System.out.println("Give the value for that data: ");
				dValue = reader.nextInt();
			}
			}
			
		}
		
		if (vValue == -1) {
			System.out.println("V=" + dValue/tValue );
		} else if (dValue == -1) {
			System.out.println("D=" + vValue*tValue);
		} else {
			System.out.println("T=" + dValue/vValue);
		}
		
		reader.close();

	}

}
