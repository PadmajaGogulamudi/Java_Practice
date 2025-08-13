package LogicalStatements;

//12-8-2025
////A composite number whose sum of digits equals the sum of digits of its prime factors.
//(Example: 666 → sum(6+6+6)=18, prime factors: 2,3,3,37 → sum(2+3+3+(3+7))=18)
public class SmithNumber1 {

	public static void main(String[] args) {
		
		int n = 666;
		
		if (digitSum(n) == findPrimeFactorsDigitSum(n))
			System.out.println("yess !!!");
		else
			System.out.println("No !!!!");

	}

	private static int findPrimeFactorsDigitSum(int n) {
		int sum=0;
		
		
		for(int i=2;i<=n;i++) {
			if(n%i==0 && isPrime(i)) {
			
				
				sum+=digitSum(i);
			}
		}
		
		
		
		return sum;

	}

	private static boolean isPrime( int i) {
		int status=0;
		for(int j=1;j<=i;j++){
			if(i%j==0) {
				status++ ;
			}
		}
		if(status<=2)
			return true;
		else
			return false;
	}

	private static int digitSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
