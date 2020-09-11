import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your character: ");
		int input  = sc.next().charAt(0);
		int inputCharacter = Character.toLowerCase(input);
		switch(inputCharacter){
			case 'a':
				System.out.println("Input character is Vowel");
				break;
			case 'e':
				System.out.println("Input character is Vowel");
				break;
			case 'i':
				System.out.println("Input character is Vowel");
				break;
			case 'o':
				System.out.println("Input character is Vowel");
				break;
			case 'u':
				System.out.println("Input character is Vowel");
				break;
			default:
				System.out.println("Input character is consonant");
			
			
		}
		
	}

}
