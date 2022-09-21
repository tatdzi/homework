package home_work_2.arrays.utils;

import java.util.Arrays;
import java.util.Scanner;

public class SortUtils {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = ArrayUtils.arrayRandom(10,100);
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
}
