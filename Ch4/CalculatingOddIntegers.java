/*Fil: CalculatingOddIntegers.java
 * ---------------------------------------
 * This program gets a number from the client
 * and throw back the relative odd numbers pertained
 * to to it. After that it calculates the total of those
 * odd numbers. 
 */

//imports
import acm.program.*;

public class AddOddIntegers extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter an integer: ");
		int total = 0;
		
		for (int i = 1; i <= n * 2; i +=2){
			int add = i;
			total += add;
		}
		println(total);
	}

}
