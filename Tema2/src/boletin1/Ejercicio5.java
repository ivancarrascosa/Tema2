package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// creo la variable en la que voy a almacenar los tres números que va a dar el
		// usuario
		double num1;
		double num2;
		double num3;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario los números y los voy guardando en las variables
		System.out.println("Dame el primer número");
		num1 = reader.nextDouble();
		System.out.println("Dame el segundo número");
		num2 = reader.nextDouble();
		System.out.println("Dame el tercer número");
		num3 = reader.nextDouble();
		//Creo los condicionales para las distintas posibilidades que tenemos
		if (num1>=num2 && num2>=num3) {
			System.out.println(num1 + "," + num2 + "," + num3);
		} else if (num1>=num3 && num3>=num2) {
			System.out.println(num1 + "," + num3 + "," + num2);
		} else if (num2>=num3 && num3>=num1) {
			System.out.println(num2 + "," + num3 + "," + num1);
		} else if (num2>=num1 && num1>=num3) {
			System.out.println(num2 + "," + num1 + "," + num3);
		} else if (num3>=num1 && num1>=num2) {
			System.out.println(num3 + "," + num1 + "," + num2);
		} else {
			System.out.println(num3 + "," + num2 + "," + num1);
		}
		//cierro el escáner
		reader.close();
		}
}
