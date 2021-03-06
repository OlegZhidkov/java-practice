package com.javatutorial.Types.lesson15FormatingNumbers;

import java.text.NumberFormat;

public class FormatingNumbers {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.1);
        System.out.println(result);

        // Method Chaining - chaining several methods together
        String result2 = NumberFormat.getPercentInstance()
                .format(0.2);
        System.out.println(result2);
    }
}
