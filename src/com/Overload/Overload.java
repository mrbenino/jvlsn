package com.Overload;

public class Overload {
    int addTwoDigits(int a, int b){//при перегрузке может меняться все кроме имени метода
        return a + b;
    }
    double addTwoDigits(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        OverloadChild overload = new OverloadChild();
        System.out.println(overload.addTwoDigits(5,6));
        System.out.println(overload.addTwoDigits(5.67878,6.54));
        overload.addTwoDigits(5);
    }
}

class OverloadChild extends Overload{
    void addTwoDigits(int i){//если мы унаследовали методы то и перегрузить мы их можем так же как и в радительском классе
        System.out.println("overload method");
    }
}