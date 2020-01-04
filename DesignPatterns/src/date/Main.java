package date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murad_isgandar
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("type your birthday");
        
        String dateStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        Date dateClient = sdf.parse(dateStr);
        
        Date dateMe = sdf.parse("12-02-2001");
        
        long client = dateClient.getTime();
        long me = dateMe.getTime();
        long diff = client-me;
        
        Date diffD = new Date(diff);
        
        System.out.println(diffD);
        
        
        
    }
    
    
}
