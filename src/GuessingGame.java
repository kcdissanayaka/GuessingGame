import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner console 		= new Scanner(System.in);
		String 	userInput 		= null;
		int 	attempts 		= 0;
		int 	success 		= 0;
		boolean failAttempts 	= false;
		int 	finishGame		= 0;
		
		//System.out.println("Guess my name (type stop to exit)");
		//console.nextLine().toLowerCase();
		//System.out.println(console.nextLine().toLowerCase());
		
				
		do 
		{
		 if (success < 3 || !failAttempts || finishGame==0 ) 
		 {
			 	System.out.println("Guess my name (type stop to exit)");
			 	userInput = console.nextLine();
			
			 	if (!userInput.contentEquals("stop")) 
			 		{	
			 			attempts +=1;
					
			 			if (userInput.contentEquals("Olivia")||userInput.contentEquals("Ava")
			 					||userInput.contentEquals("Emma")) 
			 				{
			 					success +=1;
			 					//System.out.println("if Success rate "+success);
							}
			 			else
							{
			 					failAttempts  = true;
								
							}		
			 				
			 		} else {finishGame=1;}
			 		
		 	} 
		 		
		 	else if  (success > 3 ) 
		 	{
			 System.out.println("Congratulations!"+ "\n"+"You guessed "+attempts+ " times.");
			 finishGame = 1;
		 	}
		 
		} while (!userInput.contentEquals("stop") ||success !=3 ||finishGame ==0 ); 
		
		System.out.println("Congratulations!"+ "\n"+"You guessed "+attempts+ " times.");
		finishGame = 1;
		//System.out.println(success);
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