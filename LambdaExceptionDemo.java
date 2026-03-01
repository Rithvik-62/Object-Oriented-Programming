interface MyFunction {
    int apply(int x, int y) throws ArithmeticException;
}

public class LambdaExceptionDemo {

    public static void main(String[] args) {

        MyFunction divide = (x, y) -> {
            if (y == 0)
                throw new ArithmeticException("Division by zero");
            return x / y;
        };

        try {
            int result = divide.apply(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}