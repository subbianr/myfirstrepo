import java.util.Scanner;

public class MainArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        Calculator adder = new AddNumbers();
        Calculator subtractor = new SubtractNumbers();

        System.out.println("\nUsing AddNumbers and SubtractNumbers via Calculator interface:");
        System.out.println("Sum: " + adder.calculate(first, second));
        System.out.println("Difference: " + subtractor.calculate(first, second));

        System.out.println();
        new AddNumbers().showAddition(first, second);
        new SubtractNumbers().showSubtraction(first, second);

        scanner.close();
    }
}
