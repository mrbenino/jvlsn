package com.InetBlock;

class Parent {
    static {//статика первой
        System.out.println("static Parent init");//будет сначала отработаны статические блоки парента потом конструктор
    }
    Parent() {//отработает конструктор и мы вызовим дальнейшую инициализацию в класе ребенка
        System.out.println("prent constructor");
    }
}
public class InetExemple extends Parent{
    static {//статика первой
        System.out.println("static init");
    }
    {//обычная всегда после статики
        System.out.println("init block");
    }
    InetExemple(){//конструктор последним вызовится
        super();//вызовим конструктор перентса
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        new InetExemple();
    }
}
