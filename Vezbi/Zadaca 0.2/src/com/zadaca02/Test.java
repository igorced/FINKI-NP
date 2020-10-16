package com.zadaca02;

public class Test {
    private int a;
    private float b;
    private String c;

    public Test(int a, float b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Test(float b, String c) {
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
