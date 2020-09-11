import java.util.Scanner;
//Q13.Write a program to remove White Spaces from string in Java? ”Enter input string to be cleaned from white spaces...!” INPUT :OneSpace TwoSpaces ThreeSpaces FourSpaces Tab End
public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
	    String input  = sc.nextLine();
	    input = input.replaceAll("\\s", ""); 
	    System.out.println(input); 
	}

}
