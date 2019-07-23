package com.Variable;

public class TempClass {

    int i = 5;//приметивный тип
    Object object;//обектные типы


    public static void main(String[] args){
        System.out.println(Car.MAX_SPEED);//можно не создавать екземпляр так как статитечкские поля инициализированы уже
        Car car = new Car();
        System.out.println(car.MAX_SPEED);
        car.MAX_SPEED = 320;//так мы меняем его везде
        System.out.println(car.MAX_SPEED);
    }
}
