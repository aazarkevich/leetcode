package ru.leetcode.easy.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    @Nested
    class RemoveDuplicatesFromSortedArrayTest {
        @Test
        public void case1() {
            assertEquals(2, removeDuplicates(new int[]{1, 1, 2}));
        }

        @Test
        public void case2() {
            assertEquals(5, removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        }
    }
}
