import java.util.Scanner;
public class TFtest {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		int grade = 0;
		
		System.out.println("Question 1: Is Antarctica a desert?");
		boolean input1 = myInput.nextBoolean();
		if (input1 == true){
			grade++;
		}
		
		System.out.println("Question 2: Is Casablanca the capital of Morroco?");
		boolean input2 = myInput.nextBoolean();
		if (input2 == false){
			grade++;
		}
		
		System.out.println("Question 3: Have the Celtics won the most NBA championships?");
		boolean input3 = myInput.nextBoolean();
		if (input3 == true){
			grade++;
		}
		
		System.out.println("Your grade is: " + grade + "/3");
		
		System.out.println("You earned: " + grade*100/3 + " percent.");

	}

}
