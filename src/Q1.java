import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			list.add((int) (Math.random()*50));
		}
		System.out.println(list);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type in a number within 50:");
		int a = scanner.nextInt();
		
		if(list.contains(a) == true) {
			System.out.println("Bingo! the number is in the list.");
		}else {
			System.out.println("BoooBoooo ! the number is not in the list.");
		}
		
		
	}
}
