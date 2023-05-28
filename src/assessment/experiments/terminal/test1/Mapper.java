package assessment.experiments.terminal.test1;

import java.util.HashSet;
import java.util.function.Function;

public class Mapper {
	
	public static Function<String, CharactersCount> getDistinctCharactersCount(){
		
		/*This function will find the different characters in a String
		 * It should be recalled that the interface Function<T,R> has the following type 
		 * parameters:
		 * Type Parameters:
		 *     T - the type of the input to the function
		 *     R - the type of the result of the function
		 * 
		 * That's why this Function is String, and CharacterCount
		 * 
		 * The interface Function is a functional interface whose functional method is apply(Object).
		 * 
		 * 
		 * */
		Function<String, CharactersCount> f = (String word) -> {
			
			char wordAsCharArray[] = word.toCharArray();
			
			HashSet<String> differentLettersInWord = new HashSet<String>();
			CharactersCount characterCountForWord = null;
			Integer characterCount = null;
			
			for(int k=0; k < wordAsCharArray.length; k++) 
				differentLettersInWord.add(""+wordAsCharArray[k]);
			
			characterCount = differentLettersInWord.size();
			
			characterCountForWord = new CharactersCount(word, characterCount);
			
			return characterCountForWord;
			
		};
		
		return f;
	}
	
	

}
