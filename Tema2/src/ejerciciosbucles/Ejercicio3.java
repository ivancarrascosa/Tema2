package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo una variable para almacenar los dos números que introduzca el usuario
		int a;
		int b;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que introduzca un número
		System.out.println("Introduzca un número 'a':");
		a = reader.nextInt();
		System.out.println("Introduzca un número 'b':");
		b = reader.nextInt();
		// Dependiendo de cual sea el mayor, empiezo a comprobar desde uno o el otro de
		// la forma en la que se dice en el enunciado
		if (a<b) {
			for (int i = a ; i >= 1; i--) {
				if (a%i == 0 && b%i == 0) {
					System.out.println("El máximo común divisor es " + i);
					break;
				}
			}
		} else if (a>b) {
			for (int i = b ; i >= 1; i--) {
				if (a%i == 0 && b%i == 0) {
					System.out.println("El máximo común divisor es " + i);
					break;
				}
			}

		} else {
			System.out.println("Los dos números son iguales");
		}
		//Cierro el escáner
		reader.close();

}
	
}
