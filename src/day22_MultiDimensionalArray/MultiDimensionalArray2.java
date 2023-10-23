package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //3 dimensional array contains 2 d array

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{11, 21, 31}, {42, 52, 62}, {73, 83, 93}}};

        //[index of 2D] [index of 1D] [index of elements]

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));//{{11, 21, 31}, {42, 52, 62}, {73, 83, 93}}

        System.out.println(Arrays.toString(arr3D[1][1]));//{42, 52, 62}

        System.out.println(arr3D[1][2][2]); //9


        for (int[][] each2D : arr3D) {

            for (int[] each1D : each2D) {

                for (int element : each1D) {

                    System.out.println(element);
                }
            }
        }
        System.out.println("-----------------------------------------------------------");

        int[][][][] arr4D = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{11, 21, 31}, {42, 52, 62}, {73, 83, 93}}}};

        for (int[][][] each3D : arr4D) {

            for (int[][] each2D : arr3D) {

                for (int[] each1D : each2D) {

                    for (int element : each1D) {

                        System.out.println(element);
                    }
                }
            }
        }
    }
}
