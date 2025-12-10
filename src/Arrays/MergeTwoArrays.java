package Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a1 = { 1, 3, 5 };
		int[] a2 = { 2, 4, 6 };
		int[] a3=new int[a1.length+a2.length];
//		int x=0;
//		for(int i=0;i<a1.length;i++) {
//			a3[x++]=a1[i];
//			
//		}
//		for(int i=0;i<a2.length;i++) {
//			a3[x++]=a2[i];
//			
//		}
//		
//		for(int i=0;i<a3.length-1;i++) {
//			for(int j=i+1;j<a3.length;j++) {
//				if(a3[j]<a3[i]) {
//					a3[i]=a3[i]+a3[j]-(a3[j]=a3[i]);
//				}
//			}
//		}
		
		int i = 0, j = 0, k = 0;

        // Merge like merge step of merge-sort
        while (i < a1.length && j < a2.length) {
            a3[k++] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
        }

		for(int z:a3) {
			System.out.print(z+" ");
		}
		

	}

}
