package home_work_1;

public class PriorityOperations {
    public static void main(String[] args) {
        int c,d,e,f,g,h;
        boolean i,j;

        c = 5 + 2 / 8;
        System.out.println(c); /* Первой операцией по приоритетности выполныется деление,
        результатом деления целочисленных переменных 2/8=0 (целочисленные переменные деляться без остатка
        затем сложение 5+0=5*/

        d = ( 5 + 2 ) / 8;
        System.out.println(d); /* Первой операцией по приоритетности будет сложение в скобках
        затем деление как и в редыдущем случае 7/8=0*/

        int a = 2;
        e = ( 5 + a++) / 8;
        System.out.println(e); /* Результат будет такой же как и в предыдущем примере т.к.
        оператор ++ выполнится после сложения */

        a = 2;
        int b = 8;
        f = ( 5 + a++) / --b;
        System.out.println(f); //Результатом будет 1 т.к. b уменьшится на 1 до действия с ним.

        a = 2;
        b = 8;
        g = (5 * 2 >> a++) / --b;
        System.out.println(g);/* Первое по приоритету умножение в скобках,
        затем бинарный оператор  >> который число полученной слева = 10 в двоичной системе 0 0 0 0  1 0 1 0
        смещает на количество бит a вправо  0 0 0 0  0 0 1 0 = 2 , потом деление на 7. Результат 0*/

        a = 2;
        b = 8;
        h = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;
        System.out.println(h);/* Тернарный оператор результат выражения
        5+7>20 false значит берем выражение после : которое равно 11 и делим на 7. Результат 1*/

        // a = 2;
        //b = 8;
        // System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b);
        /* Будет ошибка компилятора т к до : 68 >= 68 тип переменной boolean а дальше идет деление на
        целочисленный тип int что невозможно. По логике конкретного примера мы в ветку true  не попадем
        и результат будет как в предыдущем примере*/

        i = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(i);/* Результат false так как если один из операндов false
         то результат будет false*/

        j = true && false;
        System.out.println(j);// Аналагично предыдущему примеру
    }
}