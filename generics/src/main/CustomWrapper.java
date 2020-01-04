package main;

public class CustomWrapper {
    public  <E> E printAndReturn(E obj){
        System.out.println(obj);


        return obj;
    }
}
