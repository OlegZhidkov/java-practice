package com.javatutorial.Types.lesson4ReferenceTypes;

import java.util.Date;
import java.util.Map;

public class ReferenceTypes {
    public static void main(String[] args) {

        // we use reference types to store complex objects
       byte age = 30;
       // for reference types we need to allocate memory
       Date now = new Date();
       // object is an instance of a class
        System.out.println(now);
    }
}

/***
 * Primitive vs Reference Types
 * object has a reference to the location of values
 *
 * - reference types are copied by their reference
 * - primitive types are copied by their values that are independent of each other
 */
