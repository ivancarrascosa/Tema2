package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el tamaño del escaque
		int n = 0;

		// Creo una variable error para salir del do while
		boolean error;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);

		do {
			error = false;
			System.out.println("Introduzca la longitud de los lados del cuadrado:");
			try {
				n = reader.nextInt();
				// Compruebo que el número introducido sea positivo
				assert n > 0 : "La longitud de los lados debe ser positiva";
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
		// Aquí hago un for para cada línea del tablero de ajedrez
		for (int i = 1; i <= 8; i++) {
			
			// Distingo de si es una línea par o impar
			if (i % 2 == 1) {
				
				// Creo un for para que se imprima tantas veces como n, para que salgan
				// cuadrados de nxn asteriscos
				for (int l = 1; l <= n; l++) {
					
					// Aquí creo cada linea dentro de la fila
					for (int j = 1; j <= 8; j++) {
						
						// Distingo el caso de si es parte de un cuadrado par o impar
						if (j % 2 == 1) {
							for (int k = 1; k <= n; k++) {
								// Imprimo espacios si es impar
								System.out.print(" ");
							}
							
						} else {
							// Imprimo asteriscos si es par
							for (int k = 1; k <= n; k++) {
								System.out.print("#");
							}
						}
					}
					// Introduzco un String vacío para pasar a la siguiente línea
					System.out.println("");
					// Aquí ya está la primera fila de mi escaque construido, esto se repetirá n
					// veces antes de continuar con la siguiente iteración para hacer el siguiente
					// cuadrante
				}
				// Hago lo mismo pero al revés para que se complementen los espacios y los
				// asteriscos
			} else {
				for (int l = 1; l <= n; l++) {
					for (int j = 1; j <= 8; j++) {
						if (j % 2 == 1) {
							for (int k = 1; k <= n; k++) {
								System.out.print("#");
							}
						} else {
							for (int k = 1; k <= n; k++) {
								System.out.print(" ");
							}
						}
					}
					System.out.println("");
				}
			}
		}
		// Cierro el escáner
		reader.close();
	}

}
