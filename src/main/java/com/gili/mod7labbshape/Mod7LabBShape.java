/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gili.mod7labbshape;

/**
 *
 * @author Window
 */
public class Mod7LabBShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Square(3.0);
        shapes[2] = new Triangle(4.0, 5.0);
        shapes[3] = new Sphere(2.0);
        shapes[4] = new Cube(3.0);
        shapes[5] = new Tetrahedron(4.0);

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getName());

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.println("Area: " + twoDShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Surface area: " + threeDShape.getArea());
                System.out.println("Volume: " + threeDShape.getVolume());
            }

            System.out.println();
        }
    }
}


