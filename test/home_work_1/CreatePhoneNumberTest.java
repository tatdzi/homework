package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreatePhoneNumberTest {

    @Test
    public void tests() {
        Assertions.assertEquals("(123) 456-7890",
                CreatePhoneNumber.createPhoneNumber(new char[] {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}));
        }

}
