package ru.leetcode.leetCode75.FindPivotIndex;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int i : nums) {
            sum += i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    @Nested
    public class FindPivotIndexTest {
        @Test
        public void case1() {
            assertEquals(3, pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        }

        @Test
        public void case2() {
            assertEquals(-1, pivotIndex(new int[]{1, 2, 3}));
        }

        @Test
        public void case3() {
            assertEquals(0, pivotIndex(new int[]{2, 1, -1}));
        }
    }
}