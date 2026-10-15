import java.util.Scanner;

public class IT26102447Lab4Q1 {
	public static void main(String[] args) {
		
		int number;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		 number = sc.nextInt();
		
	result = (number > 0)? "The number is Positive" :
	(number < 0) ? "The number is Negative" :
	"The number is Zero";
	
	System.out.println(result);
	}
}