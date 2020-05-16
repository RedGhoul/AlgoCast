package com.coltsteele.problems;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
public class minSubArrayLenTest {
    @Test
    void testCase1(){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(1);
        temp.add(2);
        temp.add(4);
        temp.add(3);

        assertEquals(2,minSubArrayLen.findMinSubArrayLength(temp,7));
    }

    @Test
    void testCase2(){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(1);
        temp.add(6);
        temp.add(5);
        temp.add(4);

        assertEquals(2,minSubArrayLen.findMinSubArrayLength(temp,9));
    }

    @Test
    void testCase3(){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(3);
        temp.add(1);
        temp.add(7);
        temp.add(11);
        temp.add(2);
        temp.add(9);
        temp.add(8);
        temp.add(21);
        temp.add(62);
        temp.add(33);
        temp.add(19);

        assertEquals(1,minSubArrayLen.findMinSubArrayLength(temp,52));
    }

    @Test
    void testCase4(){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(4);
        temp.add(16);
        temp.add(22);
        temp.add(5);
        temp.add(7);
        temp.add(8);
        temp.add(9);
        temp.add(10);

        assertEquals(3,minSubArrayLen.findMinSubArrayLength(temp,39));
    }

    @Test
    void testCase5(){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(4);
        temp.add(16);
        temp.add(22);
        temp.add(5);
        temp.add(7);
        temp.add(8);
        temp.add(9);
        temp.add(10);

        assertEquals(5,minSubArrayLen.findMinSubArrayLength(temp,55));
    }
}
