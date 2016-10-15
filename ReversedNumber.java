/* This is the first deliverable project for the October 2016 Java Bootcamp.
 * The task is to create an app that will reverse the number entered by the user. 
 * @author DanielChristiansen 
 */

// This statement imports the Scanner class, allows user input. Must be 1st line of program.
import java.util.Scanner;

public class ReversedNumber {

	public static void main(String[] args) {

		int num = 0;
		int rev = 0;

		// Displays sentence and allows user to input an integer to be reversed.
		System.out.println("Please input a number to be reversed and press Enter: ");

		Scanner in = new Scanner(System.in);
		// Scanner can be used to read a numeric string entered and assign its value to a variable.
		num = in.nextInt();

		while (num != 0) {

			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;
		}
		
		/* Outputs the reversed integer that the user entered at the end of the
		 * sentence.
		 */
		System.out.println("The reverse of the number you entered is: " + rev);

	}

}
