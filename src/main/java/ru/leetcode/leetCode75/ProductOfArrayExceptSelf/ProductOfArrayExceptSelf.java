package ru.leetcode.leetCode75.ProductOfArrayExceptSelf;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }

    @Nested
    public class ProductOfArrayExceptSelfTest {
        @Test
        public void case1() {
            assertArrayEquals(productExceptSelf(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6});
        }

        @Test
        public void case2() {
            assertArrayEquals(productExceptSelf(new int[]{-1, 1, 0, -3, 3}), new int[]{0, 0, 9, 0, 0});
        }

        @Test
        public void case3() {
            assertArrayEquals(productExceptSelf(new int[]{0, 0}), new int[]{0, 0});
        }
    }
}
