package assessment.experiments.general.functionalinterfaces;

public class TestStringFunctionInterface {

	
	public static void main(String args[]) {
		
		 /*
	     * To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type. 
	     * Calling the interface's method will run the lambda expression: 
	     */
	    System.out.println("");
	    System.out.println("<<---- Testing lambdas used in a method when the interface has one single method ---->>:");
	    
	    //String function is the interface with the single method (This is what is called a Functional Interface)
	    //we can equal "exclaim" and "ask" to the lambda function because the interpreter looks for its type to be an interface
	    StringFunctionInterface exclaim = (String s) -> s + "!";
	    StringFunctionInterface ask = (String s) -> s + "?";
	    
	    //Then we can call the static method TestLambdas to execute the 
	    System.out.println(exclaim.run("Hello"));
	    System.out.println(ask.run("Hello"));
	    
		//Now let's invoke one of the default methods of the interface (sayHello())
	    System.out.println(StringFunctionInterface.sayHello());
	    System.out.println(StringFunctionInterface.sayHelloSpanish());
		
	}
	
}
