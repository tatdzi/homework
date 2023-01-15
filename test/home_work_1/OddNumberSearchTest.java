package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddNumberSearchTest {

    OddNumberSearch obj = new OddNumberSearch();

    @Test
    void oddNumberSearchTest1(){
        Assertions.assertEquals("3 - нечетное число!",obj.oddNumberSearch(2,3));
    }
    @Test
    void oddNumberSearchTest2(){
        Assertions.assertEquals("3 - нечетное число!",obj.oddNumberSearch(3,2));
    }
    @Test
    void oddNumberSearchTest3(){
        Assertions.assertEquals("3 - нечетное число!",obj.oddNumberSearch(4,3));
    }

}
