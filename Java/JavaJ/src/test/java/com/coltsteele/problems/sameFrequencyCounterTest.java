package com.coltsteele.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class sameFrequencyCounterTest {

    @Test
    void isSameFrequencyCounter_182_821(){
        assertTrue(sameFrequencyCounter.isSameFrequency(182,281));
    }

    @Test
    void isSameFrequencyCounter_34_14(){
        assertFalse(sameFrequencyCounter.isSameFrequency(34,14));
    }

    @Test
    void isSameFrequencyCounter_3589578_5879385(){
        assertTrue(sameFrequencyCounter.isSameFrequency(3589578,5879385));
    }

    @Test
    void isSameFrequencyCounter_222_22(){
        assertFalse(sameFrequencyCounter.isSameFrequency(222,22));
    }
}
