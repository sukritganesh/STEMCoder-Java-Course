import java.lang.Math;
public class RandomSubstring {

	public static void main(String[] args) {

		String name = "Donald Trump will start WW3";
		
		int pos1 = (int) (Math.random()*(name.length()));
		
		int pos2 = (int) (Math.random()*(name.length()));
		
		int min = Math.min(pos1, pos2);
		
		int max = Math.max(pos1, pos2);
		
		String sub = name.substring(min, max);
		
		System.out.println(sub);

	}

}
