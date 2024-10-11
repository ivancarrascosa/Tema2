package boletin3;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creo una variable en la que almacenar la suma de los dos números y otras para los dos números
		int suma;
		int num1;
		int num2;
		//Creo una variable para almacenar la respuesta del usuario
		int respuesta;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Creo mediante el método random los dos números que voy a sumar
		Random rand = new Random();
		num1 = rand.nextInt(1,100);
		num2 = rand.nextInt(1,100);
		//Calculo la suma
		suma = num1 + num2;
		//Le pregunto al usuario cual es la suma de los dos números
		System.out.println("¿Cuánto es " + num1 + " + " + num2 + "?");
		respuesta = reader.nextInt();
		//Creo un condicional para si la respuesta es igual a la suma y hago print de si la persona ha acertado o no
		if (suma == respuesta) {
			System.out.println("Respuesta correcta");
		} else System.out.println("Respuesta incorrecta");
		//Cierro el escáner
		reader.close();
	}

}
