/**
 * 
 */
package acadglidassignment;

/**
 * @author nikhil
 *Class to check if a number is prime by extending Runnable interface
 */
public class CheckPrimeUsingThread extends Thread
{
	private int input;// class variable to capture user input
	
	CheckPrimeUsingThread(int input) // constructor to initialize class variable
	{
		this.input = input;
	}
	
	public void run()
	{
		CheckPrimeUsingThread obj = new CheckPrimeUsingThread(input); // creating object and initializing it
		obj.checkPrime(input); // calls Check Prime Method
	}
	
	/**
	 * Author - Nikhil Sharma
	 * Method Name - checkPrime
	 * Params-  int
	 * Return Type - void
	 * Purpose  checks if a number is prime or composite and prints message
	 */
	void checkPrime(int num)
	{
		boolean isPrime = true; // boolean to check number prime or false
		try
		{
			for(int i=2; i<= num/2;i++) // divind number by each number from 2 to number/2, if it is divisible, it is composite else prime
			{
				if(num % i == 0)
				{
					isPrime = false;
				}
			}
			if(isPrime) // isPrime stays true if number wasn't divisible
			{
				System.out.println("Number is Prime \n");
			}
			else
			{
				System.out.println("Number is Composite \n ");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Number is Prime");
		}
	}
}
