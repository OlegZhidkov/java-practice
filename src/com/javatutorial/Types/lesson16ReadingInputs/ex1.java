package com.javatutorial.Types.lesson16ReadingInputs;

import java.util.Scanner;
import java.util.stream.Stream;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Say what you think: ");
        String myString = sc.nextLine();


        System.out.println(myString);
    }
}
