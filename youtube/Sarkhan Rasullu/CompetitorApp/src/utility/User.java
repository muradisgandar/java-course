/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author murad_isgandar
 */
public class User {

    private static String username;
    private static String password;

    public User(String username, String password) {
        if (username.equals("Murad") && password.equals("12345")) {
            this.username = username;
            this.password = password;
            System.out.println("Successfuly login");
            System.out.println("1. Register participants/"
                    + "2. Start to competition/"
                    + "3. Logout/"
                    + "4. Exit");

        } else {
            try {
                throw new Exception();
            } catch (Exception ex) {
                System.out.println("Invalid Input!");

            }
        }

    }
    

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

}
