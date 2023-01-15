package home_work_1;

import java.util.Scanner;

public class ByteInKilobyte {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Что вы хотите перевести? \nЕсли байты в килобайты пиши true \nЕсли килобайты в байты пиши false!");
        boolean whatIn = in.nextBoolean();
        double numberByte,numberKilobyte;

        if(whatIn){
            System.out.println("Введите значение в байтах!");
            numberByte = in.nextInt();
            numberKilobyte = byteInKilobyte(numberByte);
            System.out.println(numberByte+" байт, равно "+numberKilobyte+" килобайт.");
        }else {
            System.out.println("Введите значение в килобайтах!");
            numberKilobyte = in.nextInt();
            numberByte = kilobyteInByte(numberKilobyte);
            System.out.println(numberKilobyte+" килобайт, равно "+numberByte+" байт.");
        }
    }
    public static double byteInKilobyte(double number){
        return number / 1024;
    }
    public static double kilobyteInByte(double number){
        return number * 1024;
    }
}
