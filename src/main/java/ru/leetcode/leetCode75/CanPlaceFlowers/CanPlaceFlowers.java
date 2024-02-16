package ru.leetcode.leetCode75.CanPlaceFlowers;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            if ((flowerbed[0] == 0 && n == 1) || n == 0) {
                return true;
            }
            return false;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i > 0 && flowerbed[i - 1] != 1 && (i < flowerbed.length - 1 && flowerbed[i + 1] != 1)) {
                    flowerbed[i] = 1;
                    n--;
                } else if ((i == 0 && flowerbed[i + 1] != 1) ||
                        (i == flowerbed.length - 1 && flowerbed[i - 1] != 1)) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        System.gc();
        return n <= 0;
    }

    @Nested
    class CanPlaceFlowersTest {
        @Test
        public void case1() {
            assertEquals(true, canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        }

        @Test
        public void case2() {
            assertEquals(false, canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        }

        @Test
        public void case3() {
            assertEquals(false, canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
        }

        @Test
        public void case4() {
            assertEquals(true, canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2));
        }

        @Test
        public void case5() {
            assertEquals(false, canPlaceFlowers(new int[]{1, 0, 1, 0, 1, 0, 1}, 1));
        }

        @Test
        public void case6() {
            assertEquals(true, canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        }

        @Test
        public void case7() {
            assertEquals(true, canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));
        }
    }
}
