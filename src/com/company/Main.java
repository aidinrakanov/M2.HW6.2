package com.company;

public class Main {


    public static void main(String[] args) {

        Class1<Integer,Integer> n1 = new Class1<>(4,5);

        System.out.println(n1.getNum1() + " " + n1.getNum2());
        n1.draw();
        n1.nums(4,6);


    }
}

