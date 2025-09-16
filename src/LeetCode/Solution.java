package LeetCode;

public class Solution {
	public static int maxFreqSum(String s) {
		char[] str = s.toCharArray();
		int n=0;
		int sum=0;
		for(char c:str) {
			if("aeiou".indexOf(c)!=-1)
				n++;
		}
		//String.valueOf(for_vowels).indexOf(str[i])==-1 &&
		char[] for_vowels=new char[n];
		char[] for_const=new char[str.length-n];
		int k=0;
		int m=0;
		for(int i=0;i<str.length;i++) {
			if( "aeiou".indexOf(str[i])!=-1 ){
				for_vowels[k++]=str[i];
						
			}else
				for_const[m++]=str[i];
				
		}
//		System.out.println(for_vowels);
//		System.out.println(for_const);
		int V_max=0;
		for(int i=0;i<n-1;i++) {
			int count=1;
			String temp=String.valueOf(for_vowels[i]);
			for(int j=i+1;j<n;j++) {
			if(temp.equals(String.valueOf(for_vowels[j]))) {
				
				count++;
				if(count>V_max) {
					i++;
				}
				
			}
			}
			
			
		}
		
		return sum;
		

	}
	public static void main(String[] args) {
		System.out.println(maxFreqSum("successes"));
	}
}
