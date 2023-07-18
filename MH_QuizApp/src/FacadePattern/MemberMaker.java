package FacadePattern;

public class MemberMaker {
private members student;
private members teacher;
public MemberMaker() {
student = new student();
teacher = new teacher();
}

    void studentmethod() {
        throw new UnsupportedOperationException("no definition"); 
    }
    
    
    
    
    public static boolean isValid(String passwordhere) {

    if (passwordhere.length() < 8) {
        return false;
    } else {

        for (int p = 0; p < passwordhere.length(); p++) {
            if (Character.isUpperCase(passwordhere.charAt(p))) {
            }
        }
        for (int q = 0; q < passwordhere.length(); q++) {
            if (Character.isLowerCase(passwordhere.charAt(q))) {
            }
        }
        for (int r = 0; r < passwordhere.length(); r++) {
            if (Character.isDigit(passwordhere.charAt(r))) {
            }
        }
        for (int s = 0; s < passwordhere.length(); s++) {
            if (',' == passwordhere.charAt(s)  || passwordhere.charAt(s )  ==  '#') {
            } 
            }
            return true;
        }
}
    
    
}