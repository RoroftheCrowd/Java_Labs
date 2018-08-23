import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class DontTellThemTheyLost {
	public static void main(String args[])	{
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter an int from 1 to 10: ");
		
		int inputNumber = keyboard.nextInt();
		int randomNumber = new Random() .nextInt(10) + 1;
		
		if (inputNumber == randomNumber) {
			out.println ("You Win");
			
		}
	out.println("That was a very good guess");
	out.println("The random number was ");
	out.println(randomNumber + ".");
	out.println("Thanks for Playing.");
	}
}
