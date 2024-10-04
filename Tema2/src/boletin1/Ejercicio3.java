package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// creo la variable en la que voy a almacenar el número
		double num;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que introduzca el número y lo guardo
		System.out.println("Introduce un número");
		num = reader.nextDouble();
		// Creo la comparación y devuelvo si es cercano a 0
		if (num<1 && num>-1 && num != 0) {
			System.out.println("El número " + num + " es casi-cero");
		} else {
			System.out.println("El número " + num + " no es casi-cero");
		}
		// Cierro el escáner
		reader.close();
	}

}
