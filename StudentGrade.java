import java.util.Scanner;
public class StudentGrade{

	public static void main(String[] arguments){
		Scanner input = new Scanner(System.in);
		
		String student1 = "";
		
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		String studentName  = "";

		for(int counter = 0; counter < 5; counter++){

			System.out.println("Enter student name");
			 studentName = input.next();

			System.out.println("Enter student letter grade");
			int  studentGrade = input.nextInt();

			switch(studentGrade){

				case 90:
					aCount++;
					student1++;
					break;
				
				case 80 :
					bCount++;
					break;

				case 70:
					cCount++;
					break;

				case 60:
					dCount++;
					break;

				default: 
					System.out.print("Enter a valid grade");
			}
		}
	System.out.print( "The studend name is : "+studentName + "\nThe number of A:" +aCount+ "\nThe number of B:" +bCount+ "\nThe number of C:" +cCount+ "\nThe number of D:" +dCount);
	}


}