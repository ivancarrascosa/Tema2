package boletin6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creo las dos variables A y B para guardar los números que introduzca el
		// usuario
		int A;
		int B;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario los números
		System.out.println("Introduzca el número A");
		A = reader.nextInt();
		System.out.println("Introduzca el número B");
		B = reader.nextInt();
		if (A < B) {
			for (int i = A + 1; i < B; i++) {
				System.out.println(i);
			}
		} else if (B < A) {
			for (int i = B + 1; i < A; i++) {
				System.out.println(i);
			}
		} else
			System.out.println("Los números son iguales");
		// Cierro el escáner
		reader.close();
	}

}
