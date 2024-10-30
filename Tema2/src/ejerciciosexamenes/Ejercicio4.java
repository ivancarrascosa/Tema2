package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduce el usuario
		int ladoHexagono = 0;
		// Creo una variable error para el do while de comprobar que los valores sean
		// correctos
		boolean error = false;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);

		// Pido al usuario la longitud del lado y la guardo en la variable

		do {
			error = false;
			System.out.println("Introduzca la longitud de los lados del hexágono:");
			try {
				ladoHexagono = reader.nextInt();
				// Compruebo que el número introducido sea positivo
				assert ladoHexagono > 0 : "La longitud de los lados debe ser positiva";
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

		// El primer for lo utilizo para construir la primera mitad del hexágono, con
		// for ascendentes
		for (int i = 1; i <= ladoHexagono; i++) {
			// Imprimo los espacios antes de los asteriscos, que empiezan por el lado del
			// hexágono menos la iteración en la que estemos y acaba cuando sea mayor que 0,
			// para q no se impriman espacios cuando sea 0
			for (int j = ladoHexagono - i; j > 0; j--) {
				System.out.print(" ");
			}

			// En este for imprimo los asteriscos, empieza la variable por 1 y termina
			// cuando llegue a la longitud del lado más el doble de la iteración menos 1
			for (int j = 1; j <= ladoHexagono + 2 * (i - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// En este for hago el descendente 1 vez menos que la longitud, porque la línea
		// del medio está ya pintada
		for (int i = ladoHexagono - 1; i > 0; i--) {
			// Imprimo tantos espacios como el lado menos la iteración por la que vaya,
			// porque quiero que estos espacios vayan aumentando
			for (int j = 1; j <= ladoHexagono - i; j++) {
				System.out.print(" ");
			}
			
			// En este bucle for hago exactamente lo mismo que en el bucle anterior para
			// construir la figura pero al ser la i desdendiente, se van reduciendo el
			// número de asteriscos que se imprimen
			for (int j = 1; j <= ladoHexagono + 2 * (i - 1); j++) {
				System.out.print("*");
			}
			
			// Hago un salto de línea
			System.out.println("");
		}
		
		// Cerramos el escáner
		reader.close();

	}

}
