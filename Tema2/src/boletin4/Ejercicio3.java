package boletin4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo una variable para guardar el número que introduzca el usuario
		int num;
		// Creo una variable para almacenar la suma de los números
		int sum = 0;
		// Creo un contador para saber cuantos números se han introducido
		int cont = 0;
		// Creo una variable para almacenar la media final
		double media;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario un número para sumar
		System.out.println("Introduzca un número entero positivo para calcular la media, si es negativo,"
				+ " se parará y se devolverá la media");
		num = reader.nextInt();
		// Aumento el contador para el denominador de la media y voy haciendo la suma
		// para el numerador
		while (num > 0) {
			sum += num;
			cont++;
			System.out.println("Introduzca un número entero positivo para calcular la media, si es negativo,"
					+ " se parará y se devolverá la media");
			num = reader.nextInt();
		}
		media = (double) sum/cont;
		System.out.println("La media de los números es " + media);
		// Cierro el escáner
		reader.close();
	}

}