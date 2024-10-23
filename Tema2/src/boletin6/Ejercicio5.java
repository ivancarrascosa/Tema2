package boletin6;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int n;
		// Creo una variable para almacenar la respuesta que le voy a dar al usuario
		int res = 1;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario un número para hacer el factorial
		System.out.println("Introduzca un número para calcular su factorial");
		n = reader.nextInt();
		// Creo un for que dado el número que introduzca el usuario, multiplique desde
		// el 1 a ese número, usaré el contador i en el for para ir multiplicando hasta
		// llegar al número
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		System.out.println(n + "! = " + res);
		// Cierro el escáner
		reader.close();
	}

}
