import java.util.Scanner;

public class javaAssignment5 {

	public static void main(String[] args) {
		
		int avg;

		Scanner str =new Scanner(System.in);
		System.out.println("Enter the Student firstname :");
		String s1 =str.nextLine();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks of any three subject :");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		avg = (m1+m2+m3)/3;
		
		System.out.println("Average of three marks is :" +avg);
		
		
		 if(avg>=60 && avg<75)
		System.out.println("Student "+s1 +"is having first class");
		 else if(avg<40)
				System.out.println("Student "+s1 +" is Fail");
		 else if(avg>=75)
				System.out.println("Student "+s1 +" is having Distinction class");
		 else if(avg>=40 && avg<50)
				System.out.println("Student "+s1 +" is having Pass class");
		 else if(avg>=50 && avg<60)
				System.out.println("Student "+s1 +" is having Second classs");


		 
		
	}

}
