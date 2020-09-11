import java.util.Scanner;
//Q5.Take a year as input and Print the year is leap year or not a leap year using Nested-if else statement
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.println("The year "+ year+ " is leap year");
				}
				else {
					System.out.println("The year "+ year+ " is not leap year");
				}
			}
			else {
				System.out.println("The year "+ year+ " is leap year");
			}
		}
		else {
			System.out.println("The year "+ year+ " is not leap year");
			
		}
	}

}
