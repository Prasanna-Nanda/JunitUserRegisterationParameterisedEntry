import UserRegistration.UserRegistration;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;


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

    @Test
    public void  userMinOneUpperCase(){

        boolean minOneUpperCaseResult=UserRegistration.minimunOneUpperCaseValidation("deskTop89");
        assertEquals(true, minOneUpperCaseResult);
    }

    @Test
    public void  userMinOneNumericCase(){

        boolean minOneNumericCaseResult=UserRegistration.minimunOneNumericCaseValidation("Desktop12789");
        assertEquals(true, minOneNumericCaseResult);
    }
    @Test
    public void  userMinOneSpecialCase(){

        boolean minOneSpecialCaseResult=UserRegistration.minimunOneSpecialCaseValidation("Desktop@#12789");
        assertEquals(true, minOneSpecialCaseResult);
    }

    @Test
    public void  userEntryValidationTest(){

        UserRegistration userRegistration=new UserRegistration();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName=scanner.nextLine();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter Last name:");
        String lastName=scanner1.nextLine();

        Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter Email");
        String emailId=scanner2.nextLine();

        Scanner scanner3=new Scanner(System.in);
        System.out.println("Enter Mobile Number:");
        String mobileNumber=scanner3.nextLine();

        Scanner scanner4=new Scanner(System.in);
        System.out.println("Enter Password:");
        String password=scanner4.nextLine();

        String userValidation=userRegistration.userEntryValidation(firstName,lastName,emailId,mobileNumber,password);
        assertEquals("happy", userValidation);
    }
     @Test
    public void NameTest() {
            try {
            try {
                ParameterisedEntry name = new ParameterisedEntry();
                boolean output = name.name1("Bells");
                assertTrue(output);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void EmailIdTest() {
        try
        {    try
        {
            ParameterisedEntry newEmail = new ParameterisedEntry();
            boolean output = newEmail.email1("abc1234@gmail.com");
            assertTrue(output);
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        }
        catch(InvalidInputException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void  MobileTest(){
        try
        {    try
        {
            ParameterisedEntry phoneNumber = new ParameterisedEntry();
            boolean output = phoneNumber.mobileNumber1("91 1204356789");
            assertTrue(output);
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        }
        catch(InvalidInputException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void  PasswordTest(){
        try
        {    try
        {
            ParameterisedEntry passWord = new ParameterisedEntry();
            boolean output = passWord.password1("Thomas#2@87B");
            assertTrue(output);
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        }
        catch(InvalidInputException e)
        {
            e.printStackTrace();
        }
    }

}
