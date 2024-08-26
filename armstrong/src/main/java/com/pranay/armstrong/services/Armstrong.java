package com.pranay.armstrong.services;

public class Armstrong {
    public String CheckArmstrong(int n){
        int sum,a,b,c,d;
        String res;
        if (n >= 100 && n <= 999) {
            a = n % 10; 
            b = n / 10; 
            c = b % 10; 
            d = b / 10; 
            sum = a * a * a + c * c * c + d * d * d;
            if (n == sum) {
                res = n+" is Armstrong number";
            } else {
                res = n + " is not a Armstrong number";
            }
        } else {
            res = "Please enter a valid 3 digit number";
        }
        return res;
    }
}
