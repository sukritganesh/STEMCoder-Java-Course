import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		int num1 = myInput.nextInt();
		int num2 = myInput.nextInt();
		
		if (num1 > num2){
			System.out.println(num1);
		}
		if (num2 >= num1){
			System.out.println(num2);
		}

	}

}
