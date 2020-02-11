import java.util.Scanner;

public class JavaAssignment8 {
	
	public static void main(String args[])
	{
		int sum=0;
		Scanner str =new Scanner(System.in);
	
		
		System.out.println("Enter the size of numbers :");
		int n1 = str.nextInt();
		
	
		for (int i = 1; i <= n1; i++) 
		{
			if (i % 2 != 0) 
			{
				sum = sum + i;
			}
		}
		System.out.println("The Sum Of "+n1 +" Odd Numbers are:" + sum);
		
	}

}
