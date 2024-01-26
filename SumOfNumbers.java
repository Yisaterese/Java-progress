public class SumOfNumbers{
	
	public static int  sumOfNumbers(int number){
		int sumNumbers = 0;

		for(int counter = 1; counter <=  number; counter++){
			if(counter % 3 == 0){
				sumNumbers += counter;
			}				
		}
	return sumNumbers;
	}
}