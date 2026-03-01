public class VariableCaptureDemo {

    public static void main(String[] args) {

        int x = 5;

        Runnable runnable = () -> {
            System.out.println("Value of x inside lambda: " + x);
        };

        runnable.run();
    }
}