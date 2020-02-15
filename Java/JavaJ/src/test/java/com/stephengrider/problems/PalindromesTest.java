package com.stephengrider.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {

    @Test
    void isPalindromeV1ReturnsTrueForPalindromes() {
        assertTrue(Palindromes.isPalindromeV1("abba"));
        assertTrue(Palindromes.isPalindromeV1("pennep"));
        assertTrue(Palindromes.isPalindromeV1("aba"));
    }

    @Test
    void isPalindromeV1ReturnsFalseForNonPalindromes() {
        assertFalse(Palindromes.isPalindromeV1("Fish hsif"));
        assertFalse(Palindromes.isPalindromeV1("greetings"));
    }

    @Test
    void isPalindromeV2ReturnsTrueForPalindromes() {
        assertTrue(Palindromes.isPalindromeV2("abba"));
        assertTrue(Palindromes.isPalindromeV2("pennep"));
        assertTrue(Palindromes.isPalindromeV2("aba"));
    }

    @Test
    void isPalindromeV2ReturnsFalseForNonPalindromes() {
        assertFalse(Palindromes.isPalindromeV2("Fish hsif"));
        assertFalse(Palindromes.isPalindromeV2("greetings"));
    }
}