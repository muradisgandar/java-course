package awesome.lists;


public class User  {

    public int age;
    private User user;

    public User(int age){
        this.age = age;
    }

    // for using compareTo() method we  must implement Comparable interface

//    @Override
//    public int compareTo(Student o) {
//        int result = 0;
//        if (o.age == this.age) {
//            result = 0;
//        } else if (o.age > this.age) {
//            result = 1;
//        } else if (o.age < this.age) {
//            result = -1;
//        }
//
//        return result;
//
//    }
}
