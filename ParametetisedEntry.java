import UserRegistration.UserRegistration;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ParameterisedEntry {
    public boolean email1(String s) {
        return false;
    }

    public boolean name1(String bells) {
        return false;
    }

    public boolean mobileNumber1(String s) {
        var b = false;
        return b;
    }

    public boolean password1(String s) {
        return false;
    }

    @RunWith(Parameterized.class)
    public static class ParameterisedTest {
        private String email;
        private Boolean expectedResult;
        private UserRegistration validation;

        @Before
        public void intialize() {
            validation = new UserRegistration();
        }

        public ParameterisedTest(String email, boolean expectedResult) {
            this.email = email;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Collection input() {

            return Arrays.asList(new Object[][]{
                    {"abc@yahoo.com", true}, {"abc.100@abc.com.au", true}, {"abc@gmail.com.com", true},
                    {"abc-100@yahoo.com", true}, {"abc@1.com", true}, {"abc+100@gmail.com", true},
                    {"abc.100@yahoo.com", true}, {"abc-100@abc.net", true}, {"abc111@abc.com", true},
                    {"abc..2002@gmail.com", false}, {"abc@.com.my", false}, {"abc123@.com", false}, {"abc123@gmail.a", false},
                    {"abc123@.com.com", false}, {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false},
                    {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false},

            });

        }

        public ParameterisedTest() {
        }


        public void email1(String s) {
        }

        public void name1(String bells) {
        }

        public void mobileNumber1(String s) {
        }

        public void password1(String s) {
        }
    }
}
