package com.Override;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

import java.io.IOException;

class Parent{
    protected int method(){// throws RuntimeException эксептион не помешает оверрайду
        return 1;
    }//static не возможно перегрузить он будет отдельным для каждого класса
}

class Child extends Parent{
    @Override
    public int method(){// throws Exception сужать ексепшены мы не можем
        //переопределеный метод должен быть с возвращаемым значением оригинала int поменять тут на double нельзя*
        return 2;
    }//protected или default можно расширять, не которые модификаторы такие как synchronized а второй втоже время strictfp
}

public class OverrideExample {
    public static void main(String[] args){//тут будет использоваться полиморфизм для переопределения метода
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.method());
        System.out.println(child.method());
    }
}