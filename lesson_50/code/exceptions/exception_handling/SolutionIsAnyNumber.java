package exceptions.exception_handling;

public class SolutionIsAnyNumber extends RuntimeException{
   //empty constructor
    public SolutionIsAnyNumber() {
    }

    public SolutionIsAnyNumber(String message) {
        super(message);
    }
}
