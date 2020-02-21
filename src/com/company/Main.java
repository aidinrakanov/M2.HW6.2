package com.company;

public class Main {


    public static void main(String[] args) {

        Class1<Double, Double> n1 = new Class1<>(4.0, 2.5);
        System.out.println(n1.getNum1() + " " + n1.getNum2());


        Class1 d1 = new Class1(" \uD83C\uDF1D "," \uD83C\uDF1E " );
        d1.draw();

    }
}

