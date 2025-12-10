package stringHandling;

public class SwapTwoNumsWithOut3Var {

	public static void main(String[] args) {
		int a=2;
		int b=9;
		a=a+b-(b=a);
		System.out.println(a+" "+b);
	}

}
