package com.javatutorial.Types;

import java.nio.charset.StandardCharsets;

public class Strings {
    public static void main(String[] args) {
//        String message = new String("Hello world");
        /*** in Java strings are immutable */
        String message = "Hello World" + "!!";
        String newMessage = message.concat(" Hello Guy");
        System.out.println("Hey!" + newMessage + " "
                + newMessage.length());

        System.out.println(newMessage.compareToIgnoreCase("hello world!! hello guy"));
    }
}
