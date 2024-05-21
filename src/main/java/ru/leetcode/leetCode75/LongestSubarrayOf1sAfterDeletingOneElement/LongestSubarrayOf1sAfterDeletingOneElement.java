package ru.leetcode.leetCode75.LongestSubarrayOf1sAfterDeletingOneElement;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayOf1sAfterDeletingOneElement {

    public static int longestSubarray(int[] nums) {

        int left = 0, right, k = 1;
        for (right = 0; right < nums.length; right++) {
            // If we included a zero in the window we reduce the value of k.
            // Since k is the maximum zeros allowed in a window.
            if (nums[right] == 0) {
                k--;
            }
            // A negative k denotes we have consumed all allowed flips and window has
            // more than allowed zeros, thus increment left pointer by 1 to keep the window size same.
            if (k < 0) {
                // If the left element to be thrown out is zero we increase k.
                k += 1 - nums[left];
                left++;
            }
        }
        return right - left - 1;
    }

    @Nested
    public class LongestSubarrayOf1sAfterDeletingOneElementTest {
        @Test
        public void case1() {
            assertEquals(3, longestSubarray(new int[]{1, 1, 0, 1}));
        }

        @Test
        public void case2() {
            assertEquals(5, longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
        }

        @Test
        public void case3() {
            assertEquals(2, longestSubarray(new int[]{1, 1, 1}));
        }

        @Test
        public void case4() {
            assertEquals(4, longestSubarray(new int[]{1, 1, 0, 0, 1, 1, 1, 0, 1}));
        }
    }
}