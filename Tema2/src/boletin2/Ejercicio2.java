package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creo la variable para guardar el número que introduzca el usuario
		int numeroDia;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario el número del día de la semana y lo almaceno en la variable
		System.out.println("Escriba un día de la semana(1 al 7):");
		numeroDia = reader.nextInt();
		// Dependiendo del número que se haya dado hago print de un día u otro
		switch (numeroDia) {
		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miércoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sábado");
		case 7 -> System.out.println("Domingo");
		}
		// Cerramos el escáner
		reader.close();
	}

}
