import java.util.Scanner;
// Q10 Write a program to input indefinite numbers and then calculate the sum of only the positive numbers. The program terminates when negative numbers is input

public class Q10 {

	public static void main(String[] args) {
		int num,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbers(Negative Number to Quit) : ");
        while(true)
               {
                       num=input.nextInt(); //Read number
                       if(num<0)
                       break;
                       sum +=num;
               }
                       System.out.println( "Sum is : " +sum);
      }
}
