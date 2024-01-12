package ru.leetcode.easy.removeElement;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class removeElement {

    public static int removeElement(int[] nums, int val) {
        int[] ints = Arrays.stream(nums).filter(v -> v != val).toArray();
        Arrays.fill(nums, -1);
        System.arraycopy(ints, 0, nums, 0, ints.length);
        return ints.length;
    }

    @Nested
    class removeElementTest {
        @Test
        public void case1() {
            assertEquals(2, removeElement(new int[]{3, 2, 2, 3}, 3));
        }

        @Test
        public void case2() {
            assertEquals(5, removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        }
    }
}