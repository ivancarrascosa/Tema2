package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creo una variable para guardar el número que introduzca el usuario
		int n;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		
		// Pido al usuario que introduzca un número para hacer la pirámide y lo asigno a una variable
		System.out.println("Introduzca un número para hacer una pirámide:");
		n = reader.nextInt();
		// La i irá de 1 hasta n
		for (int i = 1 ; i <= n ; i++) {
			// j empieza por uno y se irá printeando hasta llegar a i
			for (int j = 1 ; j <= i ; j++) {
				System.out.print(j);
			}
			//A partir de ahí, j se irá disminuyendo hasta 1 (incluido) e imprimiéndose
			for (int j = i-1 ; j>0 ; j--) {
				System.out.print(j);
			}
			// Hago un salto de línea por cada piso
			System.out.println("");
		}
		//Cierro el escáner
		reader.close();
	}

}
