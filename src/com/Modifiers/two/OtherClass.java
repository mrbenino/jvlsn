package com.Modifiers.two;
import com.Modifiers.one.*;

public class OtherClass extends  TestClass{
    void method(){
        TestClass testClass = new TestClass();
        System.out.println(testClass.m);//public int m = 8;

        j = 9;//протектет как и дефолтный но приэтом мы получаем к ней доступ
    }
}
