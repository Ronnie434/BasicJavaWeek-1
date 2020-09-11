import java.util.Scanner;
//Q4.Calculate tips for the check(eg . Java TipCalculator < check amoiunt > <%tips>)
public class Q4 {

	public static void main(String[] args) {
		int tipPercentage; // must be Integer (whole number) 
		double billAmount, tipAmount, totalAmount;
		
		Scanner scan = new Scanner(System.in); 		
		System.out.println("Enter Bill Amount"); 
		billAmount = scan.nextDouble(); 
		
		System.out.println("Percentage You Want To Tip"); 
		tipPercentage = scan.nextInt();  
	
		tipAmount = (billAmount * tipPercentage) / 100; 
		totalAmount = billAmount + tipAmount; 
		System.out.println("Tip Amount " + tipAmount);
		System.out.println("Total including Tip " + totalAmount);

	}

}
