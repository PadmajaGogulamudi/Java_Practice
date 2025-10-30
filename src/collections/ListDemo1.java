package collections;
import java.util.ArrayList;
import java.util.List;
public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<>();
		l1.add(40);
		l1.add(2);
		l1.add(3);//2
		//System.out.print(l1.indexOf(3));
		System.out.println(l1.remove(Integer.valueOf(3)));
		//System.out.println(l1.remove(2));
		System.out.println(l1);
		String s="java";
		System.out.println(s.substring(0,1));
				

	}

}
