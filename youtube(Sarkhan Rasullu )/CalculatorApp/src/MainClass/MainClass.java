/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;

import utility.*;
import java.util.Scanner;

/**
 *
 * @author murad_isgandar
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose operation: ");
        String choose = sc.nextLine();
        if(choose.equals("calculator")){
            Calculator.calculator();
            
        }
        else if(choose.equals("email")){
            
        }
        else{
            System.out.println("Invalid operation");
           
        }
        
        
        
        
    }
    
}
