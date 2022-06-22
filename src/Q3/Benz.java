package Q3;

public class Benz extends car {
	
	public Benz() {
		super("Germany", "C300", 2010);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Benz [getMake()=" + getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear()
				+ "]";
	}
	
	
}
