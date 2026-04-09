package LeetCode;

//i/p=PAYPALISHIRING,n=3
//o/p=PAHNAPLSIIGYIR
//P A H N
//APLSIIG
//Y I R

public class ZigZagPattern {

	public static void main(String[] args) {
		char[] s = "PAYPALISHIRING".toCharArray();
		int n = 3;
//		String res = "";
//		int len = s.length;
//		int a = 0;
//		boolean flag = true;
//
//		char[][] chars = new char[n][(len / n)*2+(len / n) ];
//		int i = 0;
//		int j = 0;
//		boolean f=true;
//		while (true) {
//			if (i == n ) {
//				i--;
//				flag = false;
//			} else if ((i == 0)&& !f){
//				i++;
//				flag = true;
//			}
//			if (flag) {
//				f=false;
//				chars[i++][j] = s[a++];
//			}
//			if (!flag) {
//				chars[--i][++j] = s[a++];
//			}
//			if (a == len )
//				break;
//		}
//
//		for (char[] c1 : chars) {
//			for (char c : c1) {
//				if (c!='\u0000')
//					res += c;
//			}
//		}
//		System.out.println(res);
		int a=0;
		StringBuilder[] arr=new StringBuilder[n];
		while(a<=s.length) {
			for(int i=0;i<n;i++) {
				arr[i]=arr[i]+
			}
			
		}
		
	}

}
