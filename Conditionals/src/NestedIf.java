import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int age = myInput.nextInt();
		
		if (age > 20){
			if (age > 72){
				System.out.println("Senior");
			}
			else{
				System.out.println("Adult");
			}
		}
		else{
			if (age > 12){
				System.out.println("Teen");
			}
			else {
				System.out.println("Kid");
			}
		}

	}

}
