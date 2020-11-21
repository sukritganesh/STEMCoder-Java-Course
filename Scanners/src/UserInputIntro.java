import java.util.Scanner;
public class UserInputIntro {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		String name = myInput.nextLine();

		System.out.println("Hello, " + name);
	}

}
