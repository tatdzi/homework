package home_work_2.loops;

public class Task_1_6 {
    public static void main(String[] args) {
System.out.println("Таблица умножения");
        for (int i = 1 ; i <= 10 ; ++i){
            for (int a = 2 ; a <= 5 ; ++a){
                System.out.print("  \t"+a+" x\t"+i+"\t=\t"+(a*i)+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1 ; i <= 10 ; ++i){
            for (int a = 6 ; a <= 9 ; ++a){
                System.out.print("  \t"+a+" x\t"+i+"\t=\t"+(a*i)+" ");
            }
            System.out.println();
        }
        System.out.println(" Это\n нужно\n знать!");
    }
}
