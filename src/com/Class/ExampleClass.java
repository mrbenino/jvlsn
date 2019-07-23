package com.Class;

public class ExampleClass {//паблик клас должен совпадать с именем файла

}
abstract class MeSecondClass{//мы не можем создать его экземпляр с помощю слова "new", абстрактные класы должны описывать поведение
    int speed;
    abstract void Run();//мы пока не знаем какую логику нам нужно сдесь создать по этому он являеться обстрактным и лиш посл есоздания класа мы получим метод
    void Stop(){
        speed = 0;
    }
}
class Ferrary extends  MeSecondClass{
    @Override
    void Run(){
        speed = 25;
    }
}
abstract class Pull extends ExampleClass{//может быть пуст и екстендить дута переопределения целого класа

}

final class MeSecondClass2{//мы не можем наследовать этот класс (используються в библеотеках), их методы не возможно переопределить class ExtendsFinalClass extends MeSecondClass2{вызовит ошибку}
    void someLogin(){
        //code
    }
}

strictfp class MeSecondClass3{//во всех его метадах будет использоваться float будет определеная точность согластно правилам(возможно для работы сденьгами но для этого енсть биг децемал)
    void method(float f){
        //code
    }
}
