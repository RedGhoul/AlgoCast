package com.stephengrider.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AnagramsTest {

    @Test
    void AnagramCheck_RailSafety_fairyTails(){
        assertTrue(Anagrams.anagramCheck("rail safety","fairy tales"));
    }

    @Test
    void AnagramCheck_RailSafety_fairyTails2(){
        assertFalse(Anagrams.anagramCheck("RAIL! SAFETY!","fairy tales"));
    }

    @Test
    void AnagramCheck_HiThere_ByeThere(){
        assertFalse(Anagrams.anagramCheck("Hi there","Bye there"));
    }
}
