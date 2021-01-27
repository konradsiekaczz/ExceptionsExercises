import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRootExercise {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculateSqrtOfNumber();
    }

    public static void calculateSqrtOfNumber() {
        System.out.println("Please provide number: ");
        double userInput;
        while (true) {
            try {
                userInput = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong type of argument. Please try again.");
                sc.next();
            }
        }
        if (userInput < 0) {
            throw new IllegalArgumentException("Number must be >= 0.");
        }
        System.out.println(String.format("Square root of %.4f is %.4f ", userInput, Math.sqrt(userInput)));
    }
}
