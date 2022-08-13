package home_work_2.loops;

import home_work_1.AverageNumberSearch;

import java.util.Random;
import java.util.Scanner;

public class Task_1_5 {
    public static void main(String[] args) {
        int number,result;
        double rand;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число!");
        //Проверка положительное ли число.
        if ((number = AverageNumberSearch.enterAndChackInt(in)) < 0) {
            System.out.println("Ввенное число отрицательное!" +
                    "\nПопробуйте еще раз!");
            number = AverageNumberSearch.enterAndChackInt(in);
        }
        result = higestFigure(number);
        System.out.println(result);
        rand =randTest();
        System.out.println("Вероятность четных случайных чисел : "+rand+"%");
        String c = count(number);
        System.out.println(c);
        String f =fibo(17);
        System.out.println(f);
        String d =task5(10,35,5);
        System.out.println(d);
        String C =chahge(23456789);
        System.out.println(C);

    }

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
        for (int i =0;i<1000;++i){
            int r = rand.nextInt(10);
            if (r%2==0){
                ++num;
            }
        }
        return  num/10.0;
    }

    /**
     * Метод считает четные и нечетные цифры числа.
     * @param a
     * @return
     */
    public static String count(int a){
        String result;
        int b = 0;
        int c = 0;
        while (a > 0) {
            if ((a%10)%2 == 0 ) {
                ++b;
            }else {
                ++c;
            }
            a/=10;
        }
        return result ="В числе содержится "+b+" четных и "+c+" нечетных цифр";
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
    public static String chahge(int a){
        String result="";
        while (a>0){
            result +=(a%10);
            a/=10;
        }
        return result;
    }

}
