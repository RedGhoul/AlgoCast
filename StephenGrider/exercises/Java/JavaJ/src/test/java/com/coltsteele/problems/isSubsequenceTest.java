package com.coltsteele.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class isSubsequenceTest {
    @Test
    void testCase1(){
        assertTrue(isSubsequence.isSubsequence("hello","hello world"));
    }

    @Test
    void testCase2(){
        assertTrue(isSubsequence.isSubsequence("sing","string"));
    }

    @Test
    void testCase3(){
        assertTrue(isSubsequence.isSubsequence("abc","abracadabra"));
    }

    @Test
    void testCase4(){
        assertFalse(isSubsequence.isSubsequence("abc","acb"));
    }
}
