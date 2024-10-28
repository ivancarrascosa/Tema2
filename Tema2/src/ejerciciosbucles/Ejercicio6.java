package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int n;

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Pido al usuario que introduzca un número para dibujar el triánguulo y lo
		// almaceno en una variable
		System.out.println("Introduzca un número:");
		n = reader.nextInt();
		// Este for va desde 1 hasta el número introducido
		for (int i = 1; i <= n; i++) {
			// Por cada piso de la pirámide tiene que poner n - i espacios para que se vea
			// bien, el número de espacios va disminuyendo
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			// Imprimo i asteriscos en cada piso
			for (int j = i; j > 0; j--) {
				System.out.print(" *");
			}
			// Todo lo anterior era impreso en la misma linea, tengo que hacer un salto de línea
			System.out.println("");
		}
		reader.close();

	}

}
