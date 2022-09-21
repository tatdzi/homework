package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.arrays.utils.ArrayUtils.arrayRandom;

public class Task_2_4 {
    public static void main(String[] args) {
        int result,number;
        int[] arr = arrayRandom(50,100);
        System.out.println(Arrays.toString(arr));
        result = task_2_4_1(arr);
        System.out.println(result);
        number = task_2_4_2(arr);
        System.out.println(number);
        task_2_4_3(arr);
        task_2_4_4(arr);
        task_2_4_5(arr,0,100);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = arrayRandom(50,100);
        int a = task_2_4_6(arr1);
        System.out.println(a);
    }

    /**
     * Сумма четных положительных элементов массива
     * @param R
     * @return
     */
    public static int task_2_4_1(int[] R){
        int result=0;
        for (int i =0;i<R.length;++i) {
            if (R[i] > 0 && R[i] % 2 == 0) {
                result += R[i];
            }
        }
        return result;
    }

    /**
     * Максимальный из элементов массива с четными индексами
     * @param R
     * @return
     */
    public static int task_2_4_2(int[] R){
        int result = -100;
        for (int i =0 ; i<R.length; i+=2){
            if (R[i]>=result){
                result = R[i];
            }
        }
        return result;
    }

    /**
     * Элементы массива, которые меньше среднего арифметического
     * @param arr
     */
    public static void task_2_4_3(int[] arr){
        int sort;
        int number=0;
        for (int i =0; i<arr.length; ++i){
            number += arr[i];
        }
        sort =number/arr.length;
        for (int i =0; i<arr.length; ++i){
            if(arr[i]<sort){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    /**
     * Найти два наименьших (минимальных) элемента массива
     * @param arr
     */
    public static void task_2_4_4(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest =Integer.MAX_VALUE;
        for (int i = 0;i<arr.length;++i){
            if(arr[i]< smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if (arr[i]<secondSmallest) {
                secondSmallest =arr[i];
            }
        }
        System.out.println(smallest+" "+secondSmallest);
    }

    /**
     * Сжать массив, удалив элементы, принадлежащие интервалу
     * @param arr
     * @param a
     * @param b
     * @return
     */
    public static int[] task_2_4_5(int[] arr,int a,int b){
        for (int i =0;i<arr.length;++i){
            if (arr[i]>a && arr[i]<b){
                arr[i]=0;
            }
        }
        return arr;
    }

    /**
     * Метод считает сумма цифр массива
     * @param arr
     * @return
     */
    public static int task_2_4_6(int[] arr){
        int result = 0;
        for (int i =0;i<arr.length;++i){
            while (!(arr[i]==0)){
                result += arr[i]%10;
                arr[i]/=10;
            }
        }
        return result;
    }


}
