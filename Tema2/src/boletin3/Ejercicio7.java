package boletin3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Creo una variable para almacenar los dias de estancia y la distancia a recorrer que va a introducir el usuario
		int diasEstancia;
		int distanciaRecorrer;
		//Creo una variable para almacenar el precio total
		double precioTotal;
		//Creo una constante para el precio por kilómetro
		final double PRECIO_KILOMETRO = 2.5;
		//creo un escáner
		Scanner reader = new Scanner(System.in);
		//Solicito al usuario los dias de estancia y la distancia a recorrer y lo almaceno en las variables
		System.out.println("Introduzca los días de estancia en el tren");
		diasEstancia = reader.nextInt();
		System.out.println("Introduzca la distancia a recorrer");
		distanciaRecorrer = reader.nextInt();
		precioTotal = PRECIO_KILOMETRO*distanciaRecorrer;
		if ((diasEstancia > 7) && (distanciaRecorrer>800)) {
			System.out.println("El precio final son " + (precioTotal*0.7) + "€");
		} else System.out.println("El precio final son " + precioTotal + "€");
		//Cerramos el escáner
		reader.close();

	}

}
