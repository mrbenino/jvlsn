package com.Constructor;

public class ConstructorExample {
    int i;
    ConstructorExample(){
        System.out.println("run");
    }
    ConstructorExample(String hello){
        System.out.println("run");
        System.out.println(hello);
    }
    ConstructorExample(int iValue){
        this.i = iValue;
        System.out.println("run");
    }
    ConstructorExample(String hello, int iValue){
        this.i = iValue;
        System.out.println("run");
        System.out.println(hello);
    }
}
class Run{
    public  static void main(String[] args){
        ConstructorExample constructorExample = new ConstructorExample("hello", 42);
        System.out.println(constructorExample.i);
    }
}
