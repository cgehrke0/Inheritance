package inheritance;

public class Pet {
	private String name;
	
	public String speak() {
		return "I'm your cuddly little pet.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Pet() {
		setName("Unknown Pet");
	}

}
