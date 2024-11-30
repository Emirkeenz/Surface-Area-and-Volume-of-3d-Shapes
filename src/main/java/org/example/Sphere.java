package org.example;

public class Sphere implements Shape3DInterface {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double volume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere {" +
                "radius=" + String.format("%.2f", radius) +
                ", volume=" + String.format("%.2f", volume()) +
                ", area=" + String.format("%.2f", surfaceArea()) +
                '}';
    }
}
