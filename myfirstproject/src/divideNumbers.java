public class divideNumbers implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    public void showAddition(int a, int b) {
        System.out.println("Addition result: " + calculate(a, b));
    }
}
