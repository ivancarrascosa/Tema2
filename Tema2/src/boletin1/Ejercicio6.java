package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// creo la variable en la que voy a almacenar los coeficientes que va a dar el
		// usuario
		double a;
		double b;
		double c;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario los coeficientes de la ecuación y los almaceno en las
		// variables
		System.out.println("Dime el coeficiente del monomio de grado 2");
		a = reader.nextDouble();
		System.out.println("Dime el coeficiente del monomio de grado 1");
		b = reader.nextDouble();
		System.out.println("Dime el término independiente");
		c = reader.nextDouble();
	}

}
