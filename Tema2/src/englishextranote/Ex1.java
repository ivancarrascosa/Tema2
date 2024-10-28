package englishextranote;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int hoursMirror;
		int minutesMirror;
		int hours;
		int minutes;
		
		System.out.println("Write the hour in the mirror: ");
		System.out.println("Hour: ");
		hoursMirror = reader.nextInt();
		
		System.out.println("Minutes: ");
		minutesMirror = reader.nextInt();
		
		if (minutesMirror == 0) {
			hours = ((12 - hoursMirror)%12);
		} else { 
			hours = (12- hoursMirror - 1);
		}
		
		minutes = ((60-minutesMirror)%60);
		
		if (hours == 0) {
			hours = 12;
		}
		System.out.println("The real time is " + hours + ":" + minutes);
		reader.close();
	}

}
