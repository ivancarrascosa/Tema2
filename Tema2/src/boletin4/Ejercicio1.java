package boletin4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo una variable para guardar el número que introduzca el usuario
		int num;
		// Creo una variable para almacenar la suma
		int sum = 0;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario un número para sumar y lo guardo en la variable
		System.out.println("Introduzca un número entero para sumar, en caso de ser negativo se parará la suma");
		num = reader.nextInt();
		// Con un while voy sumandole a la variable suma cada número, mientras el número
		// sea positivo, sigo sumando
		while (num >= 0) {
			//Voy sumando números
			sum += num;
			
			//Le pido más números al usuario
			System.out.println("Introduzca un número entero para sumar, en caso de ser negativo se parará la suma");
			num = reader.nextInt();
		}
		System.out.println("La suma total es " + sum);
		// Cierro el escáner
		reader.close();
	}

}
