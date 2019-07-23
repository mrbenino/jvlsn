package com.Modifiers.one;

public class TestClass {
    private int i =5 ;
    protected int j = 6;//можем получить доступ при наследовании
    int k = 7;
    public int m = 8;
}

class TestModifiers{
    void method(){
        TestClass testClass = new TestClass();
        System.out.println(testClass.j);//protected int j = 6; int k = 7; public int m = 8;
    }
}