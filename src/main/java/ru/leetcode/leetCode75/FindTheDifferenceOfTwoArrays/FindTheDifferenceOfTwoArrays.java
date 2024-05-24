package ru.leetcode.leetCode75.FindTheDifferenceOfTwoArrays;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        for(Integer n : nums1) {
            n1.add(n);
        }
        for(Integer n : nums2) {
            n2.add(n);
        }
        for (Integer n : n1) {
            if (n2.contains(n)) {
                n2.remove(n);
            }
        }
        for (Integer n : nums2) {
            if (n1.contains(n)) n1.remove(n);
        }
        List<List<Integer>> result = List.of(new ArrayList<Integer>(), new ArrayList<Integer>());
        for(Integer n : n1) {
            result.get(0).add(n);
        }

        for(Integer n : n2) {
            result.get(1).add(n);
        }
        return result;
    }

    @Nested
    public class FindTheDifferenceOfTwoArraysTest {
        @Test
        public void case1() {
            System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
            //[[1,3],[4,6]]
        }

        @Test
        public void case2() {
            System.out.println(findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
            //[[3],[]]
        }
    }
}