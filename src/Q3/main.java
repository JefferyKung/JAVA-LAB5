package Q3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import car;

import Q3.Lexus;

public class main {
    public static void main(String[] args) {
    	
    	car lexus = new Lexus();
    	System.out.println(lexus.getYear());

    	car toyota = new Toyota();
    	System.out.println(toyota.getYear());
    	
    	car benz = new Benz();
    	System.out.println(benz.getYear());
    	
    	ArrayList<car> carList = new ArrayList<car>();
    	carList.add(lexus);
    	carList.add(toyota);
    	carList.add(benz);
    	
    	System.out.println(carList);
    	
//    	---------------------

    	Collections.sort(carList, new YearSort());
    	System.out.println(carList);
    	
    }
}


class YearSort implements Comparator<car>{
	
	public int compare(car a,car b) {
		return a.getYear() - b.getYear();
	}
}