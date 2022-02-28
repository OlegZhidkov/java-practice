package com.javatutorial.Types;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        System.out.print("Name: ");
        String name = scanner.next();
        System.out.println("You are " + name);

        // To print whole line without considering
        // how many tokens are there
        System.out.print("FullName: ");
        String fullName = scanner.nextLine();
        System.out.println("You are " + fullName);

    }
}
