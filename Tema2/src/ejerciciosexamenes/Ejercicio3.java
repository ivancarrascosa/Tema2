package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo una variable para almacenar la longitud del lado del triángulo
		int ladoTriangulo = 0;

		// Creo una variable para los lados que voy a tener que imprimir en el segundo
		// "piso" del triángulo
		int espacio = 1;

		// Creo una variable error para no crear un bucle infinito en el do while
		boolean error;

		// Creo el escáner
		Scanner reader = new Scanner(System.in);

		do {
			error = false;
			System.out.println("Introduzca la longitud de los lados del triángulo:");
			try {
				ladoTriangulo = reader.nextInt();
				// Compruebo que el número introducido sea positivo
				assert ladoTriangulo > 0 : "La longitud de los lados debe ser positiva";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;
				// Compruebo que se haya introducido un número entero
			} catch (InputMismatchException e) {
				System.err.println("El número introducido no es correcto o no se ha introducido un número.");
				error = true;
			}
			// Limpio la consola para que no haga un bucle infinito en caso de introducirse
			// algo que no sea un entero.
			reader.nextLine();
		} while (error);
		// Imprimo el lado de arriba del triángulo
		for (int i = 1; i <= ladoTriangulo; i++)
			System.out.print("* ");
		System.out.println("");
		// Creo un for para los espacios que tengo que introducir
		for (int i = 3; i < ladoTriangulo; i++) {
			espacio += 2;
		}
		// Con este for se hará cada linea restante
		for (int i = 1; i <= ladoTriangulo - 1; i++) {
			// Aquí imprimo los espacios de antes de los asteriscos
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// Imprimo el primer asterisco
			System.out.print("*");

			// Imprimo los espacios, que llegará hasta la variable que he creado de espacio
			for (int j = 1; j <= espacio; j++) {
				System.out.print(" ");
			}
			// Reduzco la variable espacio en 2 porque el siguiente piso tendrá menos
			// espacios
			espacio -= 2;

			// Imprimo el otro asterisco y paso a la siguiente linea excepto si estoy en la
			// última iteración
			if (i != ladoTriangulo - 1) {
				System.out.println("*");
			}

		}
		// Cierro el escáner
		reader.close();
	}

}
