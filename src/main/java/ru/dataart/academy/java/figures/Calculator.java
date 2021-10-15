package ru.dataart.academy.java.figures;

public class Calculator {
    public double Calculator(Figure[] figures){
        double sum=0;
        for (Figure figure:figures) {
            sum+=figure.Area();
        }
        return sum;
    }
}
