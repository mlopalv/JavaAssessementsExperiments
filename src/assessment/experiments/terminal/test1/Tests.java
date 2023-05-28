package assessment.experiments.terminal.test1;

import java.util.stream.Stream;

public class Tests {
	
	int add(int i, int j) {
		
		return i+j;
	}
	
	
	public static void main(String args[]) {
		
		B b = new B();
		/*This short is sent to a method that is waiting for an integer. Why it works?*/
		short a = 9;
		Tests t = new Tests();
		
		System.out.println(t.add(a,9));		
		
		if(b instanceof B) {
			
			
		}
		
		if(b instanceof A) {
			System.out.println("Instance of A");
		}
		
		String[] words = {"aafrancia","aaitalia","ooromania","eeperu","aacanada","eealemania","zzrusia","zzchina"};
		/**
		 * - The custom created class Filter has Predicate method that filters by the prefix
		 * - The custom created class Mapper has a Function method that maps names to the amount of characters
		 * - Characters count is a custom created class that has an overloaded method of print that takes the value
		 * 		of the word and the amount of different character assigned to it
		 * 
		 */
		Stream.of(words)
			.filter(Filter.nameStartingWithPrefix("aa"))
			.map(Mapper.getDistinctCharactersCount())
			.forEach(System.out::println);
		
		System.out.println("Executing just the predicate: "+Filter.nameStartingWithPrefix("zz"));
		
		//.filter(factura -> factura.getImporte() > 300)
		
		
	}

}
