package com.coltsteele.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class longestSubStringTest {

    @Test
    public void testCase1(){
        assertEquals(7, longestSubString.findLongestSubString("rithmschool"));
    }

    @Test
    public void testCase2(){
        assertEquals(5, longestSubString.findLongestSubString("thisisawesome"));
    }

    @Test
    public void testCase3(){
        assertEquals(5, longestSubString.findLongestSubString("thecatinthehat"));
    }

    @Test
    public void testCase4(){
        assertEquals(1, longestSubString.findLongestSubString("bbbbbbbbbb"));
    }

    @Test
    public void testCase5(){
        assertEquals(7, longestSubString.findLongestSubString("longestsubstring"));
    }

    @Test
    public void testCase6(){
        assertEquals(5, longestSubString.findLongestSubString("thisishowwedoit"));
    }

}
