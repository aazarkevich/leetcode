package ru.leetcode.easy.monotonicArray;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Monotonic {
    public static boolean isMonotonic(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return decreasing(nums);
            } else if (nums[i] < nums[i + 1]) {
                return increase(nums);
            }
        }
        return true;
    }

    public static boolean increase(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean decreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Nested
    class MonotonicTest {
        @Test
        public void case1() {
            assertTrue(isMonotonic(new int[]{1, 2, 2, 3}));
        }

        @Test
        public void case2() {
            assertTrue(isMonotonic(new int[]{6, 5, 4, 4}));
        }

        @Test
        public void case3() {
            assertFalse(isMonotonic(new int[]{1, 3, 3, 2}));
        }
    }
}
