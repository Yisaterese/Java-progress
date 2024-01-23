import java.security.SecureRandom;
import java.util.Scanner;
public class RandomGuess{
	public static void main(String[] args){


		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		
		int secureRandom = random.nextInt(20);
	
		System.out.println("Enter guess: ");
		int userGuess = input.nextInt();

		while (userGuess != secureRandom){
	
			if(userGuess < secureRandom){
				System.out.println("\nToo low try agin");
			}
			else if(userGuess > secureRandom){
				System.out.println("Too high try agin");
			}
			else if(userGuess ==  secureRandom){
				System.out.println("correct guess");
				
			}else{

				System.out.println("Enter a valid guess");
			 }	

			System.out.println("Enter guess: ");
			userGuess = input.nextInt();	
		}
		System.out.print(secureRandom);
	}
}