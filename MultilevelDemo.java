class BoxML {
    double width, height, depth;

    BoxML(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeightML extends BoxML {
    double weight;

    BoxWeightML(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}

class ShipmentML extends BoxWeightML {
    double cost;

    ShipmentML(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
}

class MultilevelDemo {
    public static void main(String args[]) {
        ShipmentML s = new ShipmentML(10, 20, 15, 10, 50);

        System.out.println("Volume = " + s.volume());
        System.out.println("Weight = " + s.weight);
        System.out.println("Cost = " + s.cost);
    }
}
