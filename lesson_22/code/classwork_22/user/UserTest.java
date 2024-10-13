package classwork_22.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserTest {
    User user;

    final String email = "petr@mail.de"; //ideal email
    final String password = "123456Az!"; //ideal password

    @BeforeEach
    void setUp() {
        user = new User(email, password); // create new "fresh" object user
    }

    @Test
    void testValidEmail() {

        user.setEmail(email);
        assertEquals("petr@mail.de", user.getEmail());
    }

    @Test
    void testValidPassword() {
        assertEquals("123456Az!", user.getPassword());
    }


    @Test
    void setEmail() {
        String email = "petrmail.de"; // wrong email (no @)
        user.setEmail(email);
        assertEquals("petr@mail.de", user.getEmail()); // email didn't change

    }

    @Test
    void setEmailNoDot() {
        String email = "petr@mailde"; //wrong email (no dot)
        user.setEmail(email);
        assertEquals("petr@mail.de", user.getEmail());
    }

    @Test
    void setEmailSpaces() {
        String email = " petr@mail.de"; // wrong email (space)
        user.setEmail(email);
        assertEquals("petr@mail.de", user.getEmail());
    }

    @Test
    void setEmailShort() {
        String email = "t@m"; // wrong email (too short)
        user.setEmail(email);
        assertEquals("petr@mail.de", user.getEmail());
        System.out.println(user.getEmail());

    }

    @Test
    void setValidPasswordLength() {
        user.setPassword("1234Az!"); // 7 symbols pass
        assertEquals("123456Az!", user.getPassword());
        user.setPassword("123456123456123456123456Az!"); // 21 symbols pass
        assertEquals("123456Az!", user.getPassword());

    }

    @Test
    void setValidPasswordMinOneDigit() {
        user.setPassword("Asdfghj!");
        assertEquals("123456Az!", user.getPassword());

    }


    @Test
    void setValidPasswordOneLetterUpperCase() {
        user.setPassword("123456az!");
        assertEquals("123456Az!", user.getPassword());

    }

    @Test
    void setValidPasswordOneLetterLowerCase() {
        user.setPassword("123456AZ!");
        assertEquals("123456Az!", user.getPassword());

    }

    @Test
    void setValidPasswordOneSepcialSymbol() {
        user.setPassword("123456Az");
        assertEquals("123456Az!", user.getPassword());

    }
}