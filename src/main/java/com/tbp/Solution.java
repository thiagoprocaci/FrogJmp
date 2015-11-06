package com.tbp;


public class Solution {

    public int solution(int X, int Y, int D) {
        long diff = Math.abs(Long.valueOf(X) - Long.valueOf(Y));
        long steps = diff/Long.valueOf(D);
        long remainder = diff % Long.valueOf(D);
        if(remainder > 0) {
            steps += 1;
        }
        return (int) steps;
    }

}
