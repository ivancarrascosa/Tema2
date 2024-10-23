package boletin6;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo una variable para ir almacenando cada número que introduzca el usuario
		double n;
		double suma = 0;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Creo un bucle for en el que 10 veces le pido al usuario números y los voy
		// sumando y guardando en la variable suma
		for (int i = 1 ; i<10 ; i++) {
			System.out.println("Introduzca un número para calcular la media");
			n = reader.nextDouble();
			suma += n;
		}
		System.out.println("La media es " + (suma/10));
		//Cierro el escáner 
		reader.close();
	}

}
