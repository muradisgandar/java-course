/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilkaytapshiriqlar;

/**
 *
 * @author murad_isgandar
 */
public class LowetToUpper {

    public static void main(String[] args) {
        String result = "HeLLo WorlD";
        check(result);

    }

    public static void check(String a) {
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            char c2 = c;
            if (c >= 65 && c <= 90) {
                c2 += 32;
            } else if (c >= 97 && c <= 122) {
                c2 -= 32;
            }
            a = a.replaceFirst(c + "", c2 + "");

        }
        System.out.println(a);

    }

}
