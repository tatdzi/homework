package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LitterOrSymbolTest {

    @Test
    void litterOrSymbol1(){
        Assertions.assertEquals("Вы ввели номер буквы : A",LitterOrSymbol.litterOrSymbol(65));
    }
    @Test
    void litterOrSymbol2(){
        Assertions.assertEquals("Вы ввели номер буквы : a",LitterOrSymbol.litterOrSymbol(97));
    }
}
