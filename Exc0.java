// Demonstrate an uncaught exception
class Exc0 {
    public static void main(String args[]) {
        int d = 0;
        int a = 42 / d;
        System.out.println("This will not be printed.");
    }
}