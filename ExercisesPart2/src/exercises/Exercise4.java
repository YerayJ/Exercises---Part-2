package exercises;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// declare variables
		int x, y;
		Scanner keyboard = new Scanner (System.in);
		// enter values
		System.out.print("Enter value for x ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		// code attempting to swap two variables
		x = y;
		y = x;
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		}
/*
 * Can you see why the program doesn’t do what we hoped?
 * Sí, ya que faltaba el Scanner y no recogía los datos del usuario.
 * What would be the actual output of the program?
 * Las dos variables dan el mismo valor.
 * How could you modify the program above so that the values of the two variables are swapped successfully?
 * Añadiendo el scanner.
 * 
 */

}
