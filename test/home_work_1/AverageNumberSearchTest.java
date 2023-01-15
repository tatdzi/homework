package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

import static java.lang.System.in;
public class AverageNumberSearchTest {




    @Test
    void averageNumber1(){
        Assertions.assertEquals(3,AverageNumberSearch.averageNumber(2,3,4));
    }
    @Test
    void averageNumber2(){
        Assertions.assertEquals(4,AverageNumberSearch.averageNumber(1,20,4));
    }
    @Test
    void averageNumber3(){
        Assertions.assertEquals(20,AverageNumberSearch.averageNumber(20,3,40));
    }
    @Test
    void enterAndChackInt(){
        int i = 3;
        Scanner in = new Scanner(System.in);
        Assertions.assertEquals(3,AverageNumberSearch.enterAndChackInt(in));
    }

}
