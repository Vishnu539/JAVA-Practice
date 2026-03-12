package org.example;

public class CalculateArea {
    public int square(int a){
        return a * a;
    }

    public int rectangle(int l, int b){
        return l * b;
    }

    public int circle(int r){
        return (int) 3.14 * r * r; // 3.14 = value of pi
    }
}
