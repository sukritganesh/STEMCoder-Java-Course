import java.util.Scanner;
public class LeapYearTest {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Welcome to leap year tester.\nPlease enter a year.");
		
		int year = myInput.nextInt();
		
		if (year%400 == 0){
			System.out.println("Leap year");
		}
		else {
			if (year%100 == 0){
				System.out.println("Not a leap year");
			}
			else {
				if (year%4 == 0){
					System.out.println("Leap year");
				}
				else{
					System.out.println("Not a leap year");
				}
			}
		}

	}

}
