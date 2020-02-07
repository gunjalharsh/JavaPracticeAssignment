import java.util.Scanner;

public class JavaAssignment4 {
	
	public static void main(String[] args) {
		int max=0;
		
	Scanner str =new Scanner(System.in);
	
	System.out.println("Enter the three Values :");
	int n1 = str.nextInt();
	int n2 = str.nextInt();
	int n3 = str.nextInt();
	
	
	 max = n3 > (n1 > n2 ? n1 : n2 ) ? n3 :(n1 > n2 ? n1 : n2 );
	   
     System.out.println("Largest Number:"+max);
     
     int x =(n1 >= n2 && n1 >= n3) ? ((n2 >= n3) ? n2 : n3) :((n2 >= n3) ? ((n1 >= n3) ? n1 : n3) : ((n1 >= n2) ? n1 : n2));
     
     
     System.out.println("Second largest Number:"+x);

	
	

	}

}
