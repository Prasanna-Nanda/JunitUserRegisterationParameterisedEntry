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

    @Test
    public void userLastNameTest() {
        boolean lastNameResult = UserRegistration.lastNameValidation("Prasanna Nanda");
        assertEquals(true, lastNameResult);
    }

    @Test
    public void  userEmailTest(){
        boolean emailResult=UserRegistration.emailValidation("abc.xyz@bl.co.in");
        assertEquals(true, emailResult);
    }

    @Test
    public void  userMobileFormatTest(){
        boolean mobileResult=UserRegistration.mobileFormatValidation("91 9030688719");
        assertEquals(true, mobileResult);
    }
    @Test
    public void userMinEightCharectersTest(){

        boolean minCharResult=UserRegistration.minimunCharectersValidation("dESKtop89"); 
        assertEquals(true, minCharResult);
    }
}
