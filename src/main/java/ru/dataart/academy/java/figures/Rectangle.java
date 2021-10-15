package ru.dataart.academy.java.figures;

public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double Perimeter() {
        return 2*(a+b);
    }

    @Override
    public double Area() {
        return a*b;
    }
}
