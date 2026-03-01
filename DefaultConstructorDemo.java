class BoxDefault {
    double width, height, depth;

    // Default constructor
    BoxDefault() {
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class DefaultConstructorDemo {
    public static void main(String args[]) {
        BoxDefault b1 = new BoxDefault();
        System.out.println("Volume = " + b1.volume());
    }
}
