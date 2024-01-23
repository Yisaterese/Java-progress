import java.util.Scanner;
public class AddSum{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
	
		int sum = 0;
		String response;
		do{

			System.out.println("Enter number: ");
			int number1 = input.nextInt();
			int number2  = input.nextInt();

			sum = number1+number2;
			System.out.println("the sum is: " +sum);

			
				System.out.println("Do you want to perform another operation?");
				response = input.next();

						
		}while  (response.equalsIgnoreCase("yes"));
		
	}
}
