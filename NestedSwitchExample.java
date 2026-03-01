class NestedSwitchExample {
    public static void main(String args[]) {

        int count = 1;
        int target = 1;

        switch(count) {
            case 1:
                System.out.println("Outer switch: count is 1");

                switch(target) {   // nested switch
                    case 0:
                        System.out.println("Target is zero");
                        break;
                    case 1:
                        System.out.println("Target is one");
                        break;
                    default:
                        System.out.println("Invalid target");
                }
                break;

            case 2:
                System.out.println("Outer switch: count is 2");
                break;

            default:
                System.out.println("Invalid count");
        }
    }
}
