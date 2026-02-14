package com.GUT;

import java.util.ArrayList;
import java.util.List;

public class Day7_Detect_cycle_exists {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 7, 9, 1 };
		int target = 15;
		List<List<Integer>> lists = new ArrayList<>();
		List<Integer> largeList = new ArrayList<>();
		List<Integer> smallList = new ArrayList<>();
		List<Integer> TlargeList = new ArrayList<>();
		List<Integer> TsmallList = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			TlargeList.clear();
			TsmallList.clear();
			TsmallList.add(arr[i]);
			TlargeList.add(arr[i]);
			int temp = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (temp < target) {

					temp += arr[j];
					if (temp > target) {
						temp -= arr[j];
						continue;
					}
					TlargeList.add(arr[j]);
					TsmallList.add(arr[j]);
					if (temp == target) {
						lists.add(TlargeList);

						if (TlargeList.size() > largeList.size()) {
							largeList.clear();
							largeList.addAll(TlargeList);
						}
						if (smallList.size() == 0) {
							smallList.addAll(TsmallList);
						}
						if (TsmallList.size() < smallList.size()) {
							smallList.clear();
							smallList.addAll(TsmallList);
						}
						break;

					}
				}

			}
		}
		for (Integer i : largeList) {
			System.out.println(i + " ");
		}
		System.out.println("===================");
		for (Integer i : smallList) {
			System.out.println(i + " ");
		}

	}
	// static shift(List<Integer> largeList,List<Integer> largeList)

}
