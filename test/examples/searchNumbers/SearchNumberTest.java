package examples.searchNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchNumberTest {

    @Test
    void searchNumber(){
        Assertions.assertEquals(4,SearchNumbers.countNumber("SAF FG dgfsh4  3 dsf dshfdh30"));
    }

    @Test
    void searchNumber1(){
        Assertions.assertEquals(4,SerchNumbersRegex.searchNumberRegEx("SAF FG dgfsh4  3 dsf dshfdh30"));
    }
}
