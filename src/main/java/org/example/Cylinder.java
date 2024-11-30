package org.example;

public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;
    private String name;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.name = "Cylinder";
    }

    public String getName() {
        return name;
    }

    @Override
    public double surfaceArea() {
        return (2 * Math.PI * radius * (radius + height));
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return name +
                ", radius=" + String.format("%.2f", radius) +
                ", height=" + String.format("%.2f", height) +
                ", volume=" + String.format("%.2f", volume()) +
                ", area=" + String.format("%.2f", surfaceArea()) +
                '}';
    }
}
