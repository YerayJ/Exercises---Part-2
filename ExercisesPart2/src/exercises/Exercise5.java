package exercises;

import java.util.Scanner;

public class Exercise5 {

	/*
	 * Design a program that asks the user to enter values for the length and height
	 * of a rectangle and then displays the area and perimeter of that rectangle.
	 */
	
	public static void main(String[] args) {
		//Declaramos variables.
		double a,b ;
		double area,perimetro;
		Scanner key = new Scanner(System.in);
		
		//Pedimos las variables a y b que en este caso serían el valor de los lados
		System.out.println("Dame el valor del lado a: ");
		a = key.nextDouble();
		System.out.println("Dame el valor del lado b: ");
		b = key.nextDouble();
		
		//Realizamos las operaciones de área y perímetro
		area = 2*a + 2*b;
		perimetro = a*b;
		
		//Imprimimos el resultado en pantalla
		System.out.println("El resultado de área es: " + area );
		System.out.print("El resultado del perímetro es: " + perimetro );
		
	}

}
