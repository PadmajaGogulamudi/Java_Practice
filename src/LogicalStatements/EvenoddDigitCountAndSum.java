package LogicalStatements;

import java.util.Scanner;

public class EvenoddDigitCountAndSum {
	static int OddDigitSum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr A value : ");
		int n = sc.nextInt();
		
		int count=0;
		
		for(;n!=0;) {
			int j=n%10;//1234==== 4
			if(j%2==0) {
				count++;
			}else {
				OddDigitSum+=j;
			}
			n/=10;//1234  ==== 123
		}
		System.out.println("even digit count : "+count+"\nSum of Odd digits : "+OddDigitSum);
		
		
		
	}

}
