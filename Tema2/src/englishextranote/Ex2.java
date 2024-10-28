package englishextranote;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int toPay;
		int given;
		int giveBack;

		System.out.println("What ya bills are homie?");
		toPay = reader.nextInt();

		System.out.println("What amount are u givin' dude?");
		given = reader.nextInt();

		giveBack = (given - toPay);

		if (giveBack >= 200) {
			System.out.print(giveBack / 200 + " ");
			giveBack %= 200;
		} else
			System.out.print("0 ");

		if (giveBack >= 100) {
			System.out.print(giveBack / 100 + " ");
			giveBack %= 100;
		} else
			System.out.print("0 ");

		if (giveBack >= 50) {
			System.out.print(giveBack / 50 + " ");
			giveBack %= 50;
		} else
			System.out.print("0 ");

		if (giveBack >= 20) {
			System.out.print(giveBack / 20 + " ");
			giveBack %= 20;
		} else
			System.out.print("0 ");

		if (giveBack >= 10) {
			System.out.print(giveBack / 10 + " ");
			giveBack %= 10;
		} else
			System.out.print("0 ");

		if (giveBack >= 5) {
			System.out.print(giveBack / 5 + " ");
			giveBack %= 5;
		} else
			System.out.print("0 ");

		if (giveBack >= 2) {
			System.out.print(giveBack / 2 + " ");
			giveBack %= 2;
		} else
			System.out.print("0 ");

		if (giveBack != 0) {
			System.out.print(giveBack + " ");
		} else
			System.out.print("0");
		reader.close();

	}

}
