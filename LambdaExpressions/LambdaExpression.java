import java.util.function.Predicate;

public class LambdaExpression extent Exception{
    boolean checkName(String name) throws InvalidInputException
    {
        Predicate<String> matcher = n ->(n.matches("^[A-Z]{1}[A-Za-z]{2,12}$"));
        if (matcher.test(name))
            return true;
        else
            throw new InvalidInputException("plz enter name with First Letter Capital ");

    }
    boolean mobileNumber(String number) throws InvalidInputException
    {
        Predicate<String> matcher = n ->(n.matches("^[0-9]{2}\s[1-9]{1}[0-9]{9}$"));
        boolean result=matcher.test(number);
        if (result)
            return true;
        else
            throw new InvalidInputException("plz enter phone number n ths :91 1234567890: format");
    }
    boolean email(String email) throws InvalidInputException
    {
        Predicate<String> matcher = n ->(n.matches("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$"));
        boolean result=matcher.test(email);
        if (result)
            return true;
        else
            throw new InvalidInputException("email should be  like abc.xyz@gmail.com.on with xyz and .in optional ");
    }
    boolean password(String password) throws InvalidInputException
    {
        Predicate<String> matcher = n ->(n.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!_%*#?&]{1})[a-zA-Z0-9@$!_%*#?&]{8,}$"));
        boolean result=matcher.test(password);
        if (result)
            return true;
        else
            throw new InvalidInputException("password should have at minimum one uppercase and one numeric and exctly one special char ");
    }

}
