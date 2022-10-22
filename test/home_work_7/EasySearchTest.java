package home_work_7;

import home_work_7.searchers.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest {
    private EasySearch easySearch = new EasySearch();
    @Test
    void searchTest1(){
        Assertions.assertEquals(0,easySearch.search("привет, как дела!","пока"));
    }
    @Test
    void searchTest2(){
        Assertions.assertEquals(0,easySearch.search("привет;какдела!","пока"));
    }
    @Test
    void searchTest3(){
        Assertions.assertEquals(0,easySearch.search("как дела!.Что делаешь?","пока"));
    }
    @Test
    void searchTest4(){
        Assertions.assertEquals(0,easySearch.search("Привет-привет","пока"));
    }
    @Test
    void searchTest5(){
        Assertions.assertEquals(0,easySearch.search("Привет -привет","пока"));
    }
    @Test
    void searchTest6(){
        Assertions.assertEquals(0,easySearch.search("4-х","пока"));
    }
    @Test
    void searchTest7(){
        Assertions.assertEquals(0,easySearch.search("один и 1","пока"));
    }
    @Test
    void searchTest8(){
        Assertions.assertEquals(0,easySearch.search("бабушка бабушке бабушку","пока"));
    }
}
