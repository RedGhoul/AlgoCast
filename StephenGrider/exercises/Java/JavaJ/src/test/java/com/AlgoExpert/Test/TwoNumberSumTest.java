package com.AlgoExpert.Test;

import com.AlgoExpert.Code.TwoNumberSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoNumberSumTest {
    @Test
    public void TestCase1() {
        int[] expected = {4, 6};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6}, 10);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase2() {
        int[] expected = {1, 4};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6, 1}, 5);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase3() {
        int[] expected = {-3, 6};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {4, 6, 1, -3}, 3);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase4() {
        int[] expected = {-1, 11};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase5() {
        int[] expected = {8, 9};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 17);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase6() {
        int[] expected = {3, 15};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase7() {
        int[] expected = {-5, 0};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase8() {
        int[] expected = {-47, 210};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase9() {
        int[] expected = {};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }

    @Test
    public void TestCase10() {
        int[] expected = {};
        int[] output = TwoNumberSum.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15);
        Arrays.sort(output);
        assertTrue(Arrays.equals(output, expected));
    }
}
