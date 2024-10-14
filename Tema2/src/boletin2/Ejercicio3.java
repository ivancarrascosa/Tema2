package boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creo las dos variables para guardar los números que introduzca el usuario
		double num1;
		double num2;
		//Creo una variable para almacenar el string que introduzca el usuario
		String operacion;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario los dos números y los almaceno en las variables
		System.out.println("Dime un número");
		num1 = reader.nextDouble();
		System.out.println("Dime otro número");
		num2 = reader.nextDouble();
		reader.nextLine();
		//Pido al usuario la operación que quiere hacer y la almaceno
		System.out.println("Elija una seleccionando la letra:\nA. SUMAR LOS NÚMEROS\nB. RESTAR LOS NÚMEROS\nC. MULTIPLICAR LOS NÚMEROS\nD. DIVIDIR LOS NÚMEROS");
		operacion = reader.nextLine();
		//Hago un switch dependiendo del valor que haya dado devolviendo el resultado
		switch (operacion) {
		case "A" -> System.out.println("El resultado de la suma es " + (num1 + num2));
		case "B" -> System.out.println("El resultado de la resta es " + (num1 - num2));
		case "C" -> System.out.println("El resultado de la multiplicación es " + (num1 * num2));
		case "D" -> System.out.println("El resultado de la división es " + (num1 / num2));
		default -> System.out.println("No se ha elegido una opción correcta");
		}
		//Cierro el escáner
		reader.close();
		

	}

}
