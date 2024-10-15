package boletin3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creo una variable para guardar el número que introduzca el usuario y sus
		// unidades y decenas y para hacer el print al final
		int num;
		int unidades;
		int decenas;
		String decenasPrint = "";
		String unidadesPrint = "";
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario un número
		System.out.println("Introduzca un número entre 1 y 99");
		// Guardo el número y sus unidades y decenas en las variables
		num = reader.nextInt();
		unidades = num % 10;
		decenas = num / 10;
		// Separo los casos no generales, desde el 1 hasta el 15 y todos los múltiplos
		// de 10
		if (num <= 15 && num>=10 || unidades == 0) {
			switch (num) {
			case 10 -> System.out.println("diez");
			case 11 -> System.out.println("once");
			case 12 -> System.out.println("doce");
			case 13 -> System.out.println("trece");
			case 14 -> System.out.println("catorce");
			case 15 -> System.out.println("quince");
			case 20 -> System.out.println("veinte");
			case 30 -> System.out.println("treinta");
			case 40 -> System.out.println("cuarenta");
			case 50 -> System.out.println("cincuenta");
			case 60 -> System.out.println("sesenta");
			case 70 -> System.out.println("setenta");
			case 80 -> System.out.println("ochenta");
			case 90 -> System.out.println("noventa");
			}

		} else {
			switch (decenas) {
			case 0 -> decenasPrint = "";
			case 1 -> decenasPrint = "dieci";
			case 2 -> decenasPrint = "veinti";
			case 3 -> decenasPrint = "treinta y ";
			case 4 -> decenasPrint = "cuarenta y ";
			case 5 -> decenasPrint = "cincuenta y ";
			case 6 -> decenasPrint = "sesenta y ";
			case 7 -> decenasPrint = "setenta y ";
			case 8 -> decenasPrint = "ochenta y ";
			case 9 -> decenasPrint = "noventa y ";
			}
			switch (unidades) {
			case 1 -> unidadesPrint = "uno";
			case 2 -> unidadesPrint = "dos";
			case 3 -> unidadesPrint = "tres";
			case 4 -> unidadesPrint = "cuatro";
			case 5 -> unidadesPrint = "cinco";
			case 6 -> unidadesPrint = "seis";
			case 7 -> unidadesPrint = "siete";
			case 8 -> unidadesPrint = "ocho";
			case 9 -> unidadesPrint = "nueve";
			}
		}
		System.out.println(decenasPrint + unidadesPrint);
		// Cerramos el escáner
		reader.close();
	}

}
