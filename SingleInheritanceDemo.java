class A1 {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B1 extends A1 {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }
}

class SingleInheritanceDemo {
    public static void main(String args[]) {
        B1 obj = new B1();
        obj.i = 10;
        obj.j = 20;
        obj.k = 30;

        obj.showij();
        obj.showk();
    }
}
