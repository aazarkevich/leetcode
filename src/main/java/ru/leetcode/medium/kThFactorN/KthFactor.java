package ru.leetcode.medium.kThFactorN;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthFactor {

    public static int kthFactor(int n, int k) {
        Set<Integer> ints = new TreeSet<>();
        for (int i = 1; i <= Math.pow(n, 0.5) + 1; i++) {
            if (i * i == n) {
                ints.add(i);
            } else if (n % i == 0) {
                ints.add(i);
                ints.add(n / i);
            }
        }
        if (ints.isEmpty() || k > ints.size()) {
            return -1;
        }
        int c = 1;
        for (Integer i : ints) {
            if (c == k) {
                return i;
            }
            c++;
        }
        return -1;
    }

    @Nested
    class KthFactorTest {
        @Test
        public void case1() {
            assertEquals(3, kthFactor(12, 3));
        }

        @Test
        public void case2() {
            assertEquals(7, kthFactor(7, 2));
        }

        @Test
        public void case3() {
            assertEquals(-1, kthFactor(4, 4));
        }

        @Test
        public void case4() {
            assertEquals(2, kthFactor(2, 2));
        }
    }
}