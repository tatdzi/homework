package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class ToBinaryString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от -128 до 127!");
        byte number = in.nextByte();
        String biNumber = toBinaryString(number);
        System.out.println("Число в двоичной системе : "+biNumber);
    }
    public static String toBinaryString(byte number){
        int a,i,j;
        i = number;
        j = 7;
        int[] arr =new int[8];
        String biNumber;
        if (i < 0 ){
            i = 127 + (++i + 128);
            }
        while (i != 0) {
            a = i % 2;
            arr[j] = a;
            j = j-1;
            i = i / 2;
        }
        biNumber = Arrays.toString(arr) ;
        return biNumber;
    }
}
