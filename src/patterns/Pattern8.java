package patterns;

public class Pattern8 {

	public static void main(String[] args) {
//		*     *
//		 *   * 
//		  * *  
//		   hello   
//		  * *  
//		 *   * 
//		*     *
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(i==j && j==3) {
					System.out.print("hello");
					
				}else if(j==i || j==6-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
