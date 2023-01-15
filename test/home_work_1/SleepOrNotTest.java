package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SleepOrNotTest {

    @Test
    void sleepIn1(){
        Assertions.assertEquals(true,SleepOrNot.sleepIn(true,true));
    }
    @Test
    void sleepIn2(){
        Assertions.assertEquals(false,SleepOrNot.sleepIn(true,false));
    }
    @Test
    void sleepIn3(){
        Assertions.assertEquals(true,SleepOrNot.sleepIn(false,true));
    }
    @Test
    void sleepIn4(){
        Assertions.assertEquals(true,SleepOrNot.sleepIn(false,false));
    }
}
