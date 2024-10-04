package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// creo la variable en la que voy a almacenar los dos números que va a dar el
		// usuario
		double num1;
		double num2;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que me de ambos números y los almaceno
		System.out.println("Dame un número");
		num1 = reader.nextDouble();
		System.out.println("Dame el otro número");
		num2 = reader.nextDouble();
		// Creo el if para ver cual es mayor o menor mediante comparaciones
		if (num1 == num2) {
			System.out.println("Los dos números son iguales");
		} else if (num1 > num2) {
			System.out.println(num2 + "<" + num1);
		} else {
			System.out.println(num1 + "<" + num2);
		}
		// Cierro el escáner
		reader.close();
	}
}