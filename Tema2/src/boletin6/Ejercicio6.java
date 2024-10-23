package boletin6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creo una variable para guardar las notas que introduzca el usuario
		double nota = 5;
		// Creo un booleano inicializado en false para guardar si hay algun suspenso
		boolean sus = false;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Con un for creo una condicion que pare cuando se introduzcan 5 notas o alguna sea menor que 5
		for (int i = 0 ; i<5 ; i++) {
			System.out.println("Introduzca una nota");
			nota = reader.nextDouble();
			if (nota<5) {
				sus = true;
			}
		}
		if (sus) {
			System.out.println("Hay algún suspenso");
		} else {
			System.out.println("No hay ningún suspenso");
		}
		//Cierro el escáner
		reader.close();
	}

}
