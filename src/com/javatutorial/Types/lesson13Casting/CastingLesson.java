package com.javatutorial.Types.lesson13Casting;

import static java.lang.Character.MIN_RADIX;

public class CastingLesson {
    public static void main(String[] args) {
        // Implicit casting - when a variable can convert to
        // a bigger data type:
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double a = 1.1;
        double b = a + 2;
        System.out.println(b);

        // Explicit casting - can only happen between
        // compatible types
        double c = 1.1;
        int d = (int)c + 2;
        System.out.println(d);

        String e = "1";
        // To cast we need to use a Wrapper Class:
        //Integer.parseInt(e);
        int f = Integer.parseInt(e) + 2;
        double g = Double.parseDouble(e) + 12224.44;
        Float fl = Float.parseFloat(e) + 1.5F;
        System.out.println(fl);
    }
}
