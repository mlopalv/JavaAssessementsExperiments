package assessment.experiments.general.functionalinterfaces;

/*
 * This is an example interface created to illustrate that when having an interface with a single method
 * the lambda implementation will call this method by default
 * See the lambda implementation in the TestLambdas class.
 * 
 */
@FunctionalInterface
public interface StringFunctionInterface {
	
	public String run(String str);
	
	//public String runTwo(String str); -- This will cause the complier to indicate that StringFunctionInterface 
										//-- is not a FunctionalInterface anymore since it only one abstract method is allowed 
										//-- in a FunctionalInterface
	
	public static String sayHello() {
		return "Hello! This is the sayHello mehtod running for the interface StringFunctionInterface";		
	}
	
	public static String sayHelloSpanish() {
		return "Hola! Este es el método sayHello corriendo para la interface StringFunctionInterface";		
	}
	
	
	
}
