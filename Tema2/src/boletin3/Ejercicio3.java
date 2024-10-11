package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creo una variable para guardar el número de DNI del usuario y el número módulo23
		int DNI;
		int DNIMod23;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario su número de DNI y lo guardo en la variable
		System.out.println("Introduzca su número de DNI");
		DNI = reader.nextInt();
		//Guardo el número módulo 23
		DNIMod23 = DNI%23;
		switch (DNIMod23) {
		case 0 -> System.out.println("La letra que corresponde es T");
		case 1 -> System.out.println("La letra que corresponde es R");
		case 2 -> System.out.println("La letra que corresponde es W");
		case 3 -> System.out.println("La letra que corresponde es A");
		case 4 -> System.out.println("La letra que corresponde es G");
		case 5 -> System.out.println("La letra que corresponde es M");
		case 6 -> System.out.println("La letra que corresponde es Y");
		case 7 -> System.out.println("La letra que corresponde es F");
		case 8 -> System.out.println("La letra que corresponde es P");
		case 9 -> System.out.println("La letra que corresponde es D");
		case 10 -> System.out.println("La letra que corresponde es X");
		case 11 -> System.out.println("La letra que corresponde es B");
		case 12 -> System.out.println("La letra que corresponde es N");
		case 13 -> System.out.println("La letra que corresponde es J");
		case 14 -> System.out.println("La letra que corresponde es Z");
		case 15 -> System.out.println("La letra que corresponde es S");
		case 16 -> System.out.println("La letra que corresponde es Q");
		case 17 -> System.out.println("La letra que corresponde es V");
		case 18 -> System.out.println("La letra que corresponde es H");
		case 19 -> System.out.println("La letra que corresponde es L");
		case 20 -> System.out.println("La letra que corresponde es C");
		case 21 -> System.out.println("La letra que corresponde es K");
		case 22 -> System.out.println("La letra que corresponde es E");
		}
		//Cerramos el escáner
		reader.close();

	}

}
