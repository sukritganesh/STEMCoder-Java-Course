import java.util.Scanner;
public class MiniQuiz {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		int grade = 0;
		
		System.out.println("Question 1: _______ was the giants mvp in the 2014 post-season.");
		String q1 = myInput.nextLine();
		if (q1.indexOf("Bumgarner") != -1){
			grade++;
		}
		
		System.out.println("Question 2: What letter of the alphabet sounds like a yellow flying insect?");
		String q2 = myInput.nextLine();
		if (q2.equals("b") || q2.equals("B")){
			grade ++;
		}
		
		

	}

}
