import java.lang.Math;

public class MathMethods {

	public static void main(String[] args) {

		int test1 = 98;
		int test2 = 89;
		int test3 = 97;
		
		int quiz1 = 94;
		int quiz2 = 96;
		
		int home1 = 100;
		int home2 = 100;
		int home3 = 0;

		double average = 0;
		
		double testavg = (test1 + test2 + test3)/3.0;
		System.out.println(testavg);
		double quizavg = (quiz1 + quiz2)/2.0;
		System.out.println(quizavg);
		double homeavg = (home1 + home2 + home3)/3.0;
		System.out.println(homeavg);
		
		average = (testavg * 5 + quizavg * 3 + homeavg * 2)/10;
		
		System.out.println(average);
		
	}

}
