interface Operation {
    int operate(int a, int b);
}

class Calculator {
    public int calculate(Operation operation, int x, int y) {
        return operation.operate(x, y);
    }
}

public class LambdaArgumentDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.calculate((a, b) -> a + b, 5, 3);

        System.out.println("Result of addition: " + result);
    }
}