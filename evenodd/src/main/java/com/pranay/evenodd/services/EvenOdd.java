package com.pranay.evenodd.services;

public class EvenOdd {
    public String EvenOrOdd(int n){
        String res;
        if (n%2==0) {
            res = "Even";
        }
        else{
            res = "Odd";
        }
        return res;
    }
}
