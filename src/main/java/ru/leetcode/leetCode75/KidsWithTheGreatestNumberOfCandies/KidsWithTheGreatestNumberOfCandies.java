package ru.leetcode.leetCode75.KidsWithTheGreatestNumberOfCandies;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = candies[0];
        for (int i = 1; i < candies.length; i ++) {
            if (max <= candies[i])
                max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    @Nested
    class KidsWithTheGreatestNumberOfCandiesTest {
        @Test
        public void case1() {
            assertEquals(List.of(true, true, true, false, true), kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        }

        @Test
        public void case2() {
            assertEquals(List.of(true, false, false, false, false), kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        }

        @Test
        public void case3() {
            assertEquals(List.of(true, false, true), kidsWithCandies(new int[]{12, 1, 12}, 10));
        }
    }
}