import java.util.Scanner;

public class JavaAssignment2 {

	public static void main(String[] args) {
		int max=0;
		Scanner str =new Scanner(System.in);
		int arr2[]=new int[10];
		System.out.println("Enter the Three values:");
			
			int n1 =str.nextInt();
			int n2 =str.nextInt();
			int n3 =str.nextInt();
			

			   
			 max = n3 > (n1 > n2 ? n1 : n2 ) ? n3 :(n1 > n2 ? n1 : n2 );
			   
		        System.out.println("Largest Number:"+max);
			

	}

}
