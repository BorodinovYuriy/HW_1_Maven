package com.exemple.app;


import com.exemple.geometry.Circle;
import com.exemple.geometry.Rectangle;
import com.exemple.geometry.Triangle;
import com.exemple.geometry.utils.GeometryHelper;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты фигур
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(8, 12);
        Triangle triangle = new Triangle(5, 5, 8);

        // Выводим информацию о фигурах
        System.out.println("--- Круг ---");
        System.out.println(circle.toString());
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println();

        System.out.println("--- Прямоугольник ---");
        System.out.println(rectangle.toString());
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
        System.out.println();

        System.out.println("--- Треугольник ---");
        System.out.println(triangle.toString());
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
        System.out.println();

        // Используем GeometryHelper
        double inches = 10;
        double centimeters = GeometryHelper.inchesToCentimeters(inches);
        System.out.println(inches + " inches is " + centimeters + " centimeters");

        double cm = 20;
        double inch = GeometryHelper.centimetersToInches(cm);
        System.out.println(cm + " centimeters is " + inch + " inches");
        System.out.println();

        System.out.println("Comparison of Circle and Rectangle");
        System.out.println(GeometryHelper.compareShapes(circle, rectangle));

        System.out.println("Comparison of Triangle and Circle");
        System.out.println(GeometryHelper.compareShapes(triangle,circle));

        double[] point1 = {1,2};
        double[] point2 = {4,6};
        System.out.println("Расстояние между точками " + point1[0] + ", " + point1[1] +  " и " + point2[0] + ", " + point2[1] + " равно " +  GeometryHelper.distanceBetweenPoints(point1,point2));
    }
}
