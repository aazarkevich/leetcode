package ru.leetcode.medium.rotateArray;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] result = new int[nums.length];
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        for (int i = 0; i < k; i++) {
            result[i] = nums[j];
            j++;

        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    @Nested
    class RotateArrayTest {
        @Test
        public void case1() {
            int[] ints = {1, 2, 3, 4, 5, 6, 7};
            rotate(ints, 3);
            System.out.println(Arrays.toString(ints));
        }

        @Test
        public void case2() {
            int[] ints = {-1, -100, 3, 99};
            rotate(ints, 2);
            System.out.println(Arrays.toString(ints));
        }
    }
}
//Example 1:
//
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
//        Example 2:
//
//        Input: nums = [-1,-100,3,99], k = 2
//        Output: [3,99,-1,-100]
//        Explanation:
//        rotate 1 steps to the right: [99,-1,-100,3]
//        rotate 2 steps to the right: [3,99,-1,-100]