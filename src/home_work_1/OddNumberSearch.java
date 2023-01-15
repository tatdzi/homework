package home_work_1;

public class OddNumberSearch {
    public static void main(String[] args) {
        int number1,number2;
        number1 = (int)(Math.random()*100);
        System.out.println("Первое случайное число : "+number1);
        number2 = (int)(Math.random()*100);

        while (!((number1 % 2 == 0 && number2 % 2 != 0) || (number1 % 2 != 0 && number2 % 2 == 0))){
            number2 = (int)(Math.random()*100);
        }
        System.out.println("Второе случайное число : "+number2);

    }
    public String oddNumberSearch(int number1, int number2){
        if (number1 % 2 == 0){
            return number2+" - нечетное число!";
        }else {
            return number1+" - нечетное число!";
        }

    }
}
