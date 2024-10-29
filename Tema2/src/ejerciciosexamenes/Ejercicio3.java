package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo una variable para almacenar la longitud del lado del triángulo
		int ladoTriangulo = 0;
		
		// Creo una variable error para no crear un bucle infinito en el do while
		boolean error;
		
		// Creo un contador para las iteraciones
		int cont = 1;
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
		int copia = ladoTriangulo;
		for (int i = 1 ; i <= ladoTriangulo ; i++)
		System.out.print("* ");
		System.out.println("");
		if (ladoTriangulo%2 != 0) {
			for (int j = 1; j<=ladoTriangulo-1 ; j++) {
				for (int i = 1 ; i <= j ; i++) {
					System.out.print(" ");	
				}
				System.out.print("*");
				for (int i = copia; i > 0 ; i--) {
					System.out.print(" ");
					
				}
				copia-=2;
				if (copia <= -2) {
					break;
				}
				System.out.println("*");
			
		}
		}
	}

}
