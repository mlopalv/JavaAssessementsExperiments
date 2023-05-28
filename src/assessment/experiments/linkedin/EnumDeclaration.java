package assessment.experiments.linkedin;

public class EnumDeclaration {
	
	//This is a wrong way to declare the enum
	//enum Cats {"Michin", "Carlos", "Gato con botas"};
	
	//This is the rigth way to declare the enum
	enum Cat {	
		MICHIN ("Mestizo", 3), 
		CARLOS ("Angora", 6),
		GATOCONBOTAS ("Moon cat", 8),
		MECENAS ("Tigrillo", 2),
		BOTAS ("Persa", 10);
		
		private final String raza;   // in kilograms
	    private final int anos; // in meters
	    
	    Cat(String raza, int anos) {
	        this.raza = raza;
	        this.anos = anos;
	    }
	    
	    private String raza() { return raza; }
	    private int age() { return anos; }
	};
	
	public static void main(String args[]) {
		
		
		System.out.println(EnumDeclaration.Cat.MICHIN);
		
		Cat catName = Cat.GATOCONBOTAS;
		
		if(catName.equals(Cat.GATOCONBOTAS)) {
			System.out.println(EnumDeclaration.Cat.GATOCONBOTAS);
			
		}
		
		/*iterate within a for loop*/
		for(Cat cat: Cat.values()) {
			System.out.println("//*********************************************************//");
			System.out.println("This is the name of the planet with a for iteration loop -> " + cat);
			System.out.println("Pedigree of this car -> " + cat.raza());
			System.out.println("Age of this cat -> " + cat.age());
			
		}
		
		
	}
	
	
	
}

