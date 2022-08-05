package home_work_1;

public class AverageNumberSearch {
    public static void main(String[] args){
        int a = 30;
        int b = 20;
        int c = 40;

        if (a > b) {
            if (a < c) {
                System.out.println("Среднее число а = " + a);
            } else if (c > b) {
                System.out.println("Среднее число c = " + c);
            } else {
                System.out.println("Среднее число b = " + b);
            }
        }else if (b < c){
            System.out.println("Среднее число b = " + b);
        }else if (a < c){
            System.out.println("Среднее число c = " + c);
        }else {
            System.out.println("Среднее число a = " + a);
        }

    }
}
