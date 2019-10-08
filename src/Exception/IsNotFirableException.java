package Exception;

public class IsNotFirableException extends Exception {

    public IsNotFirableException() {
        System.out.println("IsNotFirableException : this transition can't be fired.");
    }
}
