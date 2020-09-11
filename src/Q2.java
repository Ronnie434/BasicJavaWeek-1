import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int input = sc.nextInt();
		if(input < 200 && input%2 == 0) {
			System.out.println("Your number " + input + " is less than 200 and Even number" );
		} else {
			System.out.println("Your number is invalid");
		}

	}

}
