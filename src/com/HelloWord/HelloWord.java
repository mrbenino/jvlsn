package com.HelloWord;

import com.HelloWord.newPackege.Car;

public class HelloWord {
    byte b = 0;//1 byte(256) -128 - +128
    short s = 1234;//2 byte(±65000) -32 000 - +32 000
    int i = 8124684;//4 byte(±4 000 000)
    long l = 894753853;//8 byte over9000 :)
    float f = 12.324f;//4 byte
    double d = 1234.13133;//8 byte
    boolean bool = true;//true are false
    char c = 'c';//one char

    Car car;//локальное обращение в пакет

    Object classObject;//тип - как другой клвсс

    public static void main(String[] args){

        HelloWord NewWord = new HelloWord();//новый класс

        System.out.println("HelloWord");
        System.out.println(NewWord.getBool());
        System.out.println(NewWord.sum(12, 1.23, NewWord));//передаем в метод параметрыБ поля по порядку как в конструкции функции было указано

    }
    boolean getBool(){//так мы возвращаем значения поля класса
        return  bool;
    }
    double sum(int _i, double _d, HelloWord _NewWord){//получив мы должны вернуть то что просим в заголовке функции
        double temp = _NewWord.d + _NewWord.i;

        return temp + _i + _d;
    }
    void method(){
        /*
        code
        no return
        */
    }
    int methodReturn(){//такой метод возвращает нам значения того типа который указан у нас в методе
        int _int = 12123;
        return _int;
    }

}
