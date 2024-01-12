package ru.leetcode.easy.majorityElement;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        Arrays.stream(nums).forEach(num -> {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
        });
        AtomicInteger result = new AtomicInteger();
        counts.entrySet().stream().forEach(map -> {
            if (nums.length / 2 < map.getValue()) {
                result.set(map.getKey());
            }
        });
        return result.get();
    }

    @Nested
    class majorityElementTest {
        @Test
        public void case1() {
            assertEquals(3, majorityElement(new int[]{3, 2, 3}));
        }

        @Test
        public void case2() {
            assertEquals(2, majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        }
    }
}
