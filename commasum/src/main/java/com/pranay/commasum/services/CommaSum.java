package com.pranay.commasum.services;

public class CommaSum {
    public double CalculateSum(String input){
        String numbers[] = input.split(",");
        double sum = 0;

        for (String number : numbers) {
            sum = sum + Double.parseDouble(number.trim());
        }
        return sum;
    }
}
