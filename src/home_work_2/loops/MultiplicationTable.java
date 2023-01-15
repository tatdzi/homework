package home_work_2.loops;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("С какого числа начинаем таблицу умножения?");
        int startNumber =in.nextInt();
        System.out.println("Какое максимальное количество столбцов в таблице умножения?");
        int maxCountColumnsInRow =in.nextInt();
        System.out.println("Какое количество столбцов в таблице умножения?");
        int countsClumns =in.nextInt();

        //Считаем какое количество строк необходимо:
        int countsRow = (int)Math.ceil((double)countsClumns/maxCountColumnsInRow);
        System.out.println("Таблица умножения");
        //Создаем цикл который будет заполнять строки:
        for (int i =0;i<countsRow;++i){
            //Переменная которая будет перемножаться в последнем столбце строки:
            int currentTo = startNumber+maxCountColumnsInRow+(maxCountColumnsInRow*i)-1;
            int tmp = countsClumns - (maxCountColumnsInRow * i);
            if (tmp < maxCountColumnsInRow){
                currentTo = startNumber + (maxCountColumnsInRow * i) + tmp -1;
            }
            printRow(startNumber+(maxCountColumnsInRow*i),currentTo);
            System.out.println();
        }
        System.out.println(" Это\n нужно\n знать!");
    }

    /**
     * Метод printRow печатает один ряд столбцов таблицы умножения
     * @param from от какого числа
     * @param to до какого числа
     */
    public static void printRow(int from,int to){
        for (int i = 1 ; i <= 10 ; ++i){
            for (int j = from ; j <= to ; ++j){
                System.out.print("  \t"+j+" x\t"+i+"\t=\t"+(j*i)+" ");
            }
            System.out.println();
        }
    }
}
