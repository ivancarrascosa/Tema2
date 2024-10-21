package boletin5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creo las variables donde voy a almacenar las dos tiradas del usuario
		String tiradaUno;
		String tiradaDos;
		// Creo las variables en las que guardare los números
		int tiradaUnoFinal;
		int tiradaDosFinal;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario los resultados de las tiradas y los almaceno en las variables
		// Lo preguntaré hasta que introduzca un número válido
		do {
			System.out.println("¿Cual ha sido el resultado de la primera tirada?");
			tiradaUno = reader.nextLine();
		} while (!tiradaUno.equals("UNO") && !tiradaUno.equals("DOS") && !tiradaUno.equals("TRES")
				&& !tiradaUno.equals("CUATRO") && !tiradaUno.equals("CINCO") && !tiradaUno.equals("SEIS"));
		do {
			System.out.println("¿Cual ha sido el resultado de la segunda tirada?");
			tiradaDos = reader.nextLine();
		} while (!tiradaDos.equals("UNO") && !tiradaDos.equals("DOS") && !tiradaDos.equals("TRES")
				&& !tiradaDos.equals("CUATRO") && !tiradaDos.equals("CINCO") && !tiradaDos.equals("SEIS"));
		// Creo unos switch anidados para los distintos casos, estando seguro de que la respuesta va a ser uno de estos
		tiradaUnoFinal = switch (tiradaUno) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		default -> {
			yield 6;
		}

		};
		tiradaDosFinal = switch (tiradaDos) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		default -> {
			yield 6;
		}
		};
		System.out.println("El resultado es " + (tiradaUnoFinal + tiradaDosFinal));

		// Cerramos el escáner
		reader.close();
	}
}
