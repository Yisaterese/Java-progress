import  java.util.Scanner;
import java.util.ArrayList;
public class MinAndMaxSum{

	public static void main(String[] arguments){
		Scanner input = new Scanner(System.in);	
	
		System.out.print("Enter number of times you the app to run: ");		
		int userInput = input.nextInt();

		int counter = 0; 
		int maximum;
		int minimum;
		int  sumOfValues = 0;

		while (counter  <  userInput){

			System.out.print("Enter numbers: ");
			int numericValues = input.nextInt();

			int[] numbersArray = new int[numericValues];
			numbersArray.add(numericValues);
			int[] newArray = numbersArray.length;


			maximum = newArray[0];
			minimum = newArray.length;

			int counter2 = 0;
			for(int index = 0; index < numbersArray.length;index++){
					newArray[counter] = numbersArray[index];
					counter2++;

				if(newArray[counter]  > maximum){
					maximum = newArray;;			
				}
				
				if(newArray[index] < minimum){
					minimum = newArray;
				}
			sumOfValues = maximum +minimum;
			}
			counter++;
		}
System.out.printf("the maximum number is:  %d%nThe minimum number is: %d%nThe sum of values is:  ",maximum,minimum,sumOfValues);
	}

}