package boletin4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creo una variable para almacenar la edad que introduzca el usuario
		int edad;
		//Creo una variable para almacenar la suma de edades
		int sumaEdades = 0;
		//Creo un contador para el numero de edades introducidas y una variable para la media
		int cont = 0;
		double media = 0;
		//Creo un contador para contar a las personas mayores de edad
		int mayoresEdad = 0;
		//Creo el escáner 
		Scanner reader = new Scanner(System.in);
		//Solicito al usuario que introduzca una edad y la guardo en la variable
		System.out.println("Introduce la edad de un alumno");
		edad = reader.nextInt();
		//Bucle while mientras edad sea mayor que 0
		while (edad > 0) {
			cont++;
			sumaEdades += edad;
			if (edad >= 18) {
				mayoresEdad++;
			}
			System.out.println("Introduce la edad de un alumno");
			edad = reader.nextInt();			
		}
		media = (double) sumaEdades/cont;
		System.out.println("La suma de todas las edades es " + sumaEdades 
				+ " la media es " + media + " y hay " + mayoresEdad + " mayores de edad.");
		//Cerramos el escáner
		reader.close();
	}

}
