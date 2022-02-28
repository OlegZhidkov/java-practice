package com.javatutorial.controlFlow;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // 5 = fizz
        // 3 = buzz
        // 5 & 3 = fizzbuzz
        // !(5 & 3) = input num

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");

        int number = scanner.nextInt();
        boolean fizzBuzz = (number % 5 == 0 && number % 3 == 0);
        boolean fizz = (number % 5 == 0);
        boolean buzz = (number % 3 == 0);
        if (fizzBuzz)
            System.out.println("FizzBuzz");
        else if (fizz)
            System.out.println("Fizz");
        else if (buzz)
            System.out.println("Buzz");
        else
            System.out.println(number);

    }
}

