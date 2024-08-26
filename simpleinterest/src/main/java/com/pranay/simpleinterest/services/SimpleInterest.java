package com.pranay.simpleinterest.services;

public class SimpleInterest {
    public int FindSimpleInterest(int n,int p,int r){
        int interest,amount;
        interest = (p*n*r)/100;
        amount = p+interest;
        return amount;
    }
}
