package com.Method;

public class Example {
    //native пишется не на java а например на С++ и мы обращаемся к нему
    //strictfp используеться для float, вычесления в нем с определеной точностью
    //synchronized будет выполняться толкьо в одном потоке
    //abstract он не когда не может работать одновремено в final так как место исполняемой логики он закнчиваеться точкой с запятой
    //final говорим что его не возможно переопределять
    //static мы можем использовать его даже без создания екземпляра
    static int i = 5;
    static void method(int i, Object o, int ... j){
        System.out.println(i);
        System.out.println(o);
        for (int k : j) {
            System.out.println(k);
        }
    }


}
class  OtherExempal extends Example{
    public static void main(String[] args){
        Example.method(5, new Object(), 43,34534,345,34534,5345,345,345,345,345,345,345,443233);
    }
}

