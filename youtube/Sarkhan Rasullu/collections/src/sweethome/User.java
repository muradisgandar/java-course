package sweethome;

import java.util.Comparator;
import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Comparator<User> comparator = new Comparator<User>(){
        @Override
            public int compare(User o1, User o2) {
            System.out.println("I am called");
                return o1.age - o2.age;//increase order
            }
        };


    @Override
    public int compareTo(User o) {
        System.out.println("user compare to");
        return comparator.compare(this,o);
    }

    @Override
    public String toString() {
        return "sweethome.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("user equals");
//        if(obj instanceof sweethome.Student){
//            sweethome.Student u = (sweethome.Student)obj;
//            return this.name.equals(u.name) && this.age == u.age;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        System.out.println("hashcode user");
//        String hash = age+"";
//        for(int i=0;i<name.length();i++){
//            char c = name.charAt(i);
//            hash+=(int)c;
//        }
//        BigInteger big = new BigInteger(hash);
//        return big.intValue();
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
