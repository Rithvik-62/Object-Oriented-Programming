class ForEachExample {
    public static void main(String args[]) {
        int nums[] = {2, 4, 6, 8};
        int sum = 0;

        for(int x : nums)
            sum += x;

        System.out.println("Sum = " + sum);
    }
}
