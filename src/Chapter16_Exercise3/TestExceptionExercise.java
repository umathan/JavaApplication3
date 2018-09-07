package Chapter16_Exercise3;

public class TestExceptionExercise extends Exception{
     public TestExceptionExercise() {
    }

    public TestExceptionExercise(String message) {
        super(message);
    }

    public TestExceptionExercise(Throwable cause) {
        super(cause);
    }
    
    
}
