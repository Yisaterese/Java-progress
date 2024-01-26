import java.util.Scanner;
public class AmstrongNumbers{
	public static void main(String[] args){


		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number= input.nextInt();
		String strNumber = "" + number;

		int result = 0;		

		for(int counter = 0; counter  <  strNumber.length(); counter++){

			char pickChar =  strNumber.charAt(counter);
			int numericValues = Character.getNumericValue(pickChar);

			result += (int)Math.pow( numericValues,strNumber.length() );
	
			 
			System.out.printf("%d %n",numericValues );
		}
		if( number == result){
				System.out.print("number is amstrong");
			}
			
	}

}