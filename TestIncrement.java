package Exercise;

public class TestIncrement {

	public static void main(String[] args) {
		int i, iInc; // Deceleration of i and ilnc;
		i = 8; // Assign value to i
		// First Operation
		iInc = i++;
		System.out.println("The result of iInc = " + iInc + " and the value of i = " + i);
		
		
		// Second Operation
		iInc = ++i;
		System.out.println("The result of iInc= " + iInc + " and the value of i = " + i );
	
	}

}
