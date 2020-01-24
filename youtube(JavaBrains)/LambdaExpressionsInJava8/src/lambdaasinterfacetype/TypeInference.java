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
public class TypeInference {

    public static void main(String[] args) {

        //both of them are true
//        StringLambdaLength sl = (String s)-> s.length();
//        StringLambdaLength sl2 = s-> s.length();
//        System.out.println(sl.getLength("Salam"));





        print(s -> s.length());

    }

    private static void print(StringLambdaLength sl) {
        System.out.println(sl.getLength("Hello World"));
    }

}

interface StringLambdaLength {

    int getLength(String s);
}
