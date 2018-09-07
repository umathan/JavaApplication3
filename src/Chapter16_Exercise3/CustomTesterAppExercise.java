
package Chapter16_Exercise3;
import java.io.*;

public class CustomTesterAppExercise {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        try {
            method3();
        } catch (TestExceptionExercise e) {
            //System.out.println("A test exception occurred.");
            System.out.println(e);
            System.out.println("Cause: " + e.getCause().toString());
        }
    }

    public static void method3() throws TestExceptionExercise {
        try {
            throw new IOException("An I/O exception occurred.");
        } catch (IOException e) {
            throw new TestExceptionExercise(e);
        }
    }
}
