import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        CheckedExceptions checkedExceptions = new CheckedExceptions();
        try {
            checkedExceptions.methodWithCheckedException();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally is always execute.");
        }
    }

    private void methodWithCheckedException() throws IOException {
        throw new IOException();
    }
}
