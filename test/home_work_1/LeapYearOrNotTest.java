package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearOrNotTest {

    @Test
    void leapYearOrNot1(){
        Assertions.assertEquals("Это високосный год!",LeapYearOrNot.leapYearOrNot(2000));
    }
    @Test
    void leapYearOrNot2(){
        Assertions.assertEquals("Это високосный год!",LeapYearOrNot.leapYearOrNot(1924));
    }
    @Test
    void leapYearOrNot3(){
        Assertions.assertEquals("Это не високосный год!",LeapYearOrNot.leapYearOrNot(2001));
    }
    @Test
    void leapYearOrNot4(){
        Assertions.assertEquals("Это не високосный год!",LeapYearOrNot.leapYearOrNot(1889));
    }
}
