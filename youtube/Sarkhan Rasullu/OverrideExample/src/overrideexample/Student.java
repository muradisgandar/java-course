/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overrideexample;

/**
 *
 * @author murad_isgandar
 */
public class Student extends Person{
    
   public String birthPlace; 
    
   public Student(String name,String surname){
       super(name,surname);
   }
   @Override
   public void eatMeal(){
       System.out.println("Student is eating meal");
   }
   public void personMeal(){
       super.eatMeal();
   }
    
   public void specificToStudent(){
       System.out.println("specificToStudent");
   }
    
    
    
}
