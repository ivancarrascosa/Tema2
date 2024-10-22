package boletin6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creo una variable para almacenar el número que inserte el usuario
		int n;
		//Creo un escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario un número hasta el que contar
		System.out.println("Introduzca un número para contar desde 1 hasta ese:");
		n = reader.nextInt();
		//Creo un bucle for para contar de uno hasta el número introducido
		for (int i = 3 ; i<=n ; i+=3) {
			System.out.println(i);
		}
		//Cierro el escáner
		reader.close();
	}

}