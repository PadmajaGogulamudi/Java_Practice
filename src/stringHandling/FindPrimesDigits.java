package stringHandling;

public class FindPrimesDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String n="131715";
//		int m=n.length();
//		for(int i=0;i<m-1;i++) {
//			for(int j=i+1;j<m;j++) {
//				String s=n.substring(i,j);
//				if(isPrime(s)) {
//					System.out.print(s+" ");
//				}
//			}
//			
//			
//		}
		
		int num=131715;
		while(num>0) {
			int div=10;
			int temp=num;
			while(temp>0) {
				int rem=num%div;
				if(isPrime(rem)) {
					System.out.print(rem+" ");
				}
				div*=10;
				temp/=10;
			}
			num/=10;
		}

	}

	private static boolean isPrime(int n) {
		
		if(n==1)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		
		return true;
	}

}
