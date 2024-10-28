package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int n;

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Pido al usuario un número del 1 al 20
		System.out.println("Introduzca un número del 1 al 20:");
		n = reader.nextInt();

		// Compruebo si el número que ha introducido el usuario es válido, en caso de
		// que sea
		// válido, paso a las instrucciones de los for
		if (n >= 1 && n <= 20) {
			// En este contaré todos los números hasta el que ha introducido el usuario,
			// dejo una linea libre entre cada iteración
			for (int i = 1; i <= n; i++) {
				System.out.println("");
				// Por cada número i, lo imprimo i veces, con un contador en el for que llegue
				// hasta i
				for (int j = 1; j <= i; j++)
					System.out.print(i);
			}
		} else {
			System.out.println("Número no válido");
		}
		// Cierro el escáner
		reader.close();

	}

}
