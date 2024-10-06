package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaro la variable en la que voy a guardar el número que se introduzca en la consola
		int num;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario que ingrese un número en pantalla y lo guardo en la variable
		System.out.println("Dame un número entre 0 y 99999");
		num = reader.nextInt();
		//Voy haciendo comparaciones con el número de cifras que puede tener
		if (num>= 0 && num<10) {
			System.out.println(num + " tiene una cifra");
		} else if (num>=10 && num<100) {
			System.out.println(num + " tiene dos cifras");
		} else if (num>=100 && num<1000) {
			System.out.println(num + " tiene tres cifras");
		} else if (num>=1000 && num<10000) {
			System.out.println(num + " tiene cuatro cifras");
		} else {
			System.out.println(num + " tiene cinco cifras");
		}
		//Cierro el escáner
		reader.close();
	}

}
