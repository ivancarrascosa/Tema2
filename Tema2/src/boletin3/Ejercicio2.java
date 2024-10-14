package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creo una variable para guardar el número que introduzca el usuario
		double num;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario un número y lo guardo en la variable
		System.out.println("Introduzca un número");
		num = reader.nextDouble();
		//Mediante un ternario imprimo ese numero o - el número
		System.out.println("El valor absoluto del número es " + (num >= 0 ? num : -num));
		//Cierro el escáner
		reader.close();
	}

}
