package com.javatutorial.Types.lesson14MathClass;

public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);

        int pow = (int)Math.pow(2,3);
        System.out.println(pow);

        pow = (int)Math.cbrt(6);
        System.out.println(pow);

    }
}
