import java.util.Scanner;
//Q15 Write a Java program to detect key presses.If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise, program will show "Not allowed".
public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int input  = sc.nextInt();
		switch(input) {
			case 0:
				System.out.println("You Pressed " + input);
				break;
			case 1:
				System.out.println("You Pressed "+ input);
				break;
			case 2:
				System.out.println("You Pressed " + input);
				break;
			case 3:
				System.out.println("You Pressed "+ input);
				break;
			case 4:
				System.out.println("You Pressed "+ input);
				break;
			case 5:
				System.out.println("You Pressed "+ input);
				break;
			case 6:
				System.out.println("You Pressed "+ input);
				break;
			case 7:
				System.out.println("You Pressed "+ input);
				break;
			case 8:
				System.out.println("You Pressed "+ input);
				break;
			case 9:
				System.out.println("You Pressed "+ input);
				break;
			default:
				System.out.println("Not allowed");
		}
	}

}
