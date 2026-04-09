package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class HarshaPro {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };
		int t = 12;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			List<Integer> list = new ArrayList<>();
			for (int j = i; j < arr.length; j++) {

				if (count > t) {

					continue;
				} else if (count == t) {

					System.out.println(list);

				} else {
					count += arr[j];
					list.add(arr[j]);
				}

			}
		}

	}

}
