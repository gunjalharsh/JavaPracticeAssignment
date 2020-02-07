import java.util.Scanner;

public class JavaAssignment6 {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n1 =str.nextInt();
		
		int Last_digit = n1 %10;
		
		System.out.println("Last digit in Integer :" + Last_digit);
		
		switch(Last_digit)
		{
			case 1: if(Last_digit == 1)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is one");
			}break;
			case 2: if(Last_digit == 2)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is two");
			}break;
			case 3: if(Last_digit == 3)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is three");
			}break;
			case 4: if(Last_digit == 4)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is four");
			}break;
			case 5: if(Last_digit == 5)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is five");
			}break;
			case 6: if(Last_digit == 6)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is six");
			}break;
			case 7: if(Last_digit == 7)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is seven");
			}break;
			case 8: if(Last_digit == 8)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is eight");
			}break;
			case 9: if(Last_digit == 9)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is nine");
			}break;
			case 0: if(Last_digit == 0)
			{
				System.out.println(" Last  digit of given number in Integer is "+Last_digit + " & in Word is zero");
			}
			break;
		
		}
		
	}

}
