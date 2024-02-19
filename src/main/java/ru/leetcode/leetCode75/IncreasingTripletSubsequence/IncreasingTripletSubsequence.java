package ru.leetcode.leetCode75.IncreasingTripletSubsequence;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IncreasingTripletSubsequence {

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < a) {
                a = num;
            }

            if (num > a) {
                b = Math.min(num, b);
            }

            if (num > b) {
                return true;
            }
        }
        return false;
        //20, 100, 10, 12, 5, 13
        // a = 20; a = 20; a = 10; a = 10; a = 5;
        // b = MAX_VALUE; b = 100; b = 100; b = 12;
    }

    @Nested
    public class IncreasingTripletSubsequenceTest {
        @Test
        public void case1() {
            assertTrue(increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        }

        @Test
        public void case2() {
            assertFalse(increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        }

        @Test
        public void case3() {
            assertTrue(increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        }

        @Test
        public void case4() {
            assertTrue(increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
        }

        @Test
        public void case5() {
            assertFalse(increasingTriplet(new int[]{0, 4, 2, 1, 0, -1, -3}));
        }

        @Test
        public void case6() {
            assertFalse(increasingTriplet(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        }

        @Test
        public void case7() {
            assertTrue(increasingTriplet(new int[]{1, 5, 0, 4, 1, 3}));
        }

        @Test
        public void case8() {
            assertTrue(increasingTriplet(new int[]{1, 2, 1, 3}));
        }

        @Test
        public void case9() {
            assertTrue(increasingTriplet(new int[]{14, 22, 21, 11, 90}));
        }

        @Test
        public void case10() {
            assertFalse(increasingTriplet(new int[]{5, 1, 6}));
        }

        @Test
        public void case11() {
            assertFalse(increasingTriplet(new int[]{6, 7, 1, 2}));
        }
    }
}