package com.Constructor_2;

class MyParent {
    MyParent() {//отработает если в супер будет пусто
        super();
        System.out.println("MyParentConstructor NULL");
    }

    MyParent(int i) {//отработаем этот конструктор и вернемся по ирархии отрабатывая конструктор за конструктором но уже не в ходя в super(): а выполняя логику конструкторов
        super();
        System.out.println("MyParentConstructor + super(5);");
    }
}
public class ConstructorExample extends MyParent {//после этого мы попадем в следующий конструктор уже ролдителя класса

    ConstructorExample(int i) {
        super(5);//всегда вызывает другие конструкторы
        System.out.println("ConstructorExampel");
    }

    ConstructorExample() {//в нутри этого конструктора всега поумолчанию сработает super(): даже если мы его не пишем компилятор его допишет сам
        this(4);//благодаря super(); мы перешли в другой конструктор тот что с интом
        int i;
    }

    public static void main(String[] args) {
        new ConstructorExample();//первым делом мы запустим конструктор
    }
}