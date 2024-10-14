package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo la variable para guardar la nota
		int nota;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario la nota y la guardo en la variable
		System.out.println("Introduzca la nota que sea un número entero.");
		nota = reader.nextInt();
		// Creo un switch que devuelva cual ha sido el resultado de la nota
		switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			System.out.println("insuficiente");
		}
		case 5 -> {
			System.out.println("Suficiente");
		}
		case 6 -> {
			System.out.println("Bien");
		}
		case 7, 8 -> {
			System.out.println("Notable");
		}
		case 9, 10 -> {
			System.out.println("Sobresaliente");
		}
		}
		// Cierro el escáner
		reader.close();
	}

}
