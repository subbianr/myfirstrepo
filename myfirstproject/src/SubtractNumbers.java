public class SubtractNumbers implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }

    public void showSubtraction(int a, int b) {
        System.out.println("Subtraction result: " + calculate(a, b));
    }
}
