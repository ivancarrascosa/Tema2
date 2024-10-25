package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creo una variable para almacenar los dos números que introduzca el usuario
		int a;
		int b;
		// Creo un booleano para parar los bucles
		boolean paraBucles = true;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que introduzca un número
		System.out.println("Introduzca un número 'a':");
		a = reader.nextInt();
		System.out.println("Introduzca un número 'b':");
		b = reader.nextInt();
		// Dependiendo de cual sea el mayor, empiezo a comprobar desde uno o el otro
		// como en el ejercicio anterior, aunque en este empezaré por el maor y
		// comprobaré si i se puede dividir entre a y b
		if (a < b) {
			for (int i = b; i >= 1; i++) {
				if ((i % a == 0 && i % b == 0) && paraBucles) {
					System.out.println("El mínimo comúm múltiplo es " + i);
					paraBucles = false;
				}
			}
		} else if (a > b) {
			for (int i = a; i >= 1; i++) {
				if ((i % a == 0 && i % b == 0) && paraBucles ) {
					System.out.println("El mínimo comúm múltiplo es " + i);
					paraBucles = false;
				}
			}

		} else {
			System.out.println("Los dos números son iguales");
		}
		// Cierro el escáner
		reader.close();

	}

}
