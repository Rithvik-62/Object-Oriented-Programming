class FloatExample {
    public static void main(String args[]) {
        float principal = 2500.0f;
        float rate = 4.5f;
        float time = 2.0f;

        float interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + interest);
    }
}
