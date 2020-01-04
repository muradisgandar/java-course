package main;

public class Wrapper<T,E,Z> extends Person<T> {
    private T obj;
    private E obj2;
    private Z obj3;



    public <T> T print(T obj){
        return obj;

    }
    public T getT(){
        return obj;
    }
    public E getE(){
        return obj2;
    }
    public Z getZ(){
        return obj3;
    }



}
