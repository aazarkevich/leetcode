package ru.leetcode.leetCode75.MoveZeroes;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int[] ints = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ints[j] = nums[i];
                j ++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
        }
        System.gc();
    }

    @Nested
    public class MoveZeroesTest {
        @Test
        public void case1() {
            int[] nums = {0, 1, 0, 3, 12};
            moveZeroes(nums);
            System.out.println(Arrays.toString(nums));
            //[1,3,12,0,0]
        }

        @Test
        public void case2() {
            int[] nums = {0};
            moveZeroes(nums);
            System.out.println(Arrays.toString(nums));
            //[0]
        }
    }
}
