import java.util.Scanner;

public class JavaAssignment3 {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);

		System.out.println("Enter the value :");
		int n1 = str.nextInt();
		 String input =(n1%2==0) ? "Even" : "Odd";
		 System.out.println("Given number "+ n1+" is " +input);
		
		
		
		

	}

}
