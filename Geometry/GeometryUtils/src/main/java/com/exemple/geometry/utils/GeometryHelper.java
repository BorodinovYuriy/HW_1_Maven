package com.exemple.geometry.utils;


import com.exemple.geometry.Shape;

public class GeometryHelper {

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static int compareAreas(Shape shape1, Shape shape2) {
        double area1 = shape1.calculateArea();
        double area2 = shape2.calculateArea();

        return Double.compare(area1, area2);
    }
    public static String compareShapes(Shape shape1, Shape shape2) {
        int comparisonResult = compareAreas(shape1, shape2);
        if (comparisonResult < 0) {
            return "Shape 1 has a smaller area than Shape 2";
        } else if (comparisonResult > 0) {
            return "Shape 1 has a larger area than Shape 2";
        } else {
            return "Shape 1 and Shape 2 have equal areas";
        }
    }
    public static double distanceBetweenPoints(double[] point1, double[] point2) {
        if (point1.length != 2 || point2.length != 2) {
            throw new IllegalArgumentException("Points must be 2D arrays.");
        }
        double dx = point2[0] - point1[0];
        double dy = point2[1] - point1[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}
