/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilkaytapshiriqlar;

import java.util.Scanner;

/**
 *
 * @author murad_isgandar
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        int i= fact(a);
        System.out.println("Factorial: "+i);
        
        
    }
    public static int fact(int a){
        
        if(a==0){
            return 1;
        }
        else 
            
            return a*fact(a-1);
        
        
        
        
        
    }

}
