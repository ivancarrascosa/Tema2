package boletin6;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creo una variable para almacenar la suma 
		int n = 1;
		//Creo un escáner
		Scanner reader = new Scanner(System.in);
		//creo un bucle for que desde 1 vaya sumando dos hasta que i llegue a 10
		for(int i = 0 ; i<10 ; i++) {
			System.out.println(n);
			n+=2;
		}
		reader.close();
	}

}
