/**
 * 
 */
package acadglidassignment;

import java.util.Scanner;

/**
 * @author nikhil
 *
 */
public class PrimeCheck {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- 
	 * Return Type - void
	 */
	public static void main(String[] args) 
	{
		try
		{
			Scanner objScanner = new Scanner(System.in); // scanner object to get user input
			System.out.println("Please enter number you want to check"); // notify user for entering input
			int userinPut = objScanner.nextInt(); // capture user input
			Thread obj1 = new Thread(new CheckPrimeUsingThread(userinPut)); // checking number is prime using Thread
			System.out.println("Checking Through Thread one \n ");
			obj1.start(); // starting thread 
			Thread obj2 = new Thread(new ChekPrimeUsingRunnable(userinPut)); // checking number is prime using Runnable interface
			System.out.println("Checking Through Second Thread \n");
			obj2.start(); // starting thread 2
			objScanner.close(); // closing scanner object to prevent memory leakage
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
