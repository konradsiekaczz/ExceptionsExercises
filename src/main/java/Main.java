import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Nurse jenny = new Nurse("Jenny", 25);

        try {
            jenny.doSomething();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("Catch my exceptions.");
        }

        jenny.testThrowingExceptions();
        jenny.testTwoThrowingExceptions();
    }
}
