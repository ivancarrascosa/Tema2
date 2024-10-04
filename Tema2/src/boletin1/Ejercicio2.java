package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaro las dos variables en las que voy a almacenar cada número
		int num1;
		int num2;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario ambos números y los guardo en sus respectivas variables
		System.out.println("Introduce un número");
		num1 = reader.nextInt();
		System.out.println("Introduce otro número");
		num2 = reader.nextInt();
		//Creo el condicional para saber si son iguales
		if (num1 == num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números son diferentes");
		}
		//Cierro el escáner
		reader.close();

	}

}
