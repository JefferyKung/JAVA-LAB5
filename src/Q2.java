import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Q2 {
    public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			list.add((int) (Math.random()*50));
		}

		
		List<Integer> list2 = new ArrayList<Integer>(list);
		System.out.println(list2);
		
		list.add(0, list.get(0)-5);
		list.remove(1);
		System.out.println(list);
		
	}
}
