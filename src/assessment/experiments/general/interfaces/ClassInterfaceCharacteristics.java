package assessment.experiments.general.interfaces;

public class ClassInterfaceCharacteristics implements InterfaceCharacteristics{

	/**
	 *  This field should be implemented for any class implementing the Serializable interface
	 */
	private static final long serialVersionUID = 1L;

	public void sayYourName() {
		// The variable myName in the interface, as it is static, can be accessed naming the interface		
		System.out.println("My name accessing the variable thru the name of the interface is: " + InterfaceCharacteristics.myName);	
		
		// The variable myName in the interface, as it is static, can be accessed directly without
		// naming the interface
		System.out.println("My name accesing diretly the variable is: " + myName);
		
		//myName = "Carlos"; -- This won't work as the field in the interface is implicitly final
	}
	
	public void sayHello() {
		System.out.println("Hello!");
		sayYourName();
	}
	
	/*
	 * This is a method that need to be implemented for any class implementing the runnable interface
	 * 
	 */
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main (String args[]) {
		ClassInterfaceCharacteristics cic = new ClassInterfaceCharacteristics();
		cic.sayHello();
		
	}

	
	

}
