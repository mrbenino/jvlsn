package com.Enums;

public class EnumsExample {
    enum CoffeSize {SMALL(100), MEDIUM(200), BIG(300){// так же можно написать свое тело
        String getCoffeClass(){//переопределили один метод хотя унаследовали все остальные
            return "B";
        }
    };
        String coffeClass = "A";
        int milliliters;//переменые и поля можно создать тут
        CoffeSize(int milliliters){//так же можно создать конструкторы
            this.milliliters = milliliters;
        }
        int getMilliliters(){//гетеры и сеторы тоже
            return milliliters;
        }
        String getCoffeClass() {
            return coffeClass;
        }
    };//это будет перечесление параметров не важно какие значения гне может быть определен в методе

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.SMALL;
        System.out.println(coffeSize);
        System.out.println(coffeSize.getMilliliters());
        System.out.println(coffeSize.getCoffeClass());
    }
}
