import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner console 		= new Scanner(System.in);
		String 	userInput		= null;		
		int 	attempts 		= 0;
		int 	success 		= 0;
		int failAttempts 		= 0;
		int 	endGame 		= 0;
		
		//System.out.println("Guess my name (type stop to exit)");
		//console.nextLine().toLowerCase();
		//System.out.println(console.nextLine().toLowerCase());
		
				
		do 
		{	//System.out.println("No Success is = "+success);
			System.out.println("Guess my name (type stop to exit)");
			 userInput = console.nextLine();
			 	if (!userInput.contentEquals("stop")  )//||(attempts >=0 && success==0||success!=3) ) 
			 		{		
			 			attempts +=1;
			 			if (userInput.contentEquals("Olivia")||userInput.contentEquals("Ava")
			 				||userInput.contentEquals("Emma")) 
			 			 	{
			 				success +=1;
			 				
			 					if (success ==3) {
			 						System.out.println("Congratulations!");
						 			System.out.println("You guessed "+attempts+" times.");
						 			userInput = "stop";
			 					} else if ( failAttempts ==1 &&  success ==1){
			 						
			 						System.out.println("Congratulations!");
						 			System.out.println("You guessed "+attempts+" times.");
						 			userInput = "stop";
			 						
			 					} 
			 				
			 				
			 			 	} else {
			 			 			failAttempts ++;
			 			 			}
			 			 		
			 			}  
			 			else 
			 				{
			 			
			 				System.out.println("You guessed "+attempts+" times.");
			 				userInput = "stop";
			 				}
			 			
			 				 		
		 
		} 	while (!userInput.contentEquals("stop")) ; 
		
		//System.out.println("Congratulations!");
		//System.out.println("You guessed "+attempts+" times.");
		
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

Charlotte
Emma
*/