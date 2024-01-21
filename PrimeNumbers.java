import java.util.Scanner;
public class PrimeNumbers{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if(number < 2 || number % 2 == 0){
			System.out.print("number is not a prime number");
		} else if(number == 2){
			System.out.print("number is a prime number");
			}else{
				System.out.print("number is  a prime number");
				}
		
		for(int index = 0; index < number; index++){
				if(index % 2 == 0 || index < 2){
					continue;
				};
				System.out.println(index);
		}
	}


}