import java.util.Scanner;
import java.util.Scanner;
public class MoreIfElse {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int age = myInput.nextInt();
		
		if (age >= 21){
			System.out.println("Adult");
		}
		else if(age > 0){
			System.out.println("Youth");
		}
		else{
			System.out.println("Invalid Age");
		}
	}

}
