import java.util.Scanner;
import java.lang.Math;
public class InputTest {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Welcome to KeyGen Enhanced.");
		
		System.out.println("Enter a number.");
		
		int num1 = myInput.nextInt();
		
		System.out.println("Enter a number.");
		
		int num2 = myInput.nextInt();
		
		System.out.println("Enter a number.");
		
		int num3 = myInput.nextInt();
		
		int key = (int) (((num1*13 + num2 * 102 + num3*989 - num1%num2 -num1*num2 + num1*num3 - 35*num3/num2)*num1 + num3*num2 + 87*num2 + Math.sqrt(num3*num2*num1) + 967 - num1 + num3*67*num2)*num2 + 156826*Math.max(num1,  num3));
		
		System.out.println(Math.abs(key));
		

	}

}
