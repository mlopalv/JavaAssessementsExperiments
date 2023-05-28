package assessment.experiments.terminal.test1;

public class CharactersCount {
	
	private String name;
	private Integer charactersCount;
	
	public CharactersCount (String name, Integer charactersCount) {
		this.setName(name);
		this.charactersCount = charactersCount;
	}
	
	@Override
	public String toString() {
		
		return "La palabra o nombre "+this.name+" tiene un total de caracateres de: "+this.charactersCount;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
