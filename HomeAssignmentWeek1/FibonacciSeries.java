package HomeAssignmentWeek1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		
		for (int i = 0; i < 8; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
			
		}
	}

}
