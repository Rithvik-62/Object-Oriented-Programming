// Superclass
class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // Method to be overridden
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// Subclass
class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Overriding show() method
    void show() {
        System.out.println("k: " + k);
    }
}

// Main class
class OverrideDemo {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show();   // calls show() of class B
    }
}
