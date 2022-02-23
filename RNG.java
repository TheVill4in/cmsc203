import java.util.Random;
import java.util.Scanner;

/**
 * This is the utility class to accompany RandomNumberGuesser
 * It contains static methods to generate a random number,
 * validate the guesses as being between the previous low and high guesses,
 * and maintain the number of guesses.
 * @author ralexander
 */












public class RNG {
	private static int count=0;
	static Scanner scan;
	public RNG() {
		count++;
	}
	
	/**
	 * Sets the count to zero
	 */
	public static void resetCount() {
		count = 0;
	}
	
	/**
	 * generates a random integer between 1 and 100
	 * @return the random number as an integer
	 */
	public static int rand() {
		Random rand = new Random();
		int randInt = rand.nextInt(100)+1;
		return randInt;
	}
	
	/**
	 * Checks that nextGuess is strictly between lowGuess and highGuess
	 * @param nextGuess
	 * @param lowGuess
	 * @param highGuess
	 * @return a boolean, true if the guess is with the bounds, false otherwise
	 */
	public static boolean inputValidation(int nextGuess, int lowGuess, int highGuess) {
		//do {
		boolean rtnValue = true;
		if (nextGuess>=highGuess || nextGuess<=lowGuess) {
				   System.out.println("   >>> Guess must be between "+lowGuess+" and "+highGuess+
						   ".  Try again");				   
				   rtnValue = false;
			   }
		//	} while (nextGuess>=highGuess || nextGuess<=lowGuess);
		count++;
		return rtnValue;
		
	}

	/**
	 * @return an integer, the current value of count
	 */
	public static int getCount() {
		return count;
	}
	
	public static void main(String args[])
	{
		
		
		
		int finish=1;
	  Scanner guess = new Scanner(System.in);
		while (finish==1)
		{
	
		System.out.println("Lets play a little game you will be ask to guess a number between 0 and 100");
		System.out.println("You only have 7 attempt to guess the randome number that was selected ");
		System.out.println("with eveytime a little hints that indicate if your answer is too low or too high");
		System.out.println("Without further due...Let's Star!!! ");
		int randNum=RNG.rand();
		System.out.println("Enter your first guess: ");
		int userGuess=guess.nextInt();
			
			for(int count=1;count<7;count++)
			{
					if( userGuess < randNum)
					{
						System.out.println("Number of Guess is " +count);
						System.out.println("Your guess is too law");
						System.out.println("Enter your next guess between "+ userGuess +" and 99: ");
						userGuess=guess.nextInt();
					}
					else if( userGuess > randNum)
					{
						System.out.println("Number of Guess is "+count);
						System.out.println("Your guess is too high");
						System.out.println("Enter your next guess between 0 and "+ userGuess+": " );
						userGuess=guess.nextInt();
						
					}
					
					
					
								
					
					
				
			}
				
									if( count==7||(userGuess != randNum))
								{
									System.out.println("You haven't guess the righ answer after the 7 attemps. ");
									System.out.println("would you like to try again enter 1 for yes or 0 for no :");
									finish=guess.nextInt();
										if (finish==1) 
										{
											System.out.println("Lets do it again!!!");
											
										}
										if (finish==0) 
										{
											System.out.println("Thanks for Playing...");
											System.exit(count);
										}
									
									
								}
								if((userGuess == randNum))
								{
									System.out.println("You have guess the righ answer after the 7 attemps. ");
									System.out.println("would you like to try again enter 1 for yes or 0 for no :");
									finish=guess.nextInt();
									if (finish==1) 
									{
										System.out.println("Lets do it again!!!");
										
									}
									if (finish==0) 
									{
										System.out.println("Thanks for Playing...");
										System.exit(count);
									}
								}
						
	
	
		
		}
		//while (finish==1) ;
guess.close();
		 
	}

}