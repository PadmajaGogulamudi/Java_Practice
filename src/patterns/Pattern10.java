package patterns;

public class Pattern10 {

	public static void main(String[] args) {
		int x = 1;
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print(x);
				x = (x == 1) ? 0 : 1;
			}
			
			System.out.println();
		}
	}

}
