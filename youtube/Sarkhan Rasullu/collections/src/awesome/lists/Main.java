package awesome.lists;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Student user = new Student();
//        user.age = 1;
//
//        Student user2 = new Student();
//        user.age = 2;
//
//
//        System.out.println(user.compareTo((user2)));

        Comparator<User> compar = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                User u1 = (User) o1;
                User u2 = (User) o2;
                int result = 0;
                if (u1.age == u2.age) {
                    result = 0;
                } else if (u1.age > u2.age) {
                    result = 1;
                } else if (u1.age < u2.age) {
                    result = -1;
                }

                return result;

            }

        };

//        System.out.println(compar.compare(4, 5));

        List<User> list = Arrays.asList(new User(3), new User(1), new User(4), new User(5));

        for (User u : list) {
            System.out.println(u.age);
        }

        Collections.sort(list, compar);


        for (User u : list) {
            System.out.println(u.age);
        }


    }
}
