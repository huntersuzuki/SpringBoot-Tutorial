package com.pranay.summation.services;

public class Summation {
    public int SummationOfDigits(int n){
       int sum=0,x;
        while (n != 0) {
            x = n % 10;
            sum = sum + x;
            n = n / 10;
        }
        return sum;
    }
}
