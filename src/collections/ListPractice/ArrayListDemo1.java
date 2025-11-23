package collections.ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a program to remove all even numbers from an ArrayList<Integer>.
public class ArrayListDemo1 {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		
		for (int i = 0; i < a1.size(); i++) {
			if ((a1.get(i)) % 2 == 0) {
				a1.remove(i);

			}
			
		}
		System.out.println(a1);

	}

}
