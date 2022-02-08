package exceptions;

import java.io.IOException;

public class ExceptionIO extends IOException {

    public ExceptionIO(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("INVALID EXCEPTİON");
    }
}
