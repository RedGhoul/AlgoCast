package com.stephengrider.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GetVowelsTest {
    //   vowels('Hi There!') --> 3
//   vowels('Why do you ask?') --> 4
//   vowels('Why?') --> 0
    @Test
    void testGetVowels(){
        assertEquals(3,GetVowels.getVowelsInInput("Hi There!"));
    }
}
