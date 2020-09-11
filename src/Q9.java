import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rows You Want to Print ? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) 
        { 
            for (int j=n-i; j>1; j--) 
            { 
                System.out.print(" "); 
            } 
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print((i+1) + " "); 
            } 
            System.out.println(); 
        } 

	}

}
