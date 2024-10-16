package classwork_25.regex_validator;

public class Validator {

    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str) {
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU - dd.MM.yyyy
    public static boolean checkDateFormatEU(String str) {
        // TODO Homework checkDateFormatEU DONE
        return str.matches("\\s*(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.[12][0-9]{3}\\s*");

    }

    // DateFormatUS - MM-dd-yyyy or MM.dd.yyyy
    public static boolean checkDateFormatUS(String str) {
        // TODO Homework checkDateFormatUS DONE
        return str.matches("\\s*(0[1-9]|1[0-2])[.-](0[1-9]|[12][0-9]|3[01])[.-][12][0-9]{3}\\s*");
    }

    // PhoneNumber
    public static boolean checkPhoneNumber(String str) {
        // TODO Homework checkPhoneNumber DONE
        return str.matches("\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}");
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str) {
        // TODO Homework checkLessEquals255 DONE
        return str.matches("^(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])$");

    }

}