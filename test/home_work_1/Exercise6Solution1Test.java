package home_work_1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Exercise6Solution1Test {


    ICommunicationPrinter solution1 = new Exercise6Solution1();


    @Test
    void welcomTest1() {
        assertEquals("Привет! Я тебя так долго ждал", solution1.welcom("Вася"));
    }

    @Test
    void welcomTest2() {
        assertEquals("Я тебя так долго ждал", solution1.welcom("Анастасия"));
    }
    @Test
    void welcomTest3() {
        assertEquals("Добрый день, а вы кто?", solution1.welcom("Илья"));
    }





}
