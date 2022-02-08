package exceptions;

// kendi exception classımız
public class InvalidAgeException extends ArithmeticException{

    public InvalidAgeException(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("INVALID EXCEPTİON");
    }
}
