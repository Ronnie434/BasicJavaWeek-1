
public class Q11 {

	public static void main(String[] args) {
		for(int i =0; i<=4000; i++) {
			if(i%4 == 0) {
				if(i%100 == 0) {
					if(i%400 == 0) {
						continue;
					}
					else {
						System.out.println(i);
					}
				}
				else {
					continue;
				}
			}
			else {
				System.out.println(i);	
			}
		}

	}

}
