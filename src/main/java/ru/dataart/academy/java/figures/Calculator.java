package ru.dataart.academy.java.figures;

public class Calculator {
    public double calculator(Figure[] figures){
        double sum=0;
        for (Figure figure:figures) {
            sum+=figure.area();
        }
        return sum;
    }
}
