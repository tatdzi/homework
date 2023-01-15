package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {
    private DoWhileOperation doWhileOperation = new DoWhileOperation();
    @Test
    void allElementsTest(){
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5},doWhileOperation.allElements(new int[]{1,2,3,4,5}));
    }
    @Test
    void eachSecondElementsTest(){
        Assertions.assertArrayEquals(new int[]{1, 3, 5},doWhileOperation.eachSecondElements(new int[]{1,2,3,4,5}));
    }
    @Test
    void eachSecondElementsTest2(){
        Assertions.assertArrayEquals(new int[]{1, 3, 5},doWhileOperation.eachSecondElements(new int[]{1,2,3,4,5,6}));
    }
    @Test
    void elementsInReverseOrder(){
        Assertions.assertArrayEquals(new int[]{5, 4, 3, 2, 1},doWhileOperation.elementsInReverseOrder(new int[]{1,2,3,4,5}));
    }
}
