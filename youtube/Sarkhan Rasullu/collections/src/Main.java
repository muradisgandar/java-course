import java.util.*;

public class Main {

    public static void main(String[] args) {


        HashMap<User,String> hashmap = new HashMap<>();
        hashmap.put(new User("Sarkhan",25),"Sarkhan");

        User u1 = new User("Murad",18);
        User u2 = new User("Murad",18);
        User u3 = new User("Ali",18);



        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u3.hashCode());
        hashmap.put(u1,"Murad");
        hashmap.put(u2,"Murad");
        hashmap.put(u3,"Murad");
        System.out.println(hashmap);





//        List<User> list = Arrays.asList(new User("Sarkhan",25),new User("Murad",18),new User("Murad",18));
//        Set<User> userSet = new TreeSet<>(list);
//
//        System.out.println(userSet);

//        List<Integer> list = Arrays.asList(1,2,45,23);
//
//        Comparator<Integer> comparator = new Comparator<Integer>(){
//
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        };
//        Collections.sort(list,comparator);
//        System.out.println(list);




//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("word1");
//        list.add("word2");
//        list.add("word3");
//
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }
//
//        for(String s:list){
//            System.out.println(s);
//        }

//        Test<String> list = new Test<>();
//        for(String s:list){
//
//        }




    }


}
