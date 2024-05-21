package ru.leetcode.leetCode75.MaxNumberOfKSumPairs;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int number = k - num;
            if (map.containsKey(number)) {
                res++;
                if (map.get(number) == 1) {
                    map.remove(number);
                } else {
                    map.put(number, map.get(number) - 1);
                }
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return res;
    }

    @Nested
    public class MaxNumberOfKSumPairsTest {
        @Test
        public void case1() {
            assertEquals(2, maxOperations(new int[]{1, 2, 3, 4}, 5));
        }

        @Test
        public void case2() {
            assertEquals(1, maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        }

        @Test
        public void case3() {
            assertEquals(2, maxOperations(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2));
        }

        @Test
        public void case4() {
            assertEquals(2, maxOperations(new int[]{2, 2, 2, 3, 1, 1, 4, 1}, 4));
        }
    }
}