/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisreference;

/**
 *
 * @author murad_isgandar
 */
public class ThisReferenceExample {

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//        thisReferenceExample.doProcess(10, new Process() {
//            @Override
//            public void process(int i) {
//
//                System.out.println("Value of i is " + i);
//                System.out.println(this);//this burada Processin anonim classinin obyektini ishare edir
//            }
//            
//            @Override
//            public String toString(){
//                return "This is anonyms inner class";
//            }
//        });

//        thisReferenceExample.doProcess(10, i -> {
//            System.out.println("Value of i is " + i);
//            System.out.println(this); error verir chunki anonim class yaranmir ve this neyise ifade etmir ve
// static metodun ichinde this i chagirmaq olmaz
//        });
        thisReferenceExample.method();

    }

    private void method() {
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);//burada thisReferenceExample obyektini gosterir
        });
    }

    private void doProcess(int i, Process p) {
        p.process(i);

    }

    @Override
    public String toString() {
        return "This is class object";
    }

}

interface Process {

    void process(int i);

}
