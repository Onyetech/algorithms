package com.ikennascode;

import java.math.BigInteger;

public class Solution {

    static BigInteger factorial(int N){

        BigInteger n = BigInteger.ONE;

        for(int i=2; i<=N; i++)
            n = n.multiply(BigInteger.valueOf(i));
            return n;
    }

    public static void main(String[] args) throws Exception {
        int N = 3;
        System.out.println(factorial(N));
    }
}
