package net.learning.java;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //take input from command line

        // Scanner in = new Scanner(System.in);
        // int[][] arr = new int[3][2];
        // for(int row=0 ; row < arr.length; row++) {
        //     for(int column=0; column<arr[row].length; column++) {
        //         arr[row][column] = in.nextInt();
        //     }
        // }

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };

        for(int row=0 ; row < arr.length; row++) {
            // for(int column=0; column<arr[row].length; column++) {
            //     System.out.print(arr[row][column] + " ");
            // }
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
