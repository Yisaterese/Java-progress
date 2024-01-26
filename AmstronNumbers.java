import java.util.Scanner;
public class AmstronNumbers{
	public static void main(String[] args){


		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = input.nextInt();
	
		for(int counter = 1; counter  <=  100; counter++){
			
			counter = counter * 3 ;
			//number += counter;
			 
			System.out.printf("%d %n",number  );
		}
		
	}

}