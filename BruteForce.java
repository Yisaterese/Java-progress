public class BruteForce{

	public static void main(String[] arguments){

		int result1 = 0;
		int result2 = 0;

		for(int counter = 0; counter < 166; counter++ ){
			for(int side1 = 1; side1 < 166; side1++){
				for(int side2 = 1; side2 < 166; side2++){
					result1 = math.pow(side1,2);
					result2 = math.pow(side2,2);

			System.out.printf("%d%d",result1,result2);
					

				}
			}

		}
	
	}
}