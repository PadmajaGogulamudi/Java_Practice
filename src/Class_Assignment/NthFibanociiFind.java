package Class_Assignment;

public class NthFibanociiFind {

	public static void main(String[] args) {
System.out.println(getFib(1));
	}

	private static int  getFib(int i) {
		int count=1;
		int a1=1;
		int a2=1;
		int sum=0;
		while(count<i) {
			sum=a1+a2;
			a2=a1;
			a1=sum;
			count++;
		}
		if((i==1)||(i==2))
			return 1;
		return a2;
	}

}
