package com.Static;

public class StaticExmpl {
    static StaticExmpl staticExmplSt = new StaticExmpl();//любоестатическое поле будет инициализировано
    // по порядку и после всех полей запустяться статический инициалайзер при мервом обращении к классу,
    // а после инициализируеться обычные поля и о бычный конструктор
    // но мы можем обмануть конструктором запущеным как сдесь тоесть сейчас запустьяться сначала обычные поля и потом уже вес что связано с статикой

    static int i = 5;//эта переменая одна на все созданые екземпляры класса
    static int exempIterator;
    int j;
    static {
        System.out.println("static initializer");
    }
    {
        System.out.println("initializer");
    }
    StaticExmpl() {
        exempIterator++;
        System.out.println("конструктор вызван " + exempIterator + " раз(а)");
    }
    static void staticMethood(){
        System.out.println("static method");
    }

    public static void main(String[] args) {
        System.out.println(StaticExmpl.i);

        StaticExmpl staticExmpl = new StaticExmpl();
        StaticExmpl staticExmpl2 = new StaticExmpl();

        staticExmpl.j = 1;
        staticExmpl2.j = 2;
        System.out.println("j = " + staticExmpl.j);
        System.out.println("j = " + staticExmpl2.j);

        staticExmpl.i = 1;//ту мы имеем единственую возможность ее поменять для екземпляров
        System.out.println("первое определение staticExmpl.i = " + staticExmpl.i);

        staticExmpl2.i = 2;//на всегда сохраниться последняя ее инициализация при создании екземпляра и такой она станет для всех
        System.out.println("после определения staticExmpl2.i, staticExmpl.i = " + staticExmpl.i);
        System.out.println("первое определение staticExmpl2.i = " + staticExmpl2.i);
    }
}
