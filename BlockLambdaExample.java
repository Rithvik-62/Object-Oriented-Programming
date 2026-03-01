import java.util.function.IntBinaryOperator;

public class BlockLambdaExample {

    public static void main(String[] args) {

        IntBinaryOperator add = (a, b) -> {
            int result = a + b;
            System.out.println("Adding " + a + " and " + b + ": " + result);
            return result;
        };

        int sum = add.applyAsInt(5, 3);
        System.out.println("Sum: " + sum);
    }
}