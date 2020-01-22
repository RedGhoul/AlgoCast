package com.stephengrider.problems;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayChunksTest {

    @Test
    void createArrayChunksTest_Size2_Input4(){
        ArrayList<ArrayList<Integer>> Answer = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> Answer1 = new ArrayList<Integer>() {{
            add(1);
            add(2);
        }};
        ArrayList<Integer> Answer2 = new ArrayList<Integer>() {{
            add(3);
            add(4);
        }};

        Answer.add(Answer1);
        Answer.add(Answer2);

        ArrayList<Integer> Input = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        assertEquals(Answer,ArrayChunks.createChunks(Input,2));
    }


    @Test
    void createArrayChunksTest_Size3_Input8(){
        ArrayList<ArrayList<Integer>> Answer = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> Answer1 = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};
        ArrayList<Integer> Answer2 = new ArrayList<Integer>() {{
            add(4);
            add(5);
            add(6);
        }};

        ArrayList<Integer> Answer3 = new ArrayList<Integer>() {{
            add(7);
            add(8);
        }};

        Answer.add(Answer1);
        Answer.add(Answer2);
        Answer.add(Answer3);

        ArrayList<Integer> Input = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
        }};

        assertEquals(Answer,ArrayChunks.createChunks(Input,3));
    }
}
