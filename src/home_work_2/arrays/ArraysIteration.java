package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

import java.util.Scanner;

public class ArraysIteration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = ArrayUtils.arrayFromConsole(in);
        allElements(arr);
        eachSecondElements(arr);
        elementsInReverseOrder(arr);
        System.out.println();


    }

    /**
     * Вывести все элементы в консоль.
     * @param a
     */
    public static void allElements(int[] a){
        for (int element: a){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    /**
     * Вывести каждый второй элемент массива в консоль.
     * @param b
     */
    public static void eachSecondElements(int[] b){
        for (int i = 0; i <b.length ; i+=2) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }

    /**
     * Вывести все элементы массива в консоль в обратном порядке.
     * @param c
     */
    public static void elementsInReverseOrder(int[] c){
        for (int i = 0; i <c.length ; ++i) {
            System.out.print(c[c.length-(i+1)]+" ");
        }
        System.out.println();
    }
}
