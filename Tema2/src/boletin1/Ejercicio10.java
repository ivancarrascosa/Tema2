package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaro las variables en las que voy a almacenar los 3 números que va a
		// introducir el usuario
		int num1;
		int num2;
		int num3;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Preguntamos al usuario los números
		System.out.println("Introduzca el primer número");
		num1 = reader.nextInt();
		System.out.println("Introduzca el segundo número");
		num2 = reader.nextInt();
		System.out.println("Introduzca el tercer número");
		num3 = reader.nextInt();
		// Vamos evaluando los casos en los que uno puede ser suma de los otros dos.
		// Solo hay 4 opciones, que ninguno sea suma de los otros, o que por cada número
		// introducido pueda ser suma de los otros dos
		if (num1 + num2 == num3) {
			System.out.println(num3 + " es suma de los otros dos.");
		} else if (num2 + num3 == num1) {
			System.out.println(num1 + " es suma de los otros dos.");
		} else if (num1 + num3 == num2) {
			System.out.println(num2 + " es suma de los otros dos.");
		} else {
			System.out.println("Ninguno es suma de los otros.");
		}
		// Cerramos el escáner
		reader.close();
	}

}
