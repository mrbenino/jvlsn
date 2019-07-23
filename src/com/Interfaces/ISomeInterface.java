package com.Interfaces;

interface ISomeInterface extends IOtherInterface{//интерфейс полностью абстрактен, интерфейс используеться дл описания поведени(клас же описует обьект)
    int SOME_VARABLE = 5;//переопределить ее не возможно это const
    void addTwoDigits(int one, int two);//если нечего не писать то он автоматом public abstract
}

interface IOtherInterface{//может быть strictfp
    void someMethod();
}

interface Bancable{
    void bounce();
}