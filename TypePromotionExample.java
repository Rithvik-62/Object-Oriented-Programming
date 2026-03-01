class TypePromotionExample {
    public static void main(String args[]) {
        byte b = 10;
        float f = 5.5f;

        float result = f * b;   // byte promoted to float
        System.out.println("Result = " + result);
    }
}
