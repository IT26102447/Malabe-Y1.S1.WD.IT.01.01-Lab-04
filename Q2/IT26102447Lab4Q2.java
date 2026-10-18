import java.util.Scanner;
public class IT26102447Lab4Q2{

public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter exam marks (out of 100): ");
	double examMarks = sc.nextDouble();
	
	if (examMarks < 0 || examMarks > 100){
		System.out.println("Invalid input for exam marks. Terminatingn prigram.");
		sc.close();
		return;
		
	}
	
	System.out.print("Please enter lab submission marks (out of 100): ");
	double labMarks= sc.nextDouble();
	
	if (labMarks < 0 || labMarks > 100){
		System.out.println("Invalidinpur for lab marks. Terminating program.");
		sc.close();
		return;
		
	}
	
	System.out.print("Please enter the percentage given for the exam: ");
	double examPerecnt = sc.nextDouble();
	
	System.out.print("Please enter the percentage given for the lab submission: "); 
	double labPercent = sc.nextDouble();
	
	if (examPerecnt + labPercent != 100){
		System.out.println("The percentage must add up to 100.Terminating program.");
		sc.close();
		return;
	}
	
	double finalMark = (examMarks * examPerecnt / 100) + (labMarks * labPercent / 100);
	System.out.println();
	System.out.println("Final exam mark is : " + finalMark);
	sc.close();
}
}
	
		