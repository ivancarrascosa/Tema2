package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que se introduzca por teclado
		int n;
		// Creo una variable para almacenar la respuesta que voy a almacenar
		int res = 0;
		// Creo un escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario un número y lo almaceno en la variable n.
		System.out.println("Introduzca un número para comprobar si es capicúa:");
		n = reader.nextInt();
		// Creo un bucle en el que voy cogiendo cada número final del introducido y lo
		// inserto en el nuevo, para darle la vuelta al introducido y poder comprobar si
		// son iguales
		for (int i = n ; i>0 ; i/=10) {
			res = res*10 + i%10;
		}
		if (res == n) {
			System.out.println("El número es capicúa");
		} else {
			System.out.println("El número no es capicúa");
		}
		//Cierro el escáner 
		reader.close();
	}

}
