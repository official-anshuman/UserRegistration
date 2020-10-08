import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    UserValidation newUserValidation = new UserValidation();
    @Test
    public void givenFirstName_whenValid_shouldReturnTrue() {
        boolean result = newUserValidation.validateFirstAndLastName("Sample");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {
        boolean result = newUserValidation.validateFirstAndLastName("Sa");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenLastName_whenValid_shouldReturnTrue() {
        boolean result = newUserValidation.validateFirstAndLastName("Sample");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_whenShort_shouldReturnFalse() {
        boolean result = newUserValidation.validateFirstAndLastName("Sa");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_whenValid_shouldReturnTrue() {
        boolean result = newUserValidation.validateMobileNumber("91 9876543210");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_whenInvalid_shouldReturnFalse() {
        boolean result = newUserValidation.validateMobileNumber("99 10987654321");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPassword_whenValid_shouldReturnTrue() {
        boolean result = newUserValidation.validatePassword("Password@123");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_whenInvalid_shouldReturnFalse() {
        boolean result = newUserValidation.validatePassword("pass");
        Assert.assertEquals(false,result);
    }

}
