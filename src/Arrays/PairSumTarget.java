package Arrays;

public class PairSumTarget {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7,5 };
		
		getPairs(arr, 7);

	}



	private static void getPairs(int[] arr, int target) {
		String s1 = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] + arr[i] == target) {
					String s = "(" + arr[i] + "," + arr[j] + ")";
					if (!(s1.contains(s))) {
						s1+=s;
						System.out.println("(" + arr[i] + "," + arr[j] + ")");
					}
				}
			}
		}

	}

}
//a+b=c
//a=c-b