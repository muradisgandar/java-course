/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders5;

import java.util.Scanner;

/**
 *
 * @author murad_isgandar
 */
public class Ders5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which symbol do you want?");
        String str = sc.nextLine();
        System.out.println("How many times this symbol is printed?");
        int a = sc.nextInt();
        //print(a);ashagida 1 ci meseleye input budu
        //print1(a);ashagida 2 ci meseleye input budu
        //print2(a,str);ashagida 3 cu meseleye input budu
    }

//    public static void print(int a) {
//        for (int i = 1; i <= a; i++) {
//            for (int j = 0; j < i; j++) {
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//    public static void print1(int b) {
//        for (int i = 1; i <= b; i++) {
//            for (int k = 0; k < b - i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//    public static void print2(int b,String s) {
//        for (int i = 1; i <= b; i++) {
//            for (int k = 0; k < b - i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(s+" ");
//            }
//            System.out.println();
//        }
//
//    }

}
