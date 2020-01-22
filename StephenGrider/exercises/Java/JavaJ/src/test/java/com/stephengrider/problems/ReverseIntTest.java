package com.stephengrider.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseIntTest {

    @Test
    void ReverseIntReturnsReversedIntPos(){
        assertEquals(51, ReverseInt.ReverseInt(15));
        assertEquals(189, ReverseInt.ReverseInt(981));
        assertEquals(5, ReverseInt.ReverseInt(500));

    }

    @Test
    void ReverseIntReturnsReversedIntNeg(){
        assertEquals(-51, ReverseInt.ReverseInt(-15));
        assertEquals(-9, ReverseInt.ReverseInt(-90));

    }
}
