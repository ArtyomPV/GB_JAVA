package personal.views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {

    String patternName = "^\\S+$";
    String patternPhoneNumber = "\\+7\\(\\d{3}\\)-\\d{3}-\\d{3}";
    Pattern pattern = Pattern.compile(patternName, Pattern.MULTILINE);
    Pattern patternPhoneNumbers = Pattern.compile(patternPhoneNumber);

    public boolean checkFirstName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }
    public boolean checkLastName(String lastName){
        Matcher matcher = pattern.matcher(lastName);
        return !matcher.find();
    }

    public boolean checkPhoneNumber(String phone){
        Matcher matcher = patternPhoneNumbers.matcher(phone);
        return !matcher.find();
    }
}
