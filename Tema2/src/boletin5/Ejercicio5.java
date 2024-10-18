package boletin5;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creo una variable para guardar el numero al azar
		int numRandom;
		// Creo una variable para el límite superior del random, inicializada en 100
		// porque es el número más alto
		int sup = 101;
		// Creo una variable para el límite inferior del random, inicializada en 1
		// porque es el número más bajo
		int inf = 1;
		//Creo un string para guardar mayor, menor o igual
		String respuesta;
		// Creo un objeto random
		Random rand = new Random();
		//Creo un escáner 
		Scanner reader = new Scanner(System.in);
		
		// Con un bucle do while voy generando un número nuevo
		do {
			numRandom = rand.nextInt(inf,sup);
			System.out.println(numRandom);
			respuesta = reader.nextLine();
			if (respuesta.equals("menor")) {
				inf = numRandom + 1;
			}
			if (respuesta.equals("mayor")) {
				sup = numRandom;
			}
		
		} while (!respuesta.equals("igual"));
		System.out.println("He acertado");
		//Cierro el escáner
		reader.close();
	}

}
