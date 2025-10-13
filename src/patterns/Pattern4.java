package patterns;

public class Pattern4 {

	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			for(int k=0;k<(5/2)-i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=(5/2)-i;j<=(5/2)+i;j++) {
//				System.out.print(i+1);
//			}
//			System.out.println();
//		}
		
		int i,j,k,start=1,space=4;
		for(i=1;i<=5;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=start;k++) {
				System.out.print(i);
			}
			start+=2;
			space-=1;
			System.out.println();
		}
		

	}

}
