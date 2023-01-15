package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_5Test {

    @Test
    void higestFigure(){
        Assertions.assertEquals(8,Task_1_5.higestFigure(5834));
    }
    @Test
    void randTest(){
        Assertions.assertEquals(50.0,Task_1_5.randTest());
    }
    @Test
    void countHonetNumbers(){
        Assertions.assertEquals(5,Task_1_5.countHonetNumbers(23542768));
    }
    @Test
    void countOddNumbers(){
        Assertions.assertEquals(3,Task_1_5.countOddNumbers(23542768));
    }
    @Test
    void change(){
        Assertions.assertEquals(86724532,Task_1_5.change(23542768));
    }
}
