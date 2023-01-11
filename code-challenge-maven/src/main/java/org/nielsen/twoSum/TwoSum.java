package org.nielsen.twoSum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static int[] run(List<Integer> nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {

            int complement = target - nums.get(i);
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums.get(i), i);
            }
        }
        return new int[] {};

    }
}
