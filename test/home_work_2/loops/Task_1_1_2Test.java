package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Task_1_1_2Test {


    @Test
    void task_1_1_1Test1(){
        Assertions.assertEquals(1,Task_1_1_2.factorial(1));
    }
    @Test
    void task_1_1_1Test2(){
        Assertions.assertEquals(2,Task_1_1_2.factorial(2));
    }
    @Test
    void task_1_1_1Test3(){
        Assertions.assertEquals(6,Task_1_1_2.factorial(3));
    }
    @Test
    void task_1_1_1Test4(){
        Assertions.assertEquals(24,Task_1_1_2.factorial(4));
    }
    @Test
    void task_1_1_1Test5(){
        Assertions.assertEquals(120,Task_1_1_2.factorial(5));
    }
    @Test
    void task_1_1_1Test6(){
        Assertions.assertEquals(720,Task_1_1_2.factorial(6));
    }
    @Test
    void task_1_1_1Test7(){
        Assertions.assertEquals(5040,Task_1_1_2.factorial(7));
    }
    @Test
    void task_1_1_1Test8(){
        Assertions.assertEquals(40320,Task_1_1_2.factorial(8));
    }
    @Test
    void task_1_1_1Test9(){
        Assertions.assertEquals(362880,Task_1_1_2.factorial(9));
    }
    @Test
    void task_1_1_1Test10(){
        Assertions.assertEquals(3628800,Task_1_1_2.factorial(10));
    }
    @Test
    void task_1_1_1Test11(){
        Assertions.assertEquals(39916800,Task_1_1_2.factorial(11));
    }
    @Test
    void task_1_1_1Test12(){
        Assertions.assertEquals(479001600,Task_1_1_2.factorial(12));
    }
    @ParameterizedTest
    @ValueSource(ints = {13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40})
    void task_1_1_1Test13(int argument){
        Assertions.assertEquals(0,Task_1_1_2.factorial(argument));
    }
}
