package ru.dataart.academy.java.figures;

public class Calculator {
    public double Calculator(Figure[] figures){
        double sum=0;
        for (int f = 0; f < figures.length; f++) {
            sum=sum+figures[f].Area();
        }
        return sum;
    }
}
