// Superclass
class BoxH {
    double width, height, depth;

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

// Subclass 1
class BoxWeightH extends BoxH {
    double weight;

    void setWeight(double w) {
        weight = w;
    }
}

// Subclass 2
class ColorBoxH extends BoxH {
    String color;

    void setColor(String c) {
        color = c;
    }
}

// Main class
class HierarchicalInheritanceDemo {
    public static void main(String args[]) {

        BoxWeightH bw = new BoxWeightH();
        bw.setDim(10, 20, 15);
        bw.setWeight(25);

        ColorBoxH cb = new ColorBoxH();
        cb.setDim(5, 10, 4);
        cb.setColor("Red");

        System.out.println("BoxWeight Details:");
        System.out.println("Volume = " + bw.volume());
        System.out.println("Weight = " + bw.weight);

        System.out.println("\nColorBox Details:");
        System.out.println("Volume = " + cb.volume());
        System.out.println("Color = " + cb.color);
    }
}
