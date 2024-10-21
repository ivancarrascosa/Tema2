package boletin5;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creo una variable para almacenar lo que introduzcan los jugadores
		String jug1;
		String jug2;
		// Creo una variable para guardar la respuesta final, que si es S se seguirá
		// jugando
		String resFinal;
		// Creo unas constantes para guardar las diferentes opciones
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Hago un do while mientras la respuesta final sea S (que quieren seguir
		// jugando)
		do {
			// Para el jugador 1, mientras su string sea distinto de piedra, papel o tijera
			// se le seguirá preguntando
			do {
				System.out.println("Introduzca su elección jugador 1:");
				jug1 = reader.nextLine();
			} while (!jug1.equalsIgnoreCase(TIJERA) && !jug1.equalsIgnoreCase(PIEDRA) && !jug1.equalsIgnoreCase(PAPEL));
			// Para el jugador 2, mientras su string sea distinto de piedra, papel o tijera
			// se le seguirá preguntando
			do {
				System.out.println("Introduzca su elección jugador 2:");
				jug2 = reader.nextLine();
			} while (!jug2.equalsIgnoreCase(TIJERA) && !jug2.equalsIgnoreCase(PIEDRA) && !jug2.equalsIgnoreCase(PAPEL));
			// Una vez que ambos strings son piedra, papel o tijera, hago todas las
			// comparaciones posibles para saber quien gana o pierde
			if (jug1.equals(jug2)) {
				System.out.println("Habéis empatado");
			} else if (jug1.equalsIgnoreCase(PIEDRA) && jug2.equalsIgnoreCase(TIJERA)) {
				System.out.println("Gana el jugador 1");
			} else if (jug1.equalsIgnoreCase(PIEDRA) && jug2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Gana el jugador 2");
			} else if (jug1.equalsIgnoreCase(PAPEL) && jug2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Gana el jugador 1");
			} else if (jug1.equalsIgnoreCase(PAPEL) && jug2.equalsIgnoreCase(TIJERA)) {
				System.out.println("Gana el jugador 2");
			} else if (jug1.equalsIgnoreCase(TIJERA) && jug2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Gana el jugador 1");
			} else if (jug1.equalsIgnoreCase(TIJERA) && jug2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Gana el jugador 2");
			}
			// Pregunto si quieren seguir jugando, si la respuesta es S, seguirán dentro del
			// while
			System.out.println("Si queréis seguir jugando, introducid S");
			resFinal = reader.nextLine();
		} while (resFinal.equals("S"));
		// Cierro el escáner
		reader.close();
	}

}
