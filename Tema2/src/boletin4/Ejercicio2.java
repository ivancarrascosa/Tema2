package boletin4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo una variable para guardar el número que introduzca el usuario
		int num;
		// Creo un contador para saber cuantos números se han introducido
		int cont = 0;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario un número para sumar
		System.out.println("Introduzca un número entero positivo, en caso de ser negativo, se parará de contar");
		num = reader.nextInt();
		//Por cada número que entre en el while aumento el contador en 1
		while (num > 0) {
			cont++;
			System.out.println("Introduzca un número entero positivo, en caso de ser negativo, se parará de contar");
			num = reader.nextInt();
		}
		System.out.println("Se han introducido " + cont + " números enteros positivos");
		// Cierro el escáner
		reader.close();
	}

}