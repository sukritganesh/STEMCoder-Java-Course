import java.util.Scanner;
public class booleans {

	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter your first grade");
		int g1 = myInput.nextInt();
		
		System.out.println("Enter your second grade");
		int g2 = myInput.nextInt();
		
		System.out.println("Enter your third grade");
		int g3 = myInput.nextInt();
		
		double gpa = 0;
		
		//Grade 1
		
		if (g1 >= 89.5){
			gpa += 4;
		}
		else if(g1 >= 79.5 && g1 < 89.5){
			gpa += 3;
		}
		else if(g1 >= 69.5 && g1 < 79.5){
			gpa += 2;
		}
		else if(g1 >= 59.5 && g1 < 69.5){
			gpa += 1;
		}
		
		//Grade 2
		
		if (g2 >= 89.5){
			gpa += 4;
		}
		else if(g2 >= 79.5 && g2 < 89.5){
			gpa += 3;
		}
		else if(g2 >= 69.5 && g2 < 79.5){
			gpa += 2;
		}
		else if(g2 >= 59.5 && g2 < 69.5){
			gpa += 1;
		}
		
		//Grade 3
		
		if (g3 >= 89.5){
			gpa += 4;
		}
		else if(g3 >= 79.5 && g3 < 89.5){
			gpa += 3;
		}
		else if(g3 >= 69.5 && g3 < 79.5){
			gpa += 2;
		}
		else if(g3 >= 59.5 && g3 < 69.5){
			gpa += 1;
		}
		
		gpa = gpa/3;
		
		System.out.println(gpa);
		
		if (gpa < 3){
			System.out.println("You failed!!!");
		}
		
	}

}
