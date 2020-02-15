package com.coltsteele.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class maxSubArraySumTest {

    @Test
    void testCase1(){
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        inputArray.add(100);
        inputArray.add(200);
        inputArray.add(300);
        inputArray.add(400);
        assertEquals(700,maxSubArraySum.findMaxSubArraySumTestEd(inputArray,2));
    }

    @Test
    void testCase2(){
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        inputArray.add(1);
        inputArray.add(4);
        inputArray.add(2);
        inputArray.add(10);
        inputArray.add(23);
        inputArray.add(3);
        inputArray.add(1);
        inputArray.add(0);
        inputArray.add(20);
        assertEquals(39,maxSubArraySum.findMaxSubArraySumTestEd(inputArray,4));
    }

    @Test
    void testCase3(){
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        inputArray.add(-3);
        inputArray.add(4);
        inputArray.add(0);
        inputArray.add(-2);
        inputArray.add(6);
        inputArray.add(-1);
        assertEquals(5,maxSubArraySum.findMaxSubArraySumTestEd(inputArray,2));
    }

    @Test
    void testCase4(){
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        inputArray.add(3);
        inputArray.add(-2);
        inputArray.add(7);
        inputArray.add(-4);
        inputArray.add(1);
        inputArray.add(-1);
        inputArray.add(4);
        inputArray.add(-2);
        inputArray.add(1);
        assertEquals(5,maxSubArraySum.findMaxSubArraySumTestEd(inputArray,2));
    }

    @Test
    void testCase5(){
        ArrayList<Integer> inputArray = new ArrayList<Integer>();

        inputArray.add(2);
        inputArray.add(3);

        assertEquals(null,maxSubArraySum.findMaxSubArraySumTestEd(inputArray,3));
    }

}
