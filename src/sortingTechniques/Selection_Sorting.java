package sortingTechniques;

public class Selection_Sorting {

	public static void main(String[] args) {
		int[] arr=new int[] {23,56,12,56,70,10};
		sortArr(arr,arr.length);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static  void sortArr(int[] arr,int n) {
		for(int i=0;i<n-1;i++) {
			int temp=0;
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					temp=arr[min];
					arr[min]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
