package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6Solution3Test {
    ICommunicationPrinter solution3 = new Exercise6Solution3();

    @Test
    void welcomTest1() {
        assertEquals("Привет! Я тебя так долго ждал", solution3.welcom("Вася"));
    }

    @Test
    void welcomTest2() {
        assertEquals("Я тебя так долго ждал", solution3.welcom("Анастасия"));
    }
    @Test
    void welcomTest3() {
        assertEquals("Добрый день, а вы кто?", solution3.welcom("Илья"));
    }
}
