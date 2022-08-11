package home_work_2.utils;

import home_work_1.AverageNumberSearch;

import java.util.Scanner;

public class ArrayUtils {
    /**
     * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
     * @param input
     * @return созданный массив
     */
    public static int[] arrayFromConsole(Scanner input){
        System.out.println("Введите размер массива!");
        int size = AverageNumberSearch.enterAndChackInt(input);
        int[] array = new int[size];
        for (int i = 0 ; i <= size-1 ; ++i){
            System.out.println("Введите "+(i+1)+" элемент массива!");
            array[i] = AverageNumberSearch.enterAndChackInt(input);
        }
        return array;
    }

    /**
     * Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
     * Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
     * @param size
     * @param maxValueExclusion
     * @return Созданный массив.
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] array = new int[size];
        for (int i = 0; i <= size - 1; ++i) {
            array[i] = (int) (Math.random() * maxValueExclusion);
        }
        return array;
    }
}
