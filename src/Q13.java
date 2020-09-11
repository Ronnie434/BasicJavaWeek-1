import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
	    String input  = sc.nextLine();
	    input = input.replaceAll("\\s", ""); 
	    System.out.println(input); 
	}

}
