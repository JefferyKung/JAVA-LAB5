package Q3;
import car;

public class Toyota extends car {

	public Toyota() {
		super("Japan", "RAV4", 2000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Toyota [getMake()=" + getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear()
				+  "]";
	}
   
	

	}

