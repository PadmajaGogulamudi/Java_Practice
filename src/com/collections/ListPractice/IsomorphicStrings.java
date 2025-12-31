package com.collections.ListPractice;

import java.util.Arrays;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String original = "aabca";
		String replicate = "bbcdb";
		char[] ori = original.toCharArray();
		char[] re = replicate.toCharArray();
		int[] orFreq = isIsomorphic(ori);
		int[] reFreq = isIsomorphic(re);
		if (Arrays.equals(orFreq, reFreq)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	private static int[] isIsomorphic(char[] s) {
		int[] freq = new int[s.length];
		boolean[] visited = new boolean[s.length];
		for (int i = 0; i < s.length; i++) {
			if(visited[i])
				continue;
			int count=0;
			for(int j=0;j<s.length;j++) {
				if(s[i]==s[j]) {
					count++;
					visited[j]=true;
				}
			}
			freq[i]=count;

		}
		//System.out.println(Arrays.toString(freq));
		return freq;
	}

}
