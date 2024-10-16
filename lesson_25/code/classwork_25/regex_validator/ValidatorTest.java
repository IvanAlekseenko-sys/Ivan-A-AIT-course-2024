package classwork_25.regex_validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorTest {

    @Test
    void checkCreditCardNumber() {
        assertTrue(Validator.checkCreditCardNumber("12345678")); // 8 digits
        assertTrue(Validator.checkCreditCardNumber("1234567887654321")); // 16 digits
        assertTrue(Validator.checkCreditCardNumber("1234567890"));// 10 digit
        assertFalse(Validator.checkCreditCardNumber("1234567")); // 7 digit
        assertFalse(Validator.checkCreditCardNumber("12345678876543210")); // 17 digits
        assertFalse(Validator.checkCreditCardNumber("12345678A")); // symbol
    }

    @Test
    void checkDateFormatEU() {
        assertTrue(Validator.checkDateFormatEU("26.10.2023"));
        assertTrue(Validator.checkDateFormatEU("05.10.2023"));
        assertTrue(Validator.checkDateFormatEU("31.02.2023"));
        assertFalse(Validator.checkDateFormatEU("32.02.2023"));
        assertFalse(Validator.checkDateFormatEU("15.13.2023"));
        assertFalse(Validator.checkDateFormatEU("26/02/2023"));
        assertFalse(Validator.checkDateFormatEU("5.10.2023"));
    }

    @Test
    void checkDateFormatUS() {
        // TODO Homework test for checkDateFormatUS DONE
        assertTrue(Validator.checkDateFormatUS("02.23.2024"));
        assertTrue(Validator.checkDateFormatUS("12.01.2024"));
        assertTrue(Validator.checkDateFormatUS("05.06.2024"));
        assertFalse(Validator.checkDateFormatUS("11.33.2024"));
        assertFalse(Validator.checkDateFormatUS("23.02.2024"));
        assertFalse(Validator.checkDateFormatUS("01/23/2024"));
        assertFalse(Validator.checkDateFormatUS("2.23.2024"));
    }

    @Test
    void checkPhoneNumber() {
        assertTrue(Validator.checkPhoneNumber("+08(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("08(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+108(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+8(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(1)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(01)123-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(01)1234-56789"));
    }

    @Test
    void checkLessEquals255() {
        assertTrue(Validator.checkLessEquals255("0"));
        assertTrue(Validator.checkLessEquals255("5"));
        assertTrue(Validator.checkLessEquals255("58"));
        assertTrue(Validator.checkLessEquals255("199"));
        assertTrue(Validator.checkLessEquals255("255"));
        assertFalse(Validator.checkLessEquals255("256"));
        assertFalse(Validator.checkLessEquals255("-5"));
        assertFalse(Validator.checkLessEquals255("b5"));
    }
}