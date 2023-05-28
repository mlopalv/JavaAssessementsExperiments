package assessment.experiments.talently.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generalidades extends A {

	
	public void foo() {
		String s= "System";
		System.out.println(s);
	}
	
	
	public static void main(String args[]) {
		
		System.out.println("Iniciando prueba Talently");
		//String s = new StringBuilder("Talently");
		Integer[] ints = {1,2,3,4};
		
		ArrayList list = new ArrayList(Arrays.asList(ints));
		list.set(1, 5);
		System.out.println(list);
		//list.lastIndexOf(list);
		//System.out.println(ints.lastIndexOf(5));
		Generalidades gen = new Generalidades();
		gen.foo();
		
		/*try {
			throw new A();
		}
		
		catch(A t) {
			System.out.println("A");
		}finally {
			
			System.out.println("B");
			
		}		
		
		
		try {
			int a[] = {1,2,3,4};
			for (int i = 1; i <= 4; i++) {
				
				System.out.println(a[i]);
			}
			
		}catch(Exception e) {
			System.out.println("error = " + e);			
		}*/
		
		//Arrays.asList(null);
		
	}


	
}
