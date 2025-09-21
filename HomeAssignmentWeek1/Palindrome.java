package HomeAssignmentWeek1;

public class Palindrome {

	public static void main(String[] args) {
		int input=5665;
		int output=0;
		int rem;
		
		for (int i=input; i>0; i=i/10) {
			rem=i%10;
			output = (output*10)+rem;			
		}
		if (input==output) {
			System.out.println("The Number is Palindrome");
		}
		else {
			System.out.println("The Number is not Palindrome");
		}
		
	}

}
