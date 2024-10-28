package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int n;
		// Creo un contador para contar las cifras del número
		int cont = 0; 
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario un número y lo guardo en la variable
		System.out.println("Introduzca un número mayor que 0 para saber cuantas cifras tiene:");
		n = reader.nextInt();
		if (n <= 0) {
			System.out.println("Número no válido.");
		} else {
			for (int i = n ; i>0 ; i/=10) {
				cont++;
			}
			System.out.println("El número tiene " + cont + " cifras.");
		}
		
		// Cierro el escáner
		reader.close();
	}

}
