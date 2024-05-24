package ru.leetcode.leetCode75.FindTheHighestAltitude;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int max = 0, buf = 0;
        for (int v : gain) {
            max = Math.max(max, buf + v);
            buf = buf + v;
        }
        return max;
    }

    @Nested
    public class FindTheHighestAltitudeTest {
        @Test
        public void case1() {
            assertEquals(1, largestAltitude(new int[]{-5, 1, 5, 0, -7}));
            //[0,-5,-4,1,1,-6]
        }

        @Test
        public void case2() {
            assertEquals(0, largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
            //[0,-4,-7,-9,-10,-6,-3,-1]
        }
    }
}
