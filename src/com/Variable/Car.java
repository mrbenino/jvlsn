package com.Variable;

public class Car {
    int maxSpeed;//есть модификаторы которые мы можем применить к приметивам
    // final (мы должны сразу задать значение и этот модификатор делает ее константой можно задать в конструкторе)
    static int MAX_SPEED = 240; // static (одно на все классы, в памяти выделитьс одно место, часто сразу final)
    // transient (данае поле не будет участвовать в сериализации)
    // volatile (многопоточность,пометить что ее нельзя использовать на пряму а не кешированую)
    Magnitophon magnitophon;
    void method(){
        int i;//тут всегда нужно самому инициализировать переменую
        final int j = 4;//к полям метода в класе можено применить только такой модификатор
    }
}