package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSubArrays_whoes_sum_equ_target_HashMap_PrefixSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 0, 1, 2, 0, 3};
        int target = 3;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - target)) {
                count += map.get(sum - target);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Count is : " + count);
    }
}
