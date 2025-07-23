package lab;

import java.util.Scanner;

public class DatatypeDemo3 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("enter n value : ");
		int n=c.nextInt();
		
		int count=0;
		while(n>100) {
			n=n-100;
			count+=1;
		}
		System.out.println("number of 100's : "+count);
		System.out.println("remaining : "+n);
		/*int m=590;
		int k=m/100;
		int l=m%100;
		System.out.println(k+"\n"+l);*/
	
			
		

	}

}
