package UserRegistrationTestCase;

import java.util.regex.*;

class UserRegistration {

    String welcomeMessage(String welcomeMessage)
    {
        return welcomeMessage;
    }

    public static boolean firstNameValidation(String userInputFirstName)
    {
        Pattern firstNameRegExp=Pattern.compile("(^[A-Z]{1})[a-z]{2,}");
        Matcher matchResult=firstNameRegExp.matcher(userInputFirstName);
        boolean firstNameResult=matchResult.matches();
        return firstNameResult;
    }

    public static boolean lastNameValidation(String userInputLastName)
    {
        Pattern lastNameRegExp=Pattern.compile("([A-Z]{1}[a-z]{2,}(\\s{1}){0,}[A-Z]{1}[a-z]{2,})");
        Matcher matchResult=lastNameRegExp.matcher(userInputLastName);
        boolean lastNameResult=matchResult.matches();
        return lastNameResult;
    }

    public static boolean emailValidation(String userInputEmail)
    {

        Pattern emailRegExp1=Pattern.compile("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$");
        Matcher matchResult1=emailRegExp1.matcher(userInputEmail);
        boolean emailResult1=matchResult1.matches();
        return emailResult1;
    }

    public static boolean mobileFormatValidation(String userInputMobileFormat)
    {

        Pattern mobileFormatRegExp=Pattern.compile("^[0-9]{2}\\s[0-9]{10}");
        Matcher matchResult=mobileFormatRegExp.matcher(userInputMobileFormat);
        boolean mobileFormatResult=matchResult.matches();
        return mobileFormatResult;
    }

    public static boolean minimunCharectersValidation(String userInputminEightChar)
    {

        Pattern minCharRegExp=Pattern.compile("^[A-Za-z0-9]{8,}$");
        Matcher matchResult=minCharRegExp.matcher(userInputminEightChar);
        boolean minCharResult=matchResult.matches();
        final boolean minCharResult1 = minCharResult;
        return minCharResult1;
    }

    public static boolean minimunOneUpperCaseValidation(String userInputminUpperCase)
    {

        Pattern minUpperCaseRegExp=Pattern.compile("^[A-Za-z0-9]{8,}$");
        Matcher matchResult=minUpperCaseRegExp.matcher(userInputminUpperCase);
        boolean minUpperCaseResult=matchResult.matches();
        return minUpperCaseResult;
    }

    public static boolean minimunOneNumericCaseValidation(String userInputMinNumericCase)
    {

        Pattern minNumericCaseRegExp=Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
        Matcher matchResult=minNumericCaseRegExp.matcher(userInputMinNumericCase);
        boolean minNumericCaseResult=matchResult.matches();
        return minNumericCaseResult;
    }

    public static boolean minimunOneSpecialCaseValidation(String userInputMinSpecialCase)
    {

        Pattern minSpecialCaseRegExp=Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!_%*#?&]{1})[a-zA-Z0-9@$!_%*#?&]{8,}$");
        Matcher matchResult=minSpecialCaseRegExp.matcher(userInputMinSpecialCase);
        boolean minOneSpecialCaseResult=matchResult.matches();
        return minOneSpecialCaseResult;
    }

    public String userEntryValidation(String userFirstName,String userLastName, String userEmailId, String userMobileNumber, String userPassword)
    {
        Pattern firstNameRegExp=Pattern.compile("(^[A-Z]{1})[a-z]{2,}");
        Pattern lastNameRegExp=Pattern.compile("([A-Z]{1}[a-z]{2,}(\\s{1}){0,}[A-Z]{1}[a-z]{2,})");
        Pattern emailRegExp1=Pattern.compile("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$");
        Pattern mobileFormatRegExp=Pattern.compile("^[0-9]{2}\\s[0-9]{10}");
        Pattern passwordRegExp=Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!_%*#?&]{1})[a-zA-Z0-9@$!_%*#?&]{8,}$");

        Matcher firstNameResult=firstNameRegExp.matcher(userFirstName);
        Matcher lastNameResult=lastNameRegExp.matcher(userLastName);
        Matcher emailResult=emailRegExp1.matcher(userEmailId);
        Matcher mobileResult=mobileFormatRegExp.matcher(userMobileNumber);
        Matcher passwordResult=passwordRegExp.matcher(userPassword);

        boolean isFirstNameMatched=firstNameResult.matches();
        boolean isLastNameMatched=lastNameResult.matches();
        boolean isemailIdMatched=emailResult.matches();
        boolean isMobileNumberMatched=mobileResult.matches();
        boolean isPasswordMatched=passwordResult.matches();

        if(isFirstNameMatched)
        {
            if(isLastNameMatched)
            {
                if(isemailIdMatched)
                {
                    if(isMobileNumberMatched)
                    {
                        if(isPasswordMatched)
                        {
                            System.out.println("happy");
                            return "happy";

                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("sad");
        }

        return "sad";
    }

}
