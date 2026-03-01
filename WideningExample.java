class WideningExample {
    public static void main(String args[]) {
        int i = 100;
        long l = i;      // automatic conversion
        float f = l;     // automatic conversion

        System.out.println("int value = " + i);
        System.out.println("long value = " + l);
        System.out.println("float value = " + f);
    }
}
