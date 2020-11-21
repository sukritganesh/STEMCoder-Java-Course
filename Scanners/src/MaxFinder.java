import java.lang.Math;
import java.util.Scanner;
public class MaxFinder {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter 7 numbers");
		
		int num1 = myInput.nextInt();
		int num2 = myInput.nextInt();
		int num3 = myInput.nextInt();
		int num4 = myInput.nextInt();
		int num5 = myInput.nextInt();
		int num6 = myInput.nextInt();
		int num7 = myInput.nextInt();
		
		System.out.println(Math.max(Math.max(num1, num2), Math.max(num3, num4)));

	}

}
