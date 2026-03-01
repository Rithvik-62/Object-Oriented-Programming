class LogicalExample {
    public static void main(String args[]) {
        int num = 20, denom = 2;

        if(denom != 0 && num / denom > 5)
            System.out.println("Valid division");
        else
            System.out.println("Invalid division");
    }
}
