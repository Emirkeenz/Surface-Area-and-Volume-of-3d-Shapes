package org.example;

public class Cube implements Shape3DInterface {
    private double side;
    private String name;

    public Cube(double side) {
        this.side = side;
        this.name = "Cube";
    }

    public String getName() {
        return name;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return name +
                "side=" + String.format("%.2f", side) +
                ", volume=" + String.format("%.2f", volume()) +
                ", area=" + String.format("%.2f", surfaceArea()) +
                '}';
    }
}
