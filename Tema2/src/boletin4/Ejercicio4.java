package boletin4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creo una variable para guardar el número que introduzca el usuario en ese momento
		int num;
		//Creo variables para almacenar la suma de positivos, la suma de negativos, media y número de ceros
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		int contadorNegativos = 0;
		double media;
		int numeroCeros = 0;
		//Creo una variable para un contador
		int cont = 1;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		while (cont <= 10) {
			//Pido al usuario un número y lo almaceno
			System.out.println("Introduzca un número entero");
			num = reader.nextInt();
			//En caso de que sea 0 aumento en 1 el contador de ceros
			if (num == 0) {
				numeroCeros++;
			//En caso de que sea negativo, lo sumo y aumento en 1 el contador de negativos
			} else if (num < 0) {
				sumaNegativos += num;
				contadorNegativos++;
			//En el otro caso (positivo) sumo el número a la suma de positivos
			} else {
				sumaPositivos += num;
			}
			cont++;
		}
		media = (double) sumaNegativos/contadorNegativos;
		System.out.println("La suma de los números positivos es " + sumaPositivos 
				+ (contadorNegativos == 0 ? ", no se ha introducido ningún número negativo": ", la media de los números negativos es " + media) 
				+ " y se han introducido " + numeroCeros + " ceros.");
		//Cierro el escáner
		reader.close();
	}
}
