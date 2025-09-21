package HomeAssignmentWeek1;

public class IsPrime {

	public static void main(String[] args) {
		int a=23;
		boolean IsPrime= true;
		
			for (int i = 2; i < a; i++) {
				if (a% i == 0) {
					IsPrime=false;
					break;
				}
				if (IsPrime==true) {
					System.out.println("The Number is a Prime Number");
				
				}
				else {
						System.out.println("The Number is not a Prime Number");
				}
			}	
	

}
}