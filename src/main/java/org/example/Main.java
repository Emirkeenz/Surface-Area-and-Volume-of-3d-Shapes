package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Shape3DInterface> shapes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int shape = rand.nextInt(3);
            switch (shape) {
                case 0:
                    double sphereRadius = 1 + rand.nextDouble() * 9;
                    shapes.add(new Sphere(sphereRadius));
                    break;
                case 1:
                    double cubeSide = 1 + rand.nextDouble() * 9;
                    shapes.add(new Cube(cubeSide));
                    break;
                case 2:
                    double cylinderRadius = 1 + rand.nextDouble() * 9;
                    double cylinderHeight = 5 + rand.nextDouble() * 15;
                    shapes.add(new Cylinder(cylinderRadius, cylinderHeight));
                    break;
            }
        }

        for (Shape3DInterface shape : shapes) {
            if (shape instanceof Sphere) {
                Sphere sphere = (Sphere) shape;
                System.out.println("Shape: " + sphere.getName());
                System.out.println("Surface Area: " + sphere.surfaceArea());
                System.out.println("Volume: " + sphere.volume());
            } else if (shape instanceof Cylinder) {
                Cylinder cylinder = (Cylinder) shape;
                System.out.println("Shape: " + cylinder.getName());
                System.out.println("Surface Area: " + cylinder.surfaceArea());
                System.out.println("Volume: " + cylinder.volume());
            } else if (shape instanceof Cube) {
                Cube cube = (Cube) shape;
                System.out.println("Shape: " + cube.getName());
                System.out.println("Surface Area: " + cube.surfaceArea());
                System.out.println("Volume: " + cube.volume());
            }
            System.out.println();
        }
    }
}