class OverloadDemo {

    // Method with no parameters
    void test() {
        System.out.println("No parameters");
    }

    // Method with one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Method with two integer parameters
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // Method with double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String args[]) {

        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();                // calls test()
        ob.test(10);              // calls test(int)
        ob.test(10, 20);          // calls test(int, int)
        result = ob.test(123.25); // calls test(double)

        System.out.println("Result: " + result);
    }
}
