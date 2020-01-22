package com.stephengrider.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MaxCharsTest {

    @Test
    void MaxCharReturnsRightString(){
        assertEquals("c",MaxChars.maxChar("abcccccccd"));
        assertEquals("1",MaxChars.maxChar("apple 1231111"));
    }
}
