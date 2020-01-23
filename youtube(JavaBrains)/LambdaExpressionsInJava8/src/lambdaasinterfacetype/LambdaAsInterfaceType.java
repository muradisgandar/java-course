/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaasinterfacetype;

/**
 *
 * @author murad_isgandar
 */
interface MyLambda {

    void foo();
}

interface MyAdd {

    int add(int a, int b);
}

public class LambdaAsInterfaceType {

    public static void main(String[] args) {

//        MyLambda myLambdaFunc = () -> System.out.println("Hello world");
//        
//        myLambdaFunc.foo();
//        
//        MyAdd adding = (int a,int b) -> a+b;  
        Example lam = () -> System.out.println("example");//interface i MyAdd,MyLambda kimi clasin ichinde yaratmaq shert deyil
        //ayri yaradilmish interface i de ishletmek olar

        // creating anonymys class
        Example innerClass = new Example() {
            @Override
            public void foo() {
                System.out.println("example");
            }
        };

        innerClass.foo();
        lam.foo();

//        System.out.println(adding.add(3, 4));
    }

}
