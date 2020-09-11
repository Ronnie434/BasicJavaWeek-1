import java.util.Scanner;
//Q16.Write a Java program that allows the user to choose the correct answer of a question.
public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the correct way to declare a variable to store an integer value in\r\n" + 
				" Java?");
		System.out.println("a. int 1x=10;");
		System.out.println("b. int x=10;");
		System.out.println("c. float x=10.0f;");
		System.out.println("d. string x=\"10\";");
		do {
			System.out.println("Enter your choice: ");
			char input = sc.next().charAt(0);
			if(input == 'B' || input == 'b' ) {
				System.out.println("Congratulation!");
				break;
			}
			else{
				System.out.println("Incorrect!");
				System.out.println("Again? press y to continue:y ");
				int y = sc.next().charAt(0);
				if(y == 'Y' || y == 'y') {
					continue;
				}else {
					break;
				}
			}
		
		}while(true);
	}
}
