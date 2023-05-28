package assessment.experiments.linkedin;
/**
 * This is a simple example of a case without a break. This proves that
 * when a break is not implemented the other options activates
 * 
 * @author MAURICIO
 *
 */

public class CaseWithoutBreak {

	public static void main(String args[]) {
		
		int myIntValue = 1;
		
		switch(myIntValue) {
		
			case (1):
				System.out.println("My int value is 1 " + myIntValue);
			case (2):
				System.out.println("My int value is 2 " + myIntValue);
			//break;
			case (3):
				System.out.println("My int value is 3 " + myIntValue);
			//break;
			default:
				System.out.println("This is the default option.");		
		
		
		}
		
		
	}
	
	
}
