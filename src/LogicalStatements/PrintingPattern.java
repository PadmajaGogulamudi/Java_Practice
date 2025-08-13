package LogicalStatements;
/* Printing
 * 1  2  3  4  5
 * 10 9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 */

public class PrintingPattern {
/*Myy logic 
	public static void main(String[] args) {
		for (int i = 1; i <=25; i++) {
			System.out.print(i+" ");
			if(i%5==0 ) {
				System.out.print("\n");
				i=reversePrint(i);
			}

		}

	}

	private static int reversePrint(int i) {
		for(int j=i+5;j>i && j<=25;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		return i+5;
		
	}
*/
	
	public static void main(String[] args) {
		int rows=5;
		int col=5;
		int num=1;
		int end=0;
		for(int r=1;r<=rows;r++) {
			if(r%2!=0) {
				
				for(int i=0;i<rows;i++) {
					System.out.print(num++ +" ");
				}
				
			}else {
				end=num+col-1;
				for(int i=end;i>=num;i--) {
					System.out.print(i+" ");

				}
				num=num+col;
			}
			System.out.println();
		}
	}
}
