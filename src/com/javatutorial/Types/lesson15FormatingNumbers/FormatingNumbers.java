package com.javatutorial.Types.lesson15FormatingNumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatingNumbers {
    public static void main(String[] args) {
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);
//        System.out.println(result);

        // Method Chaining - chaining several methods together
        String result1 = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result1);

        String result2 = NumberFormat.getCurrencyInstance(Locale.US).format(150.5);
        System.out.println(result2);
    }
}