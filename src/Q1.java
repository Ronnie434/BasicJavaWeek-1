import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int input = sc.nextInt();
		String result = (input < 100) ? "Your Number is less than 100":"Your number is greater than 100";
		System.out.println(result);
	}

}
