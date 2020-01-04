package Main;

import java.util.Scanner;
import utility.*;

/**
 *
 * @author murad_isgandar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter username: ");
            String username = sc.nextLine();
            System.out.println("Please enter password: ");
            String password = sc.nextLine();
            User user = new User(username, password);
        }

    }

}
