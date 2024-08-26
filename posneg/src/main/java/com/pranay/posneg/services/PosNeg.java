package com.pranay.posneg.services;

public class PosNeg {
    public String PosOrNeg(int n){
        String res;
        if (n == 0) {
            res = "Neither Positive nor Negative";
        }
        else if (n > 0) {
            res = "Positive";
        }
        else{
            res = "Negative";
        }
        return res;
    }
}
