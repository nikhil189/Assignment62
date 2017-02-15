/**
 * 
 */
package acadglidassignment;

/**
 * @author nikhil
 * Class to check if a number is prime implementing Runnable interface
 */
public class ChekPrimeUsingRunnable implements Runnable
{
	private int input; // class variable to capture user input
	
	ChekPrimeUsingRunnable(int input) // constructor to initialize class variable
	{
		this.input = input;
	}
	
	@Override
	public void run() 
	{
		CheckPrimeUsingThread obj = new CheckPrimeUsingThread(input); // initialize object 
		obj.checkPrime(input); // calling common function to check if a number is prime or composite
	}

}
