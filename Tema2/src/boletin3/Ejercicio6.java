package boletin3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Creo una variable para guardar las horas, minutos y segundos que da el usuario
		int horas;
		int minutos;
		int segundos;
		//Creo variables para el print final devolver el resultado
		int horasFinales;
		int minutosFinales;
		int segundosFinales;
		//Creo un escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario la hora con horas minutos y segundos
		System.out.println("Introduzca las horas");
		horas = reader.nextInt();
		System.out.println("Introduzca los minutos");
		minutos = reader.nextInt();
		System.out.println("Introduzca los segundos");
		segundos = reader.nextInt();
		//Sumo 1 a los segundos y voy calculando con un segundo más
		segundosFinales = segundos+1;
		minutosFinales = minutos;
		horasFinales = horas;
		if (segundosFinales == 60) {
			segundosFinales = 0;
			minutosFinales += 1;
		} if (minutosFinales == 60) {
			minutosFinales = 0;
			horasFinales += 1;
		} if (horasFinales == 24) {
			segundosFinales = 0;
			minutosFinales = 0;
			horasFinales = 0;
		}
		System.out.println("Tras un segundo serán las " + horasFinales + ":" + minutosFinales + ":" + segundosFinales);
		//cerramos el escáner
		reader.close();
	}

}
