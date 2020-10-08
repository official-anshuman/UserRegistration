import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class UserEmailTest {
    private String email;
    private boolean expected;
    private UserValidation userValidation;


    public UserEmailTest(String email,boolean expected) {
        this.email = email;
        this.expected=expected;
    }
    @Before
    public void initialize(){
        userValidation =new UserValidation();
    }

    @Parameters
    public static Collection input ( ) {
        return Arrays.asList ( new Object[][]
                        { { "abc@yahoo.com", true },
                        { "abc-100@yahoo.com", true }, { "abc.100@yahoo.com", true }, { "abc111@abc.com", true },
                        { "abc-100@abc.net", true }, { "abc.100@abc.com.au", true }, { "abc@1.com", true },
                        { "abc@gmail.com.com", true }, { "abc+100@gmail.com", true } , { "abc", false },
                        { "abc@.com.my", false }, { "abc123@.com", false }, { "abc123@.com.com", false },
                        { "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc@gmail.com.aa.au", false },
                        { "abc@gmail.com.1a", false }, { "abc@abc@gmail.com", false },{"abc.@gmail.com",false},
                        {"abc..2002@gmail.com",false}, {"abc123@gmail.a",false},
                        {".abc@abc.com",false}} );
    }
    @Test
    public void testUserEmail(){
        Assert.assertEquals(expected,userValidation.validateEmail(email));
    }
}
