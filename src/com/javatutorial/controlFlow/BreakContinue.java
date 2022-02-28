package com.javatutorial.controlFlow;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
            continue; // going back to the beginning of the loop
            if (input.equals("quit"))
            break; // terminates iteration and gets out of the loop
            System.out.println(input);

        }
    }
}
