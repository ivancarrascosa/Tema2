package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creo las variables para guardar la elección de los jugadores
		String jug1;
		String jug2;
		//Creo constantes para las diferentes opciones
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido a los jugadores que introduzcan su elección y lo guardo en las variables
		System.out.println("Jugador 1, elige PIEDRA, PAPEL O TIJERA");
		jug1 = reader.nextLine();
		System.out.println("Jugador 2, elige PIEDRA, PAPEL O TIJERA");
		jug2 = reader.nextLine();
		// Voy comparando y creo las diferentes situaciones
		if (jug1.equals(jug2)) {
			System.out.println("Habéis empatado");
		} else if (jug1.equals(PIEDRA) && jug2.equals(TIJERA)) {
			System.out.println("Gana el jugador 1");
		} else if (jug1.equals(PIEDRA) && jug2.equals(PAPEL)) {
			System.out.println("Gana el jugador 2");
		} else if (jug1.equals(PAPEL) && jug2.equals(PIEDRA)) {
			System.out.println("Gana el jugador 1");
		} else if (jug1.equals(PAPEL) && jug2.equals(TIJERA)) {
			System.out.println("Gana el jugador 2");
		} else if (jug1.equals(TIJERA) && jug2.equals(PAPEL)) {
			System.out.println("Gana el jugador 1");
		} else if (jug1.equals(TIJERA) && jug2.equals(PIEDRA)) {
			System.out.println("Gana el jugador 2");
		}

		// Cerramos el escáner
		reader.close();

	}

}
