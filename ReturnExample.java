class ReturnExample {
    static void check(int x) {
        if(x < 0)
            return;
        System.out.println("Positive number");
    }

    public static void main(String args[]) {
        check(5);
    }
}
