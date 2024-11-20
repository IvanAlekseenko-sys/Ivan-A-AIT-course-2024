package exceptions.exception_handling;

public class NoSolutionException extends Exception {

    public NoSolutionException() {
    }

    public NoSolutionException(String message){
        super(message);
    }
}
