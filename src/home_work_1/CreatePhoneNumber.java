package home_work_1;

import java.util.Scanner;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 10 цифр вашего номера телефона!");
        String phoneNumber = in.nextLine();
        while (!(phoneNumber.length() == 10)){
            System.out.println("Вы ввели неверный номер!\nПопробуйте еще раз!");
            phoneNumber = in.nextLine();
        }
        char arr[] = phoneNumber.toCharArray();
        String formatPhoneNumber = createPhoneNumber(arr);
        System.out.println("Отформатированный номер имеет вид: "+formatPhoneNumber);
    }
    public static String createPhoneNumber(char[] arr){
        String formatPhoneNumber = ("("+arr[0]+arr[1]+arr[2]+") "+arr[3]+arr[4]+arr[5]+"-"+arr[6]+arr[7]+arr[8]+arr[9]);
        return formatPhoneNumber;
    }
}
