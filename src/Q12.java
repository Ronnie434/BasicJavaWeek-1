import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the command keyword to exit a loop in Java? ");
		System.out.println("a. quit");
		System.out.println("b. continue");
		System.out.println("c. break");
		System.out.println("d. exit");
		do {
			System.out.println("Enter your choice: ");
			char input = sc.next().charAt(0);
			if(input == 'C' || input == 'c' ) {
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
