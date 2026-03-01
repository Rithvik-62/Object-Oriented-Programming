class BooleanEvenOdd {
    public static void main(String args[]) {
        int num = 15;
        boolean isEven = (num % 2 == 0);

        if (isEven)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
