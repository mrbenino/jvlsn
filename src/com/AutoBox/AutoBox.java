package com.AutoBox;

import java.util.List;

public class AutoBox {
    public static void main(String[] args) {
        //приметивы хранят сообсвеное значение
        int i;
        byte b;
        short s;
        long l;
        boolean bl;
        char ch;
        float f;
        double d;
        //обертки для приметивов
        Byte _byte;
        Short _short;
        Integer _integer;
        Boolean _boolean;
        Character _character;
        Float _float;
        Double _double;

        List<Integer> list;
        int j = new Integer("5");//конвертируем сторку в приметив

        Integer _r = new Integer("5");

        Integer r = new Integer(5);

        int jdr = r.parseInt("5");
        int jer = r.valueOf("5");
        short fyts = r.shortValue();






    }

    Object method(){
        return  1;//вернет обект интеджер в обвертке
    }
}
