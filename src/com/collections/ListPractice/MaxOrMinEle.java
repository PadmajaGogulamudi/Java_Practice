package com.collections.ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Find the maximum and minimum elements in an ArrayList<Integer>.
public class MaxOrMinEle {

	public static void main(String[] args) {
		int min=0;
		int max=0;
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, -5, 15, 7, 8, 9));
		if(l1.size()>0) {
		 min = l1.get(l1.size()-1);
		 max = l1.get(l1.size()-1);
//		for(Integer i:l1) {
//			if(i<min)
//				min=i;
//			else if(i>max)
//				max=i;
//			
//		}
		Iterator<Integer> itr=l1.iterator();
		while(itr.hasNext()) {
			int x=itr.next();
			
			min=(x<min)?x:min;
			max=(x>max)?x:max;
		}
		}
		System.out.println("min : "+min+"\nmax : "+max);
		

	}

}
