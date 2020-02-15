package com.coltsteele.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class averagePairTest {

    @Test
    void testCase1(){
        assertTrue(averagePair.isThereAvragePair(new double[]{1,2,3},2.5));
    }

    @Test
    void testCase2(){
        assertTrue(averagePair.isThereAvragePair(new double[]{1,3,4,5,6,7,10,12,19},8));
    }

    @Test
    void testCase3(){
        assertFalse(averagePair.isThereAvragePair(new double[]{-1,0,3,4,5,6},4.1));
    }

    void testCase4(){
        assertFalse(averagePair.isThereAvragePair(new double[]{},4));
    }
}
