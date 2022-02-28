package com.javatutorial.Types;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args) {

        /*** P * r * [(1 + r)^n / (1 + r)^n - 1]
         * P = Principal
         * r = Monthly Interest Rate > AIR / 12 / 100
         * n = number of payments > period * 12
         * */

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

        System.out.print("Principal ($1K - $1M): ");
        int principal = scanner.nextInt();
        while (principal < 1_000 && principal > 1_000_000) {
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal ($1K - $1M): ");
        }

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest *
        Math.pow(1 + monthlyInterest, numberOfPayments))
        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance()
                .format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);

        //System.out.print(mortgage * 360);


    }
}
