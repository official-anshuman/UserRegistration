import java.util.regex.Pattern;

public class UserValidation {
    private final String NAME_REGEX = "^([A-Z])([a-zA-Z]{2,})$";
    private final String EMAIL_REGEX = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}\\.[a-zA-Z]{1,}\\.?[a-zA-Z]{1,}";
    private final String MOBILE_REGEX = "^[0-9+]{1,3}[\\s][0-9]{10}$";
    private final String PASSWORD_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&\\*])(?=.*[a-zA-Z]).{8,}$";
    public  boolean validateFirstAndLastName(String name) {
        return patternValidator(name,NAME_REGEX);
    }
    public boolean validateEmail(String email){
        return patternValidator(email,EMAIL_REGEX);
    }
    public boolean validateMobileNumber(String mobileNumber){
        return patternValidator(mobileNumber,MOBILE_REGEX);
    }
    public boolean validatePassword(String password){
        return patternValidator(password,PASSWORD_REGEX);
    }
    public boolean patternValidator(String input,String regex){
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(input).matches();
    }
}
