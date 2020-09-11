//Q3 Write a Fibonoci’s series program as 0 11 2 3 5 8...n numbers and run in the command prompt
public class Q3 {

	public static void main(String[] args) {
		 int n = 10, t1 = 0, t2 = 1;
	        System.out.print("First " + n + " terms: ");
	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1 + " + ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	}

}
