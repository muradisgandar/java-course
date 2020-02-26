package awesome.maps.bean;

public class Teacher extends Person implements Comparable<Teacher> {

    public Teacher(Integer id, String name, String surname) {
        super(id, name, surname);
    }

//    @Override
//    public int hashCode() {
//        System.out.println("teacher hashcode " + super.getName());
//        return 1;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("equals called " + obj);
//        if (obj instanceof Teacher) {
//            Teacher t = (Teacher) obj;
//            if (t.getId() == this.getId()) {
//                return true;
//            }
//        }
//        return false;
//    }

    @Override
    public int compareTo(Teacher o) {
        if (this.getId() > o.getId()) {
            System.out.println(this.getId() + " vs   "+ o.getId());
            System.out.println("1 returned");
            return 1;
        } else if (this.getId() == o.getId()) {
            System.out.println(this.getId() + "  vs  "+ o.getId());
            System.out.println("0 returned");
            return 0;
        } else {
            System.out.println("-1 returned");
            return -1;
        }

//        return o.getId()- this.getId();    // descending order
//        return this.getId()- o.getId();     // ascending order
    }
}