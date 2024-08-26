package com.pranay.gcd.services;

public class GCD {

    public int greatestCommonFactor(int num1, int num2) {
        int remainder = num2 % num1;
        for (int i = 1; i < remainder; i++) {
            remainder = num1 % remainder;
            if (num1 % remainder == 0) {
                break;
            }
        }
        return remainder;
    }

}
