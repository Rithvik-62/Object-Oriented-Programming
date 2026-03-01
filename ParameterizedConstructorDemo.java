class BoxParam {
    double width, height, depth;

    // Parameterized constructor
    BoxParam(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class ParameterizedConstructorDemo {
    public static void main(String args[]) {
        BoxParam b1 = new BoxParam(10, 20, 15);
        BoxParam b2 = new BoxParam(3, 6, 9);

        System.out.println("Volume of Box 1 = " + b1.volume());
        System.out.println("Volume of Box 2 = " + b2.volume());
    }
}
