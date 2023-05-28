package assessment.experiments.terminal.test1;

import java.util.function.Predicate;

public class Filter {
	
	public static Predicate<String> nameStartingWithPrefix(String prefix){
		
		/**
		 * Remember that Predicate is a functional interface with the following type parameters:
		 * 
		 * Type Parameters:
		 * 	T - the type of the input to the predicate
		 * 
		 * This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
		 * @FunctionalInterface
		 * public interface Predicate<T>
		 * Represents a predicate (boolean-valued function) of one argument.
		 * This is a functional interface whose functional method is test(Object).
		 */
		
		Predicate<String> p = (String name) -> {
			
			boolean nombreIniciaConPrefijo = false;
			
			if(name.startsWith(prefix)) {
				nombreIniciaConPrefijo = true;
			}
			
			return nombreIniciaConPrefijo;
		};
		
		
		return p;
		
		
	}

}
