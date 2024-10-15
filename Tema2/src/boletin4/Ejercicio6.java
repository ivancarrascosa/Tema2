package boletin4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creo una variable para almacenar la altura
		double altura;
		// Creo una variable para almacenar la altura más alta
		double alturaMax = 0;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario la altura de el árbol
		System.out.println("Introduzca la altura del árbol en centímetros,"
				+ " en caso de querer parar, introduzca -1");
		altura = reader.nextDouble();
		while (altura != -1) {
			if (altura > alturaMax) {
				alturaMax = altura;
			}
			System.out.println("Introduzca la altura del árbol en centímetros,"
					+ " en caso de querer parar, introduzca -1");
			altura = reader.nextDouble();
			
		}
		//Devuelvo la altura máxima
		System.out.println("La altura máxima es " + alturaMax + "cm");
		//Cierro el escáner
		reader.close();

	}

}
