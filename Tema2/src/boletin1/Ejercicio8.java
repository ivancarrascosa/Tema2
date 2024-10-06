package boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Declaro la variable en la que voy a guardar el número que se introduzca en la consola
				double nota;
				//Creo el escáner
				Scanner reader = new Scanner(System.in);
				//Pido al usuario que ingrese la nota por pantalla y lo guardo en la variable que he creado
				System.out.println("Dime la nota del alumno");
				nota = reader.nextDouble();
				//Voy haciendo comparaciones con el número de cifras que puede tener
				if (nota>= 0 && nota<5) {
					System.out.println("El alumno tiene un insuficiente");
				} else if (nota>=5 && nota<6) {
					System.out.println("El alumno tiene un suficiente");
				} else if (nota>=6 && nota<7) {
					System.out.println("El alumno tiene un bien");
				} else if (nota>=7 && nota<9) {
					System.out.println("El alumno tiene un notable");
				} else {
					System.out.println("El alumno tiene un sobresaliente");
				}
				//Cierro el escáner
				reader.close();
			}


	}

