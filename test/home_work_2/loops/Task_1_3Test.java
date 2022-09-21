package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_3Test {

    @Test
    void inDegreeTest1(){
        Assertions.assertEquals(9.0,Task_1_3.inDegree(3,2));
    }
    @Test
    void inDegreeTest2(){
        Assertions.assertEquals(1_889_568.0,Task_1_3.inDegree(18,5));
    }
    @Test
    void inDegreeTest3(){
        Assertions.assertEquals(56.25,Task_1_3.inDegree(7.5,2));
    }
    @Test
    void formatTest1(){
        Assertions.assertEquals("18.0 ^ 5 = 1 889 568,0",Task_1_3.format(18,5,1889568));
    }
    @Test
    void formatTest2(){
        Assertions.assertEquals("7.5 ^ 2 = 56,25",Task_1_3.format(7.5,2,56.25));
    }
    @Test
    void formatTest3(){
        Assertions.assertEquals("3.0 ^ 2 = 9,0",Task_1_3.format(3,2,9));
    }
}
