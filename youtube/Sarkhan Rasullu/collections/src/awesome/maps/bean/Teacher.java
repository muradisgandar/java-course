package awesome.maps.bean;

public class Teacher extends Person {

    public Teacher(Integer id, String name, String surname) {
        super(id, name, surname);
    }

    @Override
    public int hashCode(){
        System.out.println("teacher hashcode "+super.getName());
        return 1;
    }
}