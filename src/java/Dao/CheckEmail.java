/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author ASUS
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckEmail {
    private static Pattern pattern;
	private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";// cấu trúc 1 email thông thường
 
    public CheckEmail() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
 
    // Class kiểm định dạng email
    public boolean validate(final String hex) {
 
        matcher = pattern.matcher(hex);
        return matcher.matches();
 
    }
}
