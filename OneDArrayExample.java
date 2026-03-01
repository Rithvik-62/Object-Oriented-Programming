class OneDArrayExample {
    public static void main(String args[]) {

        int month_days[] = new int[12];

        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;   // April

        System.out.println("April has " + month_days[3] + " days.");

        int auto_array[] = {31, 28, 31, 30, 31};
        System.out.println("Array length = " + auto_array.length);
    }
}
