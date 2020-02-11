import java.util.Scanner;

public class JavaAssignment7 {

	public static void main(String[] args) {
	Scanner str =new Scanner(System.in);
	
	System.out.println("Enter the alphabet : ");
	String s1 = str.next();
	
	
	
	System.out.println(s1);
	
	switch (s1) {
    case "a":
    case "e":
    case "i":
    case "o":
    case "u":
        System.out.println(s1 + " is vowel");
        break;
    default:
        System.out.println(s1 + " is not vowel");
	}
	
	
}
}