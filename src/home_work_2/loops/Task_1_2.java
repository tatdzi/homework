package home_work_2.loops;

import java.util.Scanner;

public class Task_1_2{
    public static String format(int number){
        int number1 = number;
        String Result = "";
        while (number>0){
            int a = number % 10;
            String I = Integer.toString(a);
            Result =I+Result;
            number /= 10;
            if (number%10 == 0){
                if (number > 0) {
                    Result =" * "+Result;
                }else {
                    Result =Result+" = ";
                }
            }else {
                Result =" * "+Result;
            }
        }
        return Result+= operation(number1) ;
    }
    /**
     * Метод operation Перемножает все цифры числа
     * @param z число
     * @return Произведение цифр числа.
     */
    public static int operation(int z){
        int a;
        int result = 1;
        do {
            a = z % 10;
            result *= a;
            z /= 10;
        }while (z > 0);
        return  result;
    }
    public static String checkArgs(String a){
        try {
            Integer d = Integer.parseInt(a);
            return "Ваш аргумент : "+d;
        } catch (NumberFormatException nfe1) {
            try {
                Double.parseDouble(a);
                return "Введено не целое число";
            } catch (NumberFormatException nfe2) {
                return "Введено не число";
            }
        }
    }
}
