package com.javatutorial.controlFlow.lesson3LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        // AND, OR, NOT
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;

        int num1 = 10;
        int num2 = 20;
        boolean sum = (num2 - num1) > num1 || (num2 - num1) < 15;
    }
}
