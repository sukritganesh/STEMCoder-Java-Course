import java.util.Scanner;
public class EnhancedRandomSub {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		String name = myInput.nextLine();
		
		int pos1 = (int) (Math.random()*(name.length()));
		
		int pos2 = (int) (Math.random()*(name.length()));
		
		int min = Math.min(pos1, pos2);
		
		int max = Math.max(pos1, pos2);
		
		String sub = name.substring(min, max);
		
		System.out.println(sub);

	}

}
