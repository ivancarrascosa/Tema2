package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo una variable para almacenar la longitud de los dados que introduzca el
		// usuario
		int longLado = 0;

		// Creo una variable error para el do while de comprobar que los valores sean
		// correctos
		boolean error = false;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);

		// Pido al usuario la longitud del lado y la guardo en la variable

		do {
			error = false;
			System.out.println("Introduzca la longitud de los lados del cuadrado:");
			try {
				longLado = reader.nextInt();
				// Compruebo que el número introducido sea positivo
				assert longLado > 0 : "La longitud de los lados debe ser positiva";
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				error = true;
				// Compruebo que se haya introducido un número entero
			} catch (InputMismatchException e) {
				System.out.println("El número introducido no es correcto o no se ha introducido un número.");
				error = true;
			}
			// Limpio la consola para que no haga un bucle infinito en caso de introducirse
			// algo que no sea un entero.
			reader.nextLine();
		} while (error);
		// Imprimo la parte de arriba, que serán tantos asteriscos como la longitud del
		// lado
		for (int i = 1; i <= longLado; i++) {
			System.out.print("*");
		}
		// Paso a la siguente línea
		System.out.println("");

		// Para el resto de filas, que seán la longitud de lado menos la de arriba y la
		// de abajo (2)
		for (int i = 1; i <= longLado - 2; i++) {
			// Imprimo un asterisco
			System.out.print("*");
			// Imprimo espacios de la longitud del lado menos los dos asteriscos que habrá
			for (int j = 1; j <= longLado - 2; j++) {
				System.out.print(" ");
			}
			// Imprimo otro asterisco y paso a la siguiente línea
			System.out.println("*");
		}
		// Imprimo la última fila, que es como la primera
		for (int i = 1; i <= longLado; i++) {
			System.out.print("*");
		}
		// Cierro el escáner
		reader.close();

	}

}
