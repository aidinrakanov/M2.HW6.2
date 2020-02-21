package com.company;

public class Class1 <T, S> implements Drawable {
    private T num1;
    private S num2;
    private String sun;
    private String moon;



    public Class1(T num1, S num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Class1(String sun, String moon) {
        this.sun = sun;
        this.moon = moon;
    }

    public T getNum1() {
        return num1;
    }

    public S getNum2() {
        return num2;
    }

    public String getSun() {
        return sun;
    }

    public String getMoon() {
        return moon;
    }

    @Override
    public void draw(){
        System.out.println(getMoon() + getSun() );
        return;
    }
}
