package com.collections.ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostRepeated_Int_In_List {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2,1,2,3,1,1,5,6));
		System.out.println(mostRepeated(list));

	}

	private static Integer mostRepeated(List<Integer> list) {
		int maxEle=0;
		int counting=0;
		
		
		boolean[] visited=new boolean[list.size()];
		for(int i=0;i<list.size();i++) {
			if(visited[i])
				continue;
			int count=0;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					count++;
					visited[j]=true;
				}
			}
			if(count>counting) {
				counting=count;
				maxEle=list.get(i);
			}
			
		}
		
		
		
		return maxEle;
	}

}
