import java.util.Scanner;
public class StringCompare {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String name1 = myInput.nextLine();
		
		System.out.println("Enter another String");
		String name2 = myInput.nextLine();
		
		if (name1.equals(name2)){
			System.out.println("Equal");
		}
		else System.out.println("Not Equal");

	}

}
