package collections.ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//sir class
public class Demo1 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("java");
		l.add("Python");
		l.add("C#");
		System.out.println(l);
		System.out.println("**************************");

		l.add(1, "paddu");
		System.out.println(l);

		System.out.println("**************************");
		l.set(0, "subbu");
		System.out.println(l);

		System.out.println("**************************");
		l.remove("Python");
		System.out.println(l);

		System.out.println("**************************");
		System.out.println("contains C# : " + l.contains("C#"));

		System.out.println("**************************");
		Collections.sort(l);
		System.out.println("Assending sorted order : " + l);
		System.out.println("**************************");
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("Reverse sorted order : " + l);
		System.out.println("**************************");

		List<String> sub = l.subList(1, 3);
		System.out.println("sub : " + sub);
		sub.add(2,"subStr");
		System.out.println("sub : "+sub+"\norig: "+l);

		System.out.println("**************************");

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println("**************************");

		System.out.println(list.remove(list.indexOf(3)));
		System.out.println(list);
		System.out.println("**************************");
		System.out.println("max : "+Collections.max(list));
		System.out.println("**************************");

		//Exception in thread "main" java.lang.UnsupportedOperationException
		List<Integer> arr=Arrays.asList(1,2,30);
		arr.set(2,40);
		//Exception in thread "main" java.lang.UnsupportedOperationException
//		List<Integer> arr=List.of(1,2,30);
//		arr.add(40);
		System.out.println("arr : "+arr);
		System.out.println("**************************");
		String j=String.join(",", l);
		System.out.println(j);
		System.out.println("**************************");
//	List<Integer> l2=new ArrayList<>(List.of(1,2,3));
//	List<Integer> l3=new ArrayList<>(List.of(4,5,6));
//	IndexOutOfBoundsException
//	l2.addAll(4,l3);
//	System.out.println(l2);



	}

}
