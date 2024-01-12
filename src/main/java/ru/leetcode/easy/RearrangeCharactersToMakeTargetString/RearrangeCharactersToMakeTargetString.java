package ru.leetcode.easy.RearrangeCharactersToMakeTargetString;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RearrangeCharactersToMakeTargetString {
    public static int rearrangeCharacters(String source, String target) {
        int res = source.length();
        for (char symbol : target.toCharArray()) {
            int t = target.length() - target.replaceAll(String.valueOf(symbol), "").length();
            int s = source.length() - source.replaceAll(String.valueOf(symbol), "").length();
            if (t > s) {
                return 0;
            }
            int i = s / t;
            if (res > i) {
                res = i;
            }
        }
        return res;
    }

    @Nested
    class RearrangeCharactersToMakeTargetStringTest {
        @Test
        public void case1() {
            assertEquals(2, rearrangeCharacters("ilovecodingonleetcode", "code"));
        }

        @Test
        public void case2() {
            assertEquals(1, rearrangeCharacters("abcba", "abc"));
        }

        @Test
        public void case3() {
            assertEquals(1, rearrangeCharacters("abbaccaddaeea", "aaaaa"));
        }

        @Test
        public void case4() {
            assertEquals(0, rearrangeCharacters("abc", "abcd"));
        }

        @Test
        public void case5() {
            assertEquals(0, rearrangeCharacters("ccccndxxlzerbsrrkvdnlvynxbjtjldsqgevphdlrldyishznryttvuratvwiafiwyjklafesvmcexuacxqgmnokfljxkystcbef", "bvciovnpto"));
        }

        @Test
        public void case6() {
            assertEquals(2, rearrangeCharacters("cqlcqrqzqrampbumlixalzclhxvudysxykeblrkufyvowpufzecwyobjgbzgbkjqmrpibyugjlybukidzlnmxomkfpwp", "zqizcx"));
        }

    }
}
