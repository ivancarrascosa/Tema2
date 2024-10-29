package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo una variable para almacenar la longitud del lado del triángulo
		int ladoTriangulo = 0;
		
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
		
		for (int i = 1 ; i <= ladoTriangulo ; )
		System.out.println(ladoTriangulo);

	}

}
