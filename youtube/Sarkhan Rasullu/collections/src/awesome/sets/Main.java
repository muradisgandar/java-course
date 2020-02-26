package awesome.sets;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add(null);

        for(String s : set){
            System.out.println(s);
        }


    }
}
