package ru.leetcode.easy.SearchInsertPosition;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int pos = Arrays.binarySearch(nums, target);
        return pos < 0 ? -1 * pos - 1 : pos;
    }

    @Nested
    class SearchInsertPositionTest {
        @Test
        public void case1() {
            assertEquals(2, searchInsert(new int[]{1, 3, 5, 6}, 5));
        }

        @Test
        public void case2() {
            assertEquals(1, searchInsert(new int[]{1, 3, 5, 6}, 2));
        }

        @Test
        public void case3() {
            assertEquals(4, searchInsert(new int[]{1, 3, 5, 6}, 7));
        }
    }
}
