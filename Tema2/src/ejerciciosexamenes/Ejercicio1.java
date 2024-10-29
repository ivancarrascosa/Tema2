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
		for (int i = 0; i <= longLado; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i = 0; i <= longLado - 2; i++) {
			System.out.print("*");
			for (int j = 0; j <= longLado - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int i = 0; i <= longLado; i++) {
			System.out.print("*");
		}
		reader.close();

	}

}
