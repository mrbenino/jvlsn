package com.Array_2;

public class ArrayExample {
    public static void main(String[] args) {
        Object[] i = new Object[5];

        for (int k = 0; k < i.length; k++) {
            System.out.println(i[k]);
        }

        int[] j = new int[3];

        j[0] = 2;
        j[1] = 3;
        j[2] = 1;

        for (int k = 0; k < j.length; k++) {
            System.out.println(j[k]);
        }

        int[][] g = new int[3][];


        method(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
    static void method(int[][] array){
        System.out.println("-------------");
        for (int k = 0; k < array.length; k++) {
            System.out.print("| ");
            for (int i = 0; i < array[k].length; i++) {
                System.out.print(array[k][i]);
                System.out.print(" | ");
            }
            System.out.println("");
            System.out.println("-------------");
        }
    }
}
