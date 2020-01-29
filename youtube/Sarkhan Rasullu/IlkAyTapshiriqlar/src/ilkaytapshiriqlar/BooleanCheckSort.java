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
public class BooleanCheckSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
        }
        
        System.out.println("Result of Checking proses: " + check(arr, size));
        
       

    }
    public static boolean check(int arr[],int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    return false;
                }
                else{
                    continue;
                }
            }
                    
        }
        return true;
        
    }

    








}