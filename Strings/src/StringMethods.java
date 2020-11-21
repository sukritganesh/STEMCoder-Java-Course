
public class StringMethods {

	public static void main(String[] args) {
		
		String name = "Washington";

		int position = (int) (Math.random()*(name.length()));
		
		System.out.println(name.charAt(position));
		

	}

}
