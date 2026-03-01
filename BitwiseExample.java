class BitwiseExample {
    public static void main(String args[]) {
        int a = 42;   // 101010
        int b = 15;   // 001111

        System.out.println(a & b);  // AND
        System.out.println(a | b);  // OR
        System.out.println(a ^ b);  // XOR
        System.out.println(a >> 2); // Right shift
    }
}
