import org.junit.Test;

import static org.junit.Assert.assertSame;

public class UserRegistrationTest {

    @Test
    public void  welcomeMessageTest() {
        UserRegistration userRegistration=new UserRegistration();
        String welcomeMessageResult=userRegistration.welcomeMessage("Welcome to user registration");
        assertSame("Welcome to user registration",welcomeMessageResult);
    }
    @Test
    public void userFirstNameTest() {

        boolean firstNameResult= UserRegistration.firstNameValidation("Prasanna");
        assertEquals(true, firstNameResult);
    }



}
