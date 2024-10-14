package boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos una variable para guardar lo que introduzca el usuario
		String letraCarnet;
		//Creamos un escáner
		Scanner reader = new Scanner(System.in);
		//Pedimos al usuario la letra del tipo de carnet
		System.out.println("Dime la letra del carnet");
		letraCarnet = reader.nextLine();
		//Hago el switch para los distintos casos
		switch (letraCarnet) {
		case "A" -> System.out.println("Es un carnet de motocicleta");
		case "B" -> System.out.println("Es un carnet de automóvil");
		case "C" -> System.out.println("Es un carnet de camión");
		case "D" -> System.out.println("Es un carnet de autobús");
		case "E" -> System.out.println("Es un carnet de remolque");
		default -> System.out.println("Categoría no contemplada");
		}
		//Cerramos el escáner
		reader.close();
	}

}
