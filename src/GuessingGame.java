import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		String userInput ;
		int attempts = 0;
		
		//System.out.println("Guess my name (type stop to exit)");
		//console.nextLine().toLowerCase();
		//System.out.println(console.nextLine().toLowerCase());
		
				
		do 
		{
			System.out.println("Guess my name (type stop to exit)");
			userInput = console.nextLine();
			if (userInput.contentEquals("Olivia")||userInput.contentEquals("Ava")
					||userInput.contentEquals("Emma")||!userInput.contentEquals("stop")) 
			{
				attempts +=1;
				System.out.println(attempts);
				
			}
			
		} while (!userInput.equals("stop")); 
		

	}

}


/* Guess my name (type stop to exit)
Olivia
Guess my name (type stop to exit)
Ava
Guess my name (type stop to exit)
Emma
Congratulations!
You guessed 3 times. 
*/