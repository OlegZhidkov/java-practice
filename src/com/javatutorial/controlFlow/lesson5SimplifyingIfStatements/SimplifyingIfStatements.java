package com.javatutorial.controlFlow.lesson5SimplifyingIfStatements;

// declaring variable is
// only possible in code blocks: "{ }"

public class SimplifyingIfStatements {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;
    }
}

/***
 * More mature way to write this code
 * public static void main(String[] args) {
 *  int income = 120_000;
 *  boolean hasHighIncome = (income > 100_000);
 */
