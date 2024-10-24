package boletin3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos una variable para almacenar el año y el mes
		int año;
		byte mes;
		// Creamos el escáner
		Scanner reader = new Scanner(System.in);
		// solicitamos al usuario el mes y el año
		System.out.println("Introduzca el número del mes");
		mes = reader.nextByte();
		System.out.println("Introduzca el año");
		año = reader.nextInt();
		// Distinguimos el caso de que el año sea bisiesto y el mes sea febrero, en cuyo
		// caso serán 29 días, hacemos el resto con un switch ya que no dependen del año
		if ((año % 4 == 0) && (mes == 2)) {
			System.out.println("El mes tiene 29 días");
		} else {
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("El mes tiene 31 días");
			case 2 -> System.out.println("El mes tiene 28 días");
			case 4, 6, 9, 11 -> System.out.println("El mes tiene 30 días");
			}
		}
		// Cerramos el escáner
		reader.close();
	}

}
