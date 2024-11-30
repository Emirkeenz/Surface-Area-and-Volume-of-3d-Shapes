# 3D Shapes Polymorphism Project

This project demonstrates the concept of **polymorphism** in Java by modeling different 3D shapes (Sphere, Cylinder, and Cube) using a common interface `Shape3DInterface`.

## **Features**
- Implemented `Shape3DInterface` with methods for calculating:
  - Surface Area
  - Volume
- Created three shape classes (`Sphere`, `Cylinder`, and `Cube`) that implement the interface.
- Generated random dimensions for the shapes.
- Used polymorphism to store and process the shapes in a single list.

## **Polymorphism in This Project**
Polymorphism is used by:
- Declaring a list of `Shape3DInterface` references to hold objects of different shapes (Sphere, Cylinder, and Cube).
- Calling the `surfaceArea()` and `volume()` methods on these objects without needing to know their specific type at runtime.
- Allowing for flexible code that can handle any new shapes that implement `Shape3DInterface`.

Example of Polymorphic Behavior:
```java
List<Shape3DInterface> shapes = new ArrayList<>();
shapes.add(new Sphere(5));
shapes.add(new Cylinder(3, 7));
shapes.add(new Cube(4));

for (Shape3DInterface shape : shapes) {
    System.out.println("Surface Area: " + shape.surfaceArea());
    System.out.println("Volume: " + shape.volume());
}
```

## **Sample Outputs**
- Run 1:
Shape: Cylinder
Surface Area: 731.45
Volume: 1475.21

Shape: Cube
Surface Area: 532.78
Volume: 836.75

Shape: Sphere
Surface Area: 64.45
Volume: 48.65

- Run 2:
Shape: Sphere
Surface Area: 14.09
Volume: 4.97

Shape: Cube
Surface Area: 378.62
Volume: 501.28

Shape: Cylinder
Surface Area: 161.29
Volume: 101.24

## **How to run the project**
- git clone <repository-URL>
- cd 3D-Shapes-Polymorphism
- javac Main.java
- java Main

## **Future Enhancements**
- Add more shapes, such as cones or pyramids.
- Extend the project with graphical representation of the shapes.
