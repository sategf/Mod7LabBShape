/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gili.mod7labbshape;

/**
 *
 * @author Window
 */
abstract class Shape {
    abstract String getName();
}

abstract class TwoDimensionalShape extends Shape {
    abstract double getArea();
}

abstract class ThreeDimensionalShape extends Shape {
    abstract double getArea();
    abstract double getVolume();
}

class Circle extends TwoDimensionalShape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    String getName() {
        return "Circle";
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends TwoDimensionalShape {
    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    String getName() {
        return "Square";
    }

    @Override
    double getArea() {
        return side * side;
    }
}

class Triangle extends TwoDimensionalShape {
    private final double base;
    private final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    String getName() {
        return "Triangle";
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

class Sphere extends ThreeDimensionalShape {
    private final double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    String getName() {
        return "Sphere";
    }

    @Override
    double getArea() {
        return (4 * Math.PI) * radius * radius;
    }

    @Override
    double getVolume() {
        return ((4.0 / 3.0) * Math.PI) * radius * radius * radius;
    }
}

class Cube extends ThreeDimensionalShape {
    private final double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    String getName() {
        return "Cube";
    }

    @Override
    double getArea() {
        return 6 * side * side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }
}

class Tetrahedron extends ThreeDimensionalShape {
    private final double side;

    Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    String getName() {
        return "Tetrahedron";
    }

    @Override
    double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    double getVolume() {
        return (Math.sqrt(2) / 12.0) * side * side * side;
    }
}
