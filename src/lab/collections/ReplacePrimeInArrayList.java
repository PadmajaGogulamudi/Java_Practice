package lab.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class ReplacePrimeInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,4,56,2,8,13));
		Iterator<Integer> itr= al.iterator();
//		for(int i=0;i<al.size();i++)  {
//			int n=(Integer) itr.next();
//			if(isPrime(n)) {
//				itr.remove();//[1, 0, 56, 8, 0]
//				al.set(i,0);
//			}
//		}
		for(int i=0;i<al.size();i++) {
			if(isPrime(al.get(i))) {//[1, 0, 4, 56, 0, 8, 0]
				al.set(i,0);
				
				
			}
		}
		System.out.println(al);
//		for(Integer i:al) {
//			sysout
//		}
		
		
		

	}
	public static boolean isPrime(Integer n) {
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
