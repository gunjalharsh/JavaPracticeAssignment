import java.util.Scanner;

public class JavaAssignment1 {

	public static void main(String[] args) {


		
		Scanner str=new Scanner(System.in);
		
		System.out.println("Enter the values :");
		double d1 = str.nextDouble();
		
		
		String doubleAsString = String.valueOf(d1);
		int indexOfDecimal = doubleAsString.indexOf(".");
		
		System.out.println("Double Number: " + d1);
		System.out.println("Integer Part: " + doubleAsString.substring(0, indexOfDecimal));
		System.out.println("Decimal Part: " + doubleAsString.substring(indexOfDecimal));
		
		
	}

}
