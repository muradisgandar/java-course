/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionlar;


/**
 *
 * @author murad_isgandar
 */
public class Exceptionlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        //throw new MyException(); oz exceptionumuzu yaratmaq
        
        
        try {
          int a = 5;
          int b = 0;
          int c = a/b;
          int arr[] = {};
            System.out.println(arr[0]);
            //at exceptionlar.Exceptionlar.main(Exceptionlar.java:21)
        } catch (ArithmeticException ex) {
            StackTraceElement[] st = ex.getStackTrace();
            System.out.println(ex.getLocalizedMessage());
            for(int i=0;i<st.length;i++){
                StackTraceElement s = st[i];
                
                System.out.println(s.getClassName()+"."+s.getMethodName()+"("+
                        s.getFileName() + ":"+s.getLineNumber()+")");
            }
            
            
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("Arayi exception!!!");
        }
        catch(Exception cx){
            System.out.println("Unknown exceptions!");
        }
       
    }

}
