package boletin5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creo una variable para almacenar el número que me introduzca el usuario
		int num;
		//Creo un contador para ir sumandole uno hasta el 10 y completar la tabla del número
		int cont = 1;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario un número y lo guardo en la variable num
		System.out.println("Introduzca un número para mostrar su tabla de multiplicar");
		num = reader.nextInt();
		//Creo un do while hasta que el contador llegue a 10 y mostrando la multiplicación
		do {
			System.out.println(num + "x" + cont  + "=" + num*cont);
			cont++;
		} while (cont <= 10);
		
		//Cerramos el escáner
		reader.close();
		

	}

}
