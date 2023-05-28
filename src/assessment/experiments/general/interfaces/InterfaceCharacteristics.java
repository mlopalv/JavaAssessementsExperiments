package assessment.experiments.general.interfaces;

import java.io.Serializable;

public interface InterfaceCharacteristics extends Serializable, Runnable /** An interface can extend other interfaces**/{
	
	//This field is implicitly final and can't be changed
	String myName = "John Doe";
	
	//An interface can't have a modifier of private. All methods are public.
	//private abstract void sayYourName(String name); -- Won't work
	public abstract void sayYourName();
	
	//An interface can't have a modifier of protected. All methods are public.
	//protected abstract void sayHello(); //-- Won't work
	//public abstract void sayHello();
	
	private void baz() {
		System.out.println();
		
	}
	
}
