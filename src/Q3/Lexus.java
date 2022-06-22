package Q3;
import car;

public class Lexus extends car {
  
	public Lexus() {
		super("Germany", "M5", 2022);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lexus [getMake()=" + getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear()
				+  "]";
	}


	


	
}
