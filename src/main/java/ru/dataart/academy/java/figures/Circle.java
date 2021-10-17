package ru.dataart.academy.java.figures;

public class Circle extends Figure{
    private double r;
    public Circle(double r){
        this.r=r;
    }
    @Override
    public double perimeter() {
        return 2*Figure.PI*r;
    }

    @Override
    public double area() {
        return Figure.PI*r*r;
    }
}
