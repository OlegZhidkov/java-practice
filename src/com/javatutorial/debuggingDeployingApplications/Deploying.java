package com.javatutorial.debuggingDeployingApplications;

// for deploying your program you need to create jar
public class Deploying {
    public static void main(String[] args) {
        System.out.println("Start"); //breakpoint on the statement
        printNumbers(4);
        System.out.println("Finish");
    }

    public static void printNumbers(int limit) {
        for(int i = 0; i <= limit; i++)
            System.out.println(i);
    }
}
