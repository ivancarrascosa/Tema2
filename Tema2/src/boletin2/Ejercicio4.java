package boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creo las variables donde voy a almacenar las dos tiradas del usuario
		String tiradaUno;
		String tiradaDos;
		//Creo las variables en las que guardare los números
		int tiradaUnoFinal;
		int tiradaDosFinal;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario los resultados de las tiradas y los almaceno en las variables
		System.out.println("¿Cual ha sido el resultado de la primera tirada?");
		tiradaUno = reader.nextLine();
		System.out.println("¿Cual ha sido el resultado de la segunda tirada?");
		tiradaDos = reader.nextLine();
		//Creo unos switch anidados para los distintos casos
		tiradaUnoFinal = switch (tiradaUno) {
		case "UNO" -> {yield 1;}
		case "DOS" -> {yield 2;}
		case "TRES" -> {yield 3;}
		case "CUATRO" -> {yield 4;}
		case "CINCO" -> {yield 5;}
		default -> {yield 6;}
		
		};
		tiradaDosFinal = switch (tiradaDos) {
		case "UNO" -> {yield 1;}
		case "DOS" -> {yield 2;}
		case "TRES" -> {yield 3;}
		case "CUATRO" -> {yield 4;}
		case "CINCO" -> {yield 5;}
		default -> {yield 6;}
		};
		System.out.println("El resultado es " + (tiradaUnoFinal + tiradaDosFinal));

		
		//Cerramos el escáner
		reader.close();
	}
}
