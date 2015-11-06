package com.tbp;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void doBefore() {
        solution = new Solution();
    }


    @Test
    public void testSolution() {
        assertEquals(3, solution.solution(10,85,30));
        assertEquals(10, solution.solution(0,10,1));
        assertEquals(5, solution.solution(0,10,2));
        assertEquals(4, solution.solution(0,10,3));
    }


}
