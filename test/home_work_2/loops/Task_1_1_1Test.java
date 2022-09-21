package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Task_1_1_1Test {

    @Test
    void task_1_1_1Test1(){
        Assertions.assertEquals(1,Task_1_1_1.countFactorial(1));
    }
    @Test
    void task_1_1_1Test2(){
        Assertions.assertEquals(2,Task_1_1_1.countFactorial(2));
    }
    @Test
    void task_1_1_1Test3(){
        Assertions.assertEquals(6,Task_1_1_1.countFactorial(3));
    }
    @Test
    void task_1_1_1Test4(){
        Assertions.assertEquals(24,Task_1_1_1.countFactorial(4));
    }
    @Test
    void task_1_1_1Test5(){
        Assertions.assertEquals(120,Task_1_1_1.countFactorial(5));
    }
    @Test
    void task_1_1_1Test6(){
        Assertions.assertEquals(720,Task_1_1_1.countFactorial(6));
    }
    @Test
    void task_1_1_1Test7(){
        Assertions.assertEquals(5040,Task_1_1_1.countFactorial(7));
    }
    @Test
    void task_1_1_1Test8(){
        Assertions.assertEquals(40320,Task_1_1_1.countFactorial(8));
    }
    @Test
    void task_1_1_1Test9(){
        Assertions.assertEquals(362880,Task_1_1_1.countFactorial(9));
    }
    @Test
    void task_1_1_1Test10(){
        Assertions.assertEquals(3628800,Task_1_1_1.countFactorial(10));
    }
    @Test
    void task_1_1_1Test11(){
        Assertions.assertEquals(39916800,Task_1_1_1.countFactorial(11));
    }
    @Test
    void task_1_1_1Test12(){
        Assertions.assertEquals(479001600,Task_1_1_1.countFactorial(12));
    }
    @ParameterizedTest
    @ValueSource(ints = {13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40})
    void task_1_1_1Test13(int argument){
        Assertions.assertEquals(0,Task_1_1_1.countFactorial(argument));
    }

    @Test
    void formatTest1(){
        Assertions.assertEquals("1 * 2 = 2",Task_1_1_1.format(2));
    }
    @Test
    void formatTest2(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120",Task_1_1_1.format(5));
    }
    @Test
    void checkArgsTest1(){
        Assertions.assertEquals(true,Task_1_1_1.checkArgs("5"));
    }
    @Test
    void checkArgsTest2(){
        Assertions.assertEquals(false,Task_1_1_1.checkArgs("5.9"));
    }
    @Test
    void checkArgsTest3(){
        Assertions.assertEquals(false,Task_1_1_1.checkArgs("dgh"));
    }
    @Test
    void checkArgsTest4(){
        Assertions.assertEquals(false,Task_1_1_1.checkArgs(""));
    }
}
