package com.javatutorial.Types.lesson9MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [][][] numbers = new int [2] [2] [2];
        int [][] numbers2 = {{1, 2, 3}, {4, 5, 6}};
        numbers [0][0][0] = 1;
        numbers [0][0][1] = 1;
        numbers [0][1][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
        // we're using deepToString for multidimensional arrays
    }
}
