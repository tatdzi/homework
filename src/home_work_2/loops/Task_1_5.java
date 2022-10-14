package home_work_2.loops;

import home_work_1.AverageNumberSearch;

import java.util.Random;
import java.util.Scanner;

public class Task_1_5 {

    /**
     * Метод higestFigure находит наибольшую цифру натурального числа.
     * @param a
     * @return
     */
    public static int higestFigure(int a){
        int result = 0;
        while (a > 0) {
            if (a % 10 > result) {
                result = a % 10;
            }
            a /= 10;
        }
        return result;
    }

    /**
     * Метод вычисляет вероятность четных случайных чисел.
     * @return
     */
    public static double randTest(){
        int num = 0;
        Random rand = new Random();
        for (int i =0;i<100000;++i){
            int r = rand.nextInt(10);
            if (r%2==0){
                ++num;
            }
        }
        return  Math.round(num/1000.0);
    }

    /**
     * Метод считает четные цифры числа.
     * @param a
     * @return
     */
    public static int countHonetNumbers(int a){
        int b = 0;
        while (a > 0) {
            if ((a%10)%2 == 0 ) {
                ++b;
            }
            a/=10;
        }
      return b;
    }
    /**
     * Метод считает нечетные цифры числа.
     * @param a
     * @return
     */
    public static int countOddNumbers(int a){
        int b = 0;
        while (a > 0) {
            if (!((a%10)%2 == 0 )) {
                ++b;
            }
            a/=10;
        }
        return b;
    }

    /**
     * Метод выводит ряд Фибоначчи.
     * @param a -количество элементов.
     * @return
     */
    public static String fibo(int a){
        int n0 = 1;
        int n1 = 2;
        int n2;
        String result=n0+" "+n1+" ";
        for (int i = 0;i<a;++i){
            n2=n0+n1;
            result +=n2+" ";
            n0=n1;
            n1=n2;
        }
        return result;
    }

    /**
     *Метод выводит ряд чисел в диапазоне с шагом.
     * @param a - нижний предел
     * @param b - верхний предел
     * @param c - шаг
     * @return
     */
    public static String task5(int a,int b,int c){
        String result ="";
        for (int i = a; i<=b;i+=c){
            result +=i+" ";
        }
        return result;
    }

    /**
     * Метод переворачивает число.
     * @param a
     * @return
     */
    public static int change(int a){
        String result="";
        while (a>0){
            result +=(a%10);
            a/=10;
        }
        return Integer.parseInt(result);
    }

}
