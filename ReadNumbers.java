import java.util.ArrayList;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> collectNumbers = new ArrayList<Integer>();

        int firstNumber = 0;
        int counter = 0;
        int sumOfElements = 0;

        System.out.println("enter numbers");
        int numbers = input.nextInt();

       while(numbers != -1){
		 collectNumbers.add(numbers);

          	firstNumber = collectNumbers.get(0);
           for(int index = 0; index  <  collectNumbers.size(); index++){
           	  sumOfElements  += collectNumbers.get(index);
           	   numbers = input.nextInt();
           	 }
	 	 if(sumOfElements >= firstNumber){
               		     break;
              	  }
     	 }
	 System.out.printf("The sum of elements is: %d%nThe first element is: %d",firstNumber,sumOfElements);
    }
}
