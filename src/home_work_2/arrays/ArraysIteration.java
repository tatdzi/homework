package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

import java.util.Scanner;

public class ArraysIteration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = ArrayUtils.arrayFromConsole(in);
        output1(arr);
        output2(arr);
        output3(arr);


    }

    /**
     * Вывести все элементы в консоль.
     * @param a
     */
    public static void output1(int[] a){
        for (int element: a){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    /**
     * Вывести каждый второй элемент массива в консоль.
     * @param b
     */
    public static void output2(int[] b){
        for (int i = 0; i <b.length ; i+=2) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }

    /**
     * Вывести все элементы массива в консоль в обратном порядке.
     * @param c
     */
    public static void output3(int[] c){
        for (int i = 0; i <c.length ; ++i) {
            System.out.print(c[c.length-(i+1)]+" ");
        }
        System.out.println();
    }
}
