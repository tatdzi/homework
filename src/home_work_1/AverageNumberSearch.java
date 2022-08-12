package home_work_1;

import java.util.Scanner;

public class AverageNumberSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 разных числа через enter!");
        int a = enterAndChackInt(in);
        int b = enterAndChackInt(in);
        int c = enterAndChackInt(in);
        while (!(a != b && b != c && a != c)){
            System.out.println("Введненные числа не удовлетворяют" +
                    " требовония!\nПопробуйте еще раз!");
            a = enterAndChackInt(in);
            b = enterAndChackInt(in);
            c = enterAndChackInt(in);
        }
        int result =averageNumber(a,b,c);
        System.out.println("Среднее из трех чисел: "+result);
    }

    /**
     * Метод enterAndChackInt проверяет можно ли интерпретировать введенное значение как int.
     * и присваивает его. Если нельзя подсказывает что не так и предлагает попробовать еще раз.
     * @param input Scanner
     * @return переменная int
     */
    public static int enterAndChackInt(Scanner input) {
        while (!(input.hasNextInt())){
            if (input.hasNextDouble()){
                System.out.println("Введено не целое число");
                input.next();
            }else if (input.hasNextLine()){
                System.out.println("Введено не число");
                input.next();
            }
        }
        return input.nextInt();
    }

    /**
     * Метод averageNumber определяет какое из чисел среднее из трех РАЗНЫХ числе.
     * Если 2 и более числа будут одинаковые, метод будет работать некорректно!
     * @param a Число
     * @param b Число
     * @param c Число
     * @return Среднее из чисел.
     */
    public static int averageNumber(int a,int b, int c){
        if (a > b) {
            if (a < c) {
                return a;
            } else if (c > b) {
                return c;
            } else {
                return b;
            }
        }else if (b < c){
            return b;
        }else if (a < c){
            return c;
        }else {
            return a;
        }
    }
}
