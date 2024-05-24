package ru.leetcode.leetCode75.MaximumAverageSubarray1;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int windowSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return (double) maxSum / k;
    }

    @Nested
    public class MaximumAverageSubarrayTest {
        @Test
        public void case1() {
            assertEquals(12.75, findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        }

        @Test
        public void case2() {
            assertEquals(5.0, findMaxAverage(new int[]{5}, 1));

        }

        @Test
        public void case3() {
            assertEquals(-1.0, findMaxAverage(new int[]{-1}, 1));

        }

        @Test
        public void case4() {
            assertEquals(1.75, findMaxAverage(new int[]{1, 0, 1, 4, 2}, 4));

        }

        @Test
        public void case5() {
            assertEquals(-594.5806451612904, findMaxAverage(new int[]{8860, -853, 6534, 4477, -4589, 8646, -6155, -5577, -1656, -5779, -2619, -8604, -1358, -8009, 4983, 7063, 3104, -1560, 4080, 2763, 5616, -2375, 2848, 1394, -7173, -5225, -8244, -809, 8025, -4072, -4391, -9579, 1407, 6700, 2421, -6685, 5481, -1732, -8892, -6645, 3077, 3287, -4149, 8701, -4393, -9070, -1777, 2237, -3253, -506, -4931, -7366, -8132, 5406, -6300, -275, -1908, 67, 3569, 1433, -7262, -437, 8303, 4498, -379, 3054, -6285, 4203, 6908, 4433, 3077, 2288, 9733, -8067, 3007, 9725, 9669, 1362, -2561, -4225, 5442, -9006, -429, 160, -9234, -4444, 3586, -5711, -9506, -79, -4418, -4348, -5891}, 93));
        }

        @Test
        public void case6() {
            assertEquals(573.6451612903226, findMaxAverage(new int[]{9672, -6795, 2696, -97, 6315, 936, 4482, 5863, 5046, -1376, -4328, -7112, -7844, -3295, 5268, 5029, -2665, -8250, -879, 8716, 4184, -6046, -366, -1785, 875, 4281, -3168, 2248, 7773, -5652, 2100, 2575, 432, 4523, -9309, -9232, -59, -1532, -1493, -9329, -1850, 7945, -1224, -2646, -8007, -6395, -396, 9638, 5254, -2544, -4907, 3706, 6002, -9347, 6248, -47, -9564, 4105, -4256, -1794, 6345, -780, -3363, -5389, -8173, 4810, 6787, 3589, -850, -9937, -6255, 4218, -6299, -9022, -152, 1063, -2003, -3677, 9704, -6182, -9562, 5489, 6350, -1083, -7537, -3583, 3029}, 31));

        }
    }
}