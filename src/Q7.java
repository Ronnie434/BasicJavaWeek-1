import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your character: ");
		int input  = sc.nextInt();
		char input1 = sc.next().charAt(0);
		switch(input){
			case 1:
				switch(input1){
					case 'F':
						System.out.println("In fairfax cinemax currently running movie : thor");
						break;
					case 'G':
						System.out.println("In fairfax cinemax currently running movie : Avenger");
						break;
				}
				break;
			case 2:
				switch(input1){
				case 'F':
					System.out.println("In LotField cinemax currently running movie : Goolmal");
					break;
				case 'G':
					System.out.println("In LotField cinemax currently running movie : Harry potter");
					break;
			}
				break;
		
			default:
				System.out.println("Invalid input");
			
			
		}

	}

}
