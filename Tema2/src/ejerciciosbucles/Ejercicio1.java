package ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creo las variables para almacenar las horas, minutos y segundos que
		// introduzca el usuario
		int horas;
		int minutos;
		int segundos;

		// Creo las variables donde almacenaré las horas que voy a devolver como
		// respuesta
		int horasFinales;
		int minutosFinales;
		int segundosFinales;

		// Creo una variable para almacenar los segundos a incrementar
		int incremento;

		// Creo un string para la respuesta final
		String res;

		// Creo un escáner
		Scanner reader = new Scanner(System.in);

		// Pido al usuario que introduzca las horas, minutos y segundos y los voy
		// almacenando
		System.out.println("Introduzca las horas:");
		horas = reader.nextInt();
		System.out.println("Introduzca los minutos:");
		minutos = reader.nextInt();
		System.out.println("Introduzca los segundos:");
		segundos = reader.nextInt();

		// Pido al usuario los segundos que quiere incrementar
		System.out.println("Introduzca los segundos que desea incrementar:");
		incremento = reader.nextInt();

		// Igualo ya segundosFinales a segundos para ir incrementándolos
		segundosFinales = segundos;

		// Creo un bucle for en el que sumo uno a los segundos "incremento" veces
		for (int i = 1; i <= incremento; i++) {
			segundosFinales++;
		}

		// Establezco que los minutos finales van a ser los minutos más los segundos
		// entre 60 (solo la parte entera)
		minutosFinales = minutos + segundosFinales / 60;

		// Hago lo mismo que con los minutos pero con las horas y usando la parte entera
		// de dividir los minutos finales entre 60
		horasFinales = horas + minutosFinales / 60;

		// Los minutos y segundos finales son los que sobrarán al dividirlos entre 60,
		// por lo que hago el módulo
		segundosFinales %= 60;
		minutosFinales %= 60;

		// Hago lo mismo con las horas pero en este caso con 24
		horasFinales %= 24;

		// En caso de que alguna de las variables sea menor que 10, le pongo un 0
		// delante a la respuesta
		if (horasFinales < 10) {
			res = "0" + horasFinales + ":";
		} else {
			res = horasFinales + ":";
		}
		if (minutosFinales < 10) {
			res += "0" + minutosFinales + ":";
		} else {
			res += minutosFinales + ":";
		}
		if (segundosFinales < 10) {
			res += "0" + segundosFinales;
		} else {
			res += segundosFinales;
		}

		System.out.println(res);
		
		// Cierro el escáner
		reader.close();
	}

}
