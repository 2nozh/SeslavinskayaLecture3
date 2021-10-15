package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {

        System.out.println("Task for Java OOP");
        Figure circle1 = new Circle(5.9);
        Figure rectangle1 = new Rectangle(3.7,5.3);
        Figure circle2 = new Circle(7);
        Figure rectangle2 = new Rectangle(6,9);

        Figure[] figureArray = new Figure[]{circle1,circle2,rectangle1,rectangle2};
        Calculator calculator=new Calculator( );
        double sum = calculator.Calculator(figureArray);
        System.out.println(sum);

    }
}