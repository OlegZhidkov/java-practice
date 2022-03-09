package com.javatutorial;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

//        // Principal
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Principal: ");
//        Long principal = scanner.nextLong();
//
//        // Annual Interest Rate
//        System.out.print("Annual Interest Rate: ");
//        float annualInterestRate = scanner.nextFloat();
//        float monthlyInterestRate = annualInterestRate/ 100 / 12;
//
//        // Duration
//        System.out.print("Period(Years): ");
//        int period = scanner.nextInt();
//        int numberOfPayments = period * 12;
//
//        NumberFormat result = NumberFormat.getCurrencyInstance();
//        Double monthlyPayment = principal * monthlyInterestRate
//                * (Math.pow(1 + monthlyInterestRate, numberOfPayments)
//                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
//        System.out.println(result.format(monthlyPayment));

    /*** Mosh Solution */
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        while(true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();

            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
        while(true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal * (monthlyInterest *
        Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance()
                .format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);

        //System.out.print(mortgage * 360);


    }
}
