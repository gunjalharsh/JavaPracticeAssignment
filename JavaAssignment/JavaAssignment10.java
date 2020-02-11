import java.math.BigInteger;
import java.util.Scanner;

public class JavaAssignment10 {

	public static void main(String[] args) {
		Scanner str =new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n1 = str.nextInt();
		
		BigInteger factorial = new BigInteger("1");
		
		if(n1>=0)
		{
			for(int i=n1;i>1;i--)
			{
				factorial=factorial.multiply(BigInteger.valueOf(i));
				
			}
			System.out.println("Factorial of "+n1+" is :" +factorial);
		}

		else  System.out.println("Please enter non negative integer");
			
		

	}

}