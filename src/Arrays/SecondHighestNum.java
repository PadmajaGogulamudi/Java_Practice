package Arrays;

public class SecondHighestNum {

	public static void main(String[] args) {
		int[] arr = {  };
		

		if (arr.length != 0) {
			int fh = arr[0];
			int sh = arr[1];
			int temp = 0;
			if (fh < sh) {
				temp = sh;
				sh = fh;
				fh = temp;
			}
			for (int i = 2; i < arr.length; i++) {
				if (arr[i] > fh) {
					sh = fh;
					fh = arr[i];
				} else if (arr[i] > sh && arr[i] != fh) {
					sh = arr[i];
				}
			}
			System.out.println(sh);
		}else
			System.out.println("the given array is empty");

	}

}
