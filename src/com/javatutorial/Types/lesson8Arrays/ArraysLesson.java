package com.javatutorial.Types.lesson8Arrays;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));

        int [] numbers2 = {1, 2, 3, 0, 45, 17, 19};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }
}
