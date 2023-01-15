package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ByteInKilobyteTest {

    @Test
    void byteInKilobyteTest1(){
        Assertions.assertEquals(1.0,ByteInKilobyte.byteInKilobyte(1024));
    }
    @Test
    void byteInKilobyteTest2(){
        Assertions.assertEquals(2.9296875,ByteInKilobyte.byteInKilobyte(3000));
    }
    @Test
    void kilobyteInByteTest(){
        Assertions.assertEquals(2048.0,ByteInKilobyte.kilobyteInByte(2));
    }
}
