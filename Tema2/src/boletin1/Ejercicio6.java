package boletin1;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// creo la variable en la que voy a almacenar los coeficientes que va a dar el
		// usuario
		double a;
		double b;
		double c;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario los coeficientes de la ecuación y los almaceno en las
		// variables
		System.out.println("Dime el coeficiente del monomio de grado 2");
		a = reader.nextDouble();
		System.out.println("Dime el coeficiente del monomio de grado 1");
		b = reader.nextDouble();
		System.out.println("Dime el término independiente");
		c = reader.nextDouble();
		// Despues separo los casos en los que la raiz sea menor que 0 ( no hay
		// soluciones reales), igual a 0 (solo hay una solucion) y mayor que 0 (hay dos
		// soluciones)
		if (a == 0) {
			System.out.println("La solución es " + - (double)c/b);
		} else if (b * b - 4 * a * c < 0) {
			System.out.println("No existen soluciones reales");
		} else if (b * b - 4 * a * c == 0) {
			System.out.println((-b) / (2 * a));
		} else {
			System.out.println("Las soluciones son " + ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)) + " y "
					+ ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
		//Cierro el escáner
			reader.close();

		}
	}
}
