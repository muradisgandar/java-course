package main;

public class Person<T> {
    public <E> E foo(E obj){
        return obj;
    }
    public static <T> T printUser( T obj){
        System.out.println(obj);
        return null;
    }




}
