package com.javatutorial.controlFlow.lesson4IfStatements;

public class IfStatements {
    public static void main(String[] args) {
        int temp = 15;
        if (temp > 30) {
            System.out.println("It is hot");
            System.out.println("Please, drink water");
        }
        else if (temp > 20)
            System.out.println("It is a beautiful day!");
        else
            System.out.println("It's a cold day");
    }
}
