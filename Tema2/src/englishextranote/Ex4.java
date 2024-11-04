package englishextranote;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int currentHeight;
		int nextHeight;
		int upCounter = 0;
		int downCounter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce the height of the wall:");
		nextHeight = sc.nextInt();
		currentHeight = nextHeight;
		while (nextHeight >= 0) {
			if (nextHeight > currentHeight) {
				upCounter++;
			} else if (nextHeight < currentHeight) {
				downCounter++;
			}

			currentHeight = nextHeight;
			System.out.println("Introduce the height of the wall:");
			nextHeight = sc.nextInt();
		}

		System.out.println("Jumps up: " + upCounter);
		System.out.println("Jumps down: " + downCounter);
		sc.close();
	}
}
