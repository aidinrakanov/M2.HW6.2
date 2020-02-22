package com.company;

public class Class1 <T extends Number, S extends Number> implements Drawable<T, S> {
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


    @Override
    public void draw() {
        System.out.println(num1 +" "+num2);
    }

    @Override
    public void nums(T num1, S num2) {
        int sum = num1.intValue()+num2.intValue();
        System.out.println("Summa = "+sum);
    }
}
