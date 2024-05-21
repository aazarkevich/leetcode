package ru.leetcode.leetCode75.ContainerWithMostWater;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left < right) {
            int i = Math.min(height[left], height[right]) * (right - left);
            if (result < i) result = i;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    @Nested
    public class ContainerWithMostWaterTest {
        @Test
        public void case1() {
            assertEquals(49, maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        }

        @Test
        public void case2() {
            assertEquals(1, maxArea(new int[]{1, 1}));
        }

        @Test
        public void case3() {
            assertEquals(16, maxArea(new int[]{4, 3, 2, 1, 4}));
        }

        @Test
        public void case4() {
            assertEquals(2, maxArea(new int[]{1, 2, 1}));
        }
    }
}
