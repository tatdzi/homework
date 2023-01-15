package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDivisibleOrNotTest {

    @Test
    void testDivisibleOrNotTest1(){
        Assertions.assertEquals("Число 4 делится на число 2\nЧастное равно : 2",TestDivisibleOrNot.testDivisibleOrNot(4,2));
    }
    @Test
    void testDivisibleOrNotTest2(){
        Assertions.assertEquals("Число 5 не делится на число 2\nЧастное равно : 2\nОстаток равен : 1",TestDivisibleOrNot.testDivisibleOrNot(5,2));
    }
    @Test
    void testDivisibleOrNotTest3(){
        Assertions.assertEquals("Число 5 не делится на число 3\nЧастное равно : 1\nОстаток равен : 2",TestDivisibleOrNot.testDivisibleOrNot(5,3));
    }
}
