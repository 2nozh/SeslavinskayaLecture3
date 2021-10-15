package ru.dataart.academy.java.figures;

public class Circle extends Figure{
    private double r;

    public Circle(double r){
        this.r=r;
    }
    @Override
    public double Perimeter() {
        return 2*Figure.PI*r;
    }

    @Override
    public double Area() {
        return Figure.PI*r*r;
    }
}
