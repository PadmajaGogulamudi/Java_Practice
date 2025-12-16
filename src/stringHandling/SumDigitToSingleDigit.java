package stringHandling;

public class SumDigitToSingleDigit {

	public static void main(String[] args) {
		int n=987;
		int r=0;
		int sum=0;
		while(true) {
			sum=sumDig(n);
			if(sum/10==0) {
				break;
			}
			n=sum;
		}
		System.out.println(sum);
	}

	private static int sumDig(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}
