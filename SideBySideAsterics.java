public class SideBySideAsterics{
	public static void main(String[] args){
		
		for(int row = 1; row <= 10; row++){
			for(int col = 1; col <= row; col++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();


		for(int row = 1; row <= 10; row++){
			for(int col = 10; col >=  row; col--){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();



		for(int row = 10; row  >= 1; row--){
			for(int spaces = 10 - row; spaces >= 1; spaces--){
				System.out.print(" ");
			}
			for(int col = row; col >= 1; col--){
				System.out.print("*");
				}
			System.out.println("");
		}
		System.out.println();


			
		for(int row = 1; row <= 10; row++){	
			for(int spaces = 1; spaces <= 10-row; spaces++){
				System.out.print(" ");
			}
			for(int col =  1; col <= row; col++){
				System.out.print("*");
			}
			System.out.println();
			}
	}	
}