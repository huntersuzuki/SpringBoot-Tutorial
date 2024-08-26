package com.pranay.lcm.services;

public class Lcm {
    public int FindLcm(int num1,int num2){
        int remainder,quotient;
        remainder = num2 % num1;
        quotient = num2 / num1;
        for (int i = 1; i < quotient; i++) {
            remainder = num1 % remainder;
            if (num1 % remainder == 0) {
                break;
            }
        }
        int lcm = (num1 * num2) / remainder;
        return lcm;
    }
}
