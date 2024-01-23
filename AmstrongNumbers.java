import java.util.Scanner;
public class AmstrongNumbers{
	public static void main(String[] args){


		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");
		String numberStr = input.nextLine();
	
		for(int counter = 0; counter  <=  numberStr.length(); counter++){
			char pickChar = numberStr.charAt(counter);
			numberStr(counter) *= numberStri.length();
			int numericValues = Character.getNumericValues(numberStr);

			
			counter = counter * 3 ;
			number *= counter;
			 
			System.out.printf("%d %n",number  );
		}
		
	}

}