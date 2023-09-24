import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		String userInput ;
		int attempts = 0;
		int success = 0;
		
		//System.out.println("Guess my name (type stop to exit)");
		//console.nextLine().toLowerCase();
		//System.out.println(console.nextLine().toLowerCase());
		
				
		do 
		{
			System.out.println("Guess my name (type stop to exit)");
			userInput = console.nextLine();
			
			if (!userInput.contentEquals("stop")&& success !=3) 
			{	
					attempts +=1;
				if (userInput.contentEquals("Olivia")||userInput.contentEquals("Ava")
					||userInput.contentEquals("Emma")) 
				{
					success +=1; 
								
				}
										
				
			} else 
			{
				
				System.out.println("Congratulations!"+ "\n"+"You guessed "+attempts+ " times.");
			}
						
		} while (!userInput.equals("stop")||success ==3); 
		

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