package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_2Test {

    @Test
    void operationTest1(){
        Assertions.assertEquals(24,Task_1_2.operation(234));
    }
    @Test
    void operationTest2(){
        Assertions.assertEquals(10_080,Task_1_2.operation(181232375));
    }
    @Test
    void formatTest1(){
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080",Task_1_2.format(181232375));
    }
    @Test
    void formatTest2(){
        Assertions.assertEquals("2 * 3 * 4 = 24",Task_1_2.format(234));
    }
    @Test
    void checkArgsTest1(){
        Assertions.assertEquals("Ваш аргумент : 5",Task_1_2.checkArgs("5"));
    }
    @Test
    void checkArgsTest2(){
        Assertions.assertEquals("Введено не целое число",Task_1_2.checkArgs("99.2"));
    }
    @Test
    void checkArgsTest3(){
        Assertions.assertEquals("Введено не число",Task_1_2.checkArgs("Привет"));
    }
    @Test
    void checkArgsTest4(){
        Assertions.assertEquals("Введено не число",Task_1_2.checkArgs(""));
    }
}
