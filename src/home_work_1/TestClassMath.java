package home_work_1;

public class TestClassMath {
    public static void main(String[] args) {

        System.out.println(Math.abs(-4));//Метор abs вычисляет значение по модулю

        System.out.println(Math.cos(Math.toRadians(30)));// Метод cos вычисляет косинус угла в радианах,
        //Метод toRadians необходим для перевода градусов в радианы, та же есть метод toDegrees.

        System.out.println(Math.pow(2, 2));//Метод pow (a,b) возводит число a в степень b

        System.out.println(Math.sqrt(9));//Метод sqrt извлекает квадратный корень
        System.out.println(Math.cbrt(27));//Метод cbrt извлекает кубический корень

        System.out.println(Math.random() * 10);//Метод random генерирует случайное вещественное число от 0.0 до 1.0

        int a = 4;
        int b = 5;
        int r = 6;

        if (Math.sqrt((Math.pow(a,2)+Math.pow(b,2)/2)) > r * 2){
            System.out.println("Не получится закрыть!");
        }else {
            System.out.println("Получится закрыть");
        }
    }
}
