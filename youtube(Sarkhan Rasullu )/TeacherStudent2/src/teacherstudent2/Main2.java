/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacherstudent2;

import java.util.Arrays;
import java.util.Scanner;
import utility2.RegistrationUtility;

/**
 *
 * @author murad_isgandar
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher2 teacher = RegistrationUtility.registerTeacher();

        RegistrationUtility.registerStudents(teacher);

        RegistrationUtility.printRegisteredTeacher(teacher);
        
        Student2 student = new Student2();

        Scanner sc = new Scanner(System.in);
        System.out.println("Search for any students among registered students / Please enter any 1.name,2.surname or 3.age");
        int a = sc.nextInt();
        if(a==1){
            System.out.println("Enter any name: ");
            String b = sc.next();
            Student2[] arr1 = RegistrationUtility.searchForNames(teacher,b,1);
            System.out.println(Arrays.toString(arr1));
            
            
        }
        else if(a==2){
            System.out.println("Enter any surname: ");
            String c = sc.next();
            Student2[] arr2 = RegistrationUtility.searchForSurnames(teacher, c,2);
            System.out.println(Arrays.toString(arr2));
        }
        else if(a==3){
            System.out.println("Enter any number: ");
            int d = sc.nextInt();
            Student2[] arr3 = RegistrationUtility.searchForInt(teacher, d);
            System.out.println(Arrays.toString(arr3));
        }
        
        
        
    }

}
