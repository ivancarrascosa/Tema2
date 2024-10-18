package boletin5;

import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo una variable para almacenar el número que introduzca el usuario
		int num;
		// Creo una variable para almacenar el resultado de la suma
		int suma = 0;
		//Creo un contador que le voy a ir sumando a la variable suma
		int cont = 1;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario un número
		System.out.println("Introduce un número para sumar desde el 1 hasta el que sea introducido");
		num = reader.nextInt();
		//Con un do while voy sumando a suma hasta que se llegue a num
		do {
			suma += cont;
			cont++;
		} while (cont<=num);
		
		System.out.println("El resultado de la suma es " + suma);
		//Cerramos el escáner
		reader.close();

	}

}
