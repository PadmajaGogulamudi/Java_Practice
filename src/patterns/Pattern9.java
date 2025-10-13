package patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(ch++);
			}
			for(int k=i+1;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
