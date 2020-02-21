package com.company;

public class Class1 <T, S> implements Interface1 {
    private T num1;
    private S num2;


    public Class1(T num1, S num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public S getNum2() {
        return num2;
    }
}
