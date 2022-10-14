package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortUtilsTest1 {
    @Test
    void bubble1(){
        int[] arr = new int[]{1,2,3,4,5,6};
        SortUtils.bubble(arr);
        int[] arrExpected = new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arrExpected,arr);
    }
    @Test
    void bubble2(){
        int[] arr = new int[]{1,1,1,1};
        SortUtils.bubble(arr);
        int[] arrExpected = new int[]{1,1,1,1};
        Assertions.assertArrayEquals(arrExpected,arr);
    }
    @Test
    void bubble3(){
        int[] arr = new int[]{9,1,5,99,9,9};
        SortUtils.bubble(arr);
        int[] arrExpected = new int[]{1,5,9,9,9,99};
        Assertions.assertArrayEquals(arrExpected,arr);
    }
    @Test
    void bubble4(){
        int[] arr = new int[]{};
        SortUtils.bubble(arr);
        int[] arrExpected = new int[]{};
        Assertions.assertArrayEquals(arrExpected,arr);
    }
    @Test
    void bubble5(){
        int[] arr = new int[]{6,5,4,3,2,1};
        SortUtils.bubble(arr);
        int[] arrExpected = new int[]{1,2,3,4,5,6};
        Assertions.assertArrayEquals(arrExpected,arr);
    }
}
